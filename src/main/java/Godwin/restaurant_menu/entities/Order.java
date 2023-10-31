package Godwin.restaurant_menu.entities;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

import java.util.List;
@ToString
@PropertySource("application.properties")
public class Order {

    private int orderNum;
    private List<Pizza> pizza;
    private List<Drink> drink;
    private List<Topping> toppings;
    private OrderStatus mealStatus;
    private int numOfSeats;
    private double orderTime;
    private double totalCost;

    public Order(int orderNum, List<Pizza> pizza, List<Drink> drink, List<Topping> toppings,
                 OrderStatus mealStatus, int numOfSeats, double orderTime, @Value("${total.cost}") double totalCost) {
        this.orderNum = orderNum;
        this.pizza = pizza;
        this.drink = drink;
        this.toppings = toppings;
        this.mealStatus = mealStatus;
        this.numOfSeats = numOfSeats;
        this.orderTime = orderTime;
        this.totalCost = totalCost;
    }
}
