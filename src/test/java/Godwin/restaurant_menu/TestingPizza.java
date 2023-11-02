package Godwin.restaurant_menu;

import Godwin.restaurant_menu.entities.Pizza;
import Godwin.restaurant_menu.entities.Table;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

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

    @Test
    public void notNull(){
        assertNotNull(checkPizza);
    }

    @Test
    public void comparePrice(){
        Pizza p = (Pizza) ctx.getBean("getPizzaOne");
        assertEquals(4.99, p.getPrice());
    }

    @ParameterizedTest
    @CsvSource({"getPizzaOne, 4.99", "getPizzaTwo, 6.49", "getPizzaThree, 5.99"})
    void testParameterizedConfirm(String str, double price){
        Pizza pizza = (Pizza) ctx.getBean(str);
        assertEquals(price, pizza.getPrice());
    }


    @AfterAll
    static void afterAll() {
        ctx.close();
    }
}
