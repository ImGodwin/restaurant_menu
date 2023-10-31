package Godwin.restaurant_menu.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;

//@AllArgsConstructor
@Getter
public abstract class Tables {

    private int tableNum;
    private TableStatus tableStatus;
    private MealStatus mealStatus;

}
