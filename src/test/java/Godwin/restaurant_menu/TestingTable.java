package Godwin.restaurant_menu;

import Godwin.restaurant_menu.entities.Table;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;

@SpringBootTest
@Slf4j
public class TestingTable {

    private static AnnotationConfigApplicationContext ctx;

    static Table checkTable;
    @BeforeAll
    static void beforeAll(){
        log.info("Confirm entry");
        ctx = new AnnotationConfigApplicationContext(RestaurantMenuApplication.class);
        checkTable = (Table) ctx.getBean(Table.class);
    }

    @Test
    public void notNull(){
        assertNotNull(checkTable);
    }

    @Test
    public void testIsSame(){
        Table table = ctx.getBean(Table.class);
        assertSame(table, checkTable);
    }

    @AfterAll
    static void afterAll() {
        ctx.close();
    }
}
