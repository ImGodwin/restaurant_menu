package Godwin.restaurant_menu.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class Pizza {

    private String name;
    private int calories;
    private int price;
    private Topping topping;

    public void setName(String name) {
        this.name = name;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setTopping(Topping topping) {
        this.topping = topping;
    }
}
