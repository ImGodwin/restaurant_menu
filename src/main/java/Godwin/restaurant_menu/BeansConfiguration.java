package Godwin.restaurant_menu;

import Godwin.restaurant_menu.entities.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

@Configuration
@PropertySource("application.properties")
public class BeansConfiguration {

   @Bean
   Pizza getPizzaOne(){
       return new Pizza("Pizza Marghertita(Tomato, Cheese)", 1104, 4.99, getToppingOne().getName());
   }

   @Bean
   @Primary
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
    Random randomNum = new Random();

   @Bean
   Order getOrder(@Value("${coperto}") double coperto)
   {
       List<Pizza> pizzaOne = new ArrayList<>();
       List<Drink> drinkOne = new ArrayList<>();
       List<Topping> toppingOne = new ArrayList<>();

       pizzaOne.add(getPizzaOne());
       drinkOne.add(getDrinkOne());
       toppingOne.add(getToppingOne());

       return new Order(randomNum.nextInt(1, 10), pizzaOne, drinkOne, toppingOne, OrderStatus.READY,
               3, LocalTime.now(), coperto);
   }


    @Bean
    Table getTable(@Value("${coperto}") double coperto){

       List<Order> orderOne = new ArrayList<>();
       orderOne.add(getOrder(coperto));
       return new Table(randomNum.nextInt(1, 50), TableStatus.OCCUPIED, orderOne, 5);
    }



    @Bean(name = "getMenu")
    //@Scope("prototype")
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
