package Godwin.restaurant_menu;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MyRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(RestaurantMenuApplication.class);
        System.out.println(ctx.getBean("getTable"));
        ctx.close();
    }
}
