package Godwin.restaurant_menu.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@AllArgsConstructor

@Getter
public class Menu {

    private List<Pizza> pizza;
    private List<Drink> drink;
    private List<Topping> topping;


    @Override
    public String toString() {
        pizza.forEach(System.out::println);
        System.out.println("<<<<<<<<Drinks>>>>>>>>>");
        drink.forEach(System.out::println);
        System.out.println("<<<<<<<<<<toppings>>>>>>>");
        topping.forEach(System.out::println);
        return "";
    }
}
