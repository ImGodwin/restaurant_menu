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

}
