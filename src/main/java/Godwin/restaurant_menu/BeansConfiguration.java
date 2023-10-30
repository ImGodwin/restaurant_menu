package Godwin.restaurant_menu;

import Godwin.restaurant_menu.entities.Pizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfiguration {

   @Bean
   Pizza getName(){
       return "Pizza Margherita(tomato, cheese)";
   }

   @Bean
    int getPizzaCalories(){
       return ""
    }
}
