package Godwin.restaurant_menu.entities;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

import java.time.LocalTime;
import java.util.List;
@ToString

public class Order {

    private int orderNum;
    private List<Pizza> pizza;
    private List<Drink> drink;
    private List<Topping> toppings;
    private OrderStatus mealStatus;
    private int numOfSeats;
    private LocalTime orderTime;
    private double coperto;

    public Order(int orderNum, List<Pizza> pizza, List<Drink> drink, List<Topping> toppings, OrderStatus mealStatus,
                 int numOfSeats, LocalTime orderTime, double coperto) {
        this.orderNum = orderNum;
        this.pizza = pizza;
        this.drink = drink;
        this.toppings = toppings;
        this.mealStatus = mealStatus;
        this.numOfSeats = numOfSeats;
        this.orderTime = orderTime;
        this.coperto = coperto;
    }

/*    public static double getTotal()
    {

    }*/
}
