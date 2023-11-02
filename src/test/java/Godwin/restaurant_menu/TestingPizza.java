package Godwin.restaurant_menu;

import Godwin.restaurant_menu.entities.Pizza;
import Godwin.restaurant_menu.entities.Table;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeAll;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
@Slf4j
public class TestingPizza {

    private static AnnotationConfigApplicationContext ctx;

    static Pizza checkPizza;
    @BeforeAll
    static void beforeAll(){
        log.info("Confirm entry");
        ctx = new AnnotationConfigApplicationContext(RestaurantMenuApplication.class);
        checkPizza = (Pizza) ctx.getBean(Pizza.class);
    }
}
