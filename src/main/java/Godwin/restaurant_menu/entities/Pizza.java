package Godwin.restaurant_menu.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@AllArgsConstructor
@ToString
@Getter
public class Pizza {

    private String name;
    private int calories;
    private double price;
    //private List<Topping> topping;


  
}
