package Godwin.restaurant_menu;

import Godwin.restaurant_menu.entities.Drink;
import Godwin.restaurant_menu.entities.Menu;
import Godwin.restaurant_menu.entities.Pizza;
import Godwin.restaurant_menu.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Configuration
public class BeansConfiguration {

   @Bean
   @Primary
   Pizza getPizzaOne(){
       return new Pizza("Pizza Marghertita(Tomato, Cheese)", 1104, 4.99, getToppingOne().getName());
   }

   @Bean
   Pizza getPizzaTwo(){
       return new Pizza("Hawaian Pizza(Tomato, Cheese, Ham, Pineapple)", 1024, 6.49, getToppingTwo().getName());
   }

    @Bean
    Pizza getPizzaThree(){
        return new Pizza("Salami Pizza(Tomato, Cheese, Salami)", 1160, 5.99, getToppingThree().getName());
    }

    @Bean
    Drink getDrinkOne(){
        return new Drink("Lemonade", 128, 1.29);
    }

    @Bean
    @Primary
    Drink getDrinkTwo(){
        return new Drink("Water", 0, 1.29);
    }

    @Bean
    Drink getDrinkThree(){
        return new Drink("Wine", 607, 7.49);
    }

    @Bean
    Topping getToppingOne(){
       return new Topping("Cheese", 92, 0.69);
    }

    @Bean
    Topping getToppingTwo(){
        return new Topping("Ham", 35, 0.99);
    }

    @Bean
    Topping getToppingThree(){
        return new Topping("Onions", 22, 0.69);
    }




    @Bean(name = "getMenu")
    Menu menu(){

        List<Pizza> l1 = new ArrayList<>();
        List<Drink> l2 = new ArrayList<>();
        List<Topping> l3 = new ArrayList<>();

        l1.add(getPizzaOne());
        l1.add(getPizzaTwo());
        l1.add(getPizzaThree());

        l2.add(getDrinkOne());
        l2.add(getDrinkTwo());
        l2.add(getDrinkThree());

        l3.add(getToppingOne());
        l3.add(getToppingTwo());
        l3.add(getToppingThree());

       return new Menu(l1, l2, l3);
}


}
