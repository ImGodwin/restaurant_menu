package Godwin.restaurant_menu.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@AllArgsConstructor
@ToString
@Getter
@Setter
public class Pizza {

    private String name;
    private int calories;
    private double price;
    private String topping;

    public static int checkPrice(int a, int b, int c)
    {
        return a + b + c;
    }
}
