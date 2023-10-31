package Godwin.restaurant_menu.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public abstract class Tables {

    int tableNum;
    private TableStatus tableStatus;
    private MealStatus mealStatus;

    public Tables(int tableNum, TableStatus tableStatus, MealStatus mealStatus) {
        this.tableNum = tableNum;
        this.tableStatus = tableStatus;
        this.mealStatus = mealStatus;
    }
}
