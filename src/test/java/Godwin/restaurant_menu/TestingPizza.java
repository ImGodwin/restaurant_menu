package Godwin.restaurant_menu;

import Godwin.restaurant_menu.entities.Pizza;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
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

    @Test
    public void confirmPrice()
    {
        Pizza pizza = (Pizza) ctx.getBean("getPizzaOne");
        Pizza pizza2 = (Pizza) ctx.getBean("getPizzaTwo");
        assertAll(
                () -> assertTrue(pizza.getPrice() > 3),
                ()-> assertNotNull(pizza),
                ()-> assertNotSame(pizza, pizza2)
        );
    }

    @Test
    public void checkList()
    {
        List<Pizza> p = Stream.of((Pizza) ctx.getBean("getPizzaOne"), (Pizza) ctx.getBean("getPizzaTwo"),
                (Pizza) ctx.getBean("getPizzaThree")).toList();
        double total = 0;
        for (int i = 0; i < p.size(); i++) {
            total += p.get(i).getPrice();
        }
        assertTrue(p.size() > 0);
        assertEquals(17.47, total);
    }

    @AfterAll
    static void afterAll() {
        ctx.close();
    }
}
