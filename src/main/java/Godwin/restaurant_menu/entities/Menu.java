package Godwin.restaurant_menu.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class Menu {

    private Pizza pizza;
    private Drink drink;

    public void theOrder(){
        System.out.println("this is your meal");
    }

}
