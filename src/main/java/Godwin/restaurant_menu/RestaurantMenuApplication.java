package Godwin.restaurant_menu;

import Godwin.restaurant_menu.entities.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import lombok.extern.slf4j.Slf4j;
@SpringBootApplication
public class RestaurantMenuApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestaurantMenuApplication.class, args);


		menuConfigClass();

	}

	public static void menuConfigClass(){
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(RestaurantMenuApplication.class);
		System.out.println(ctx.getBean("getTable"));

		ctx.close();

	}


}
