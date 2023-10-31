package Godwin.restaurant_menu.entities;

import lombok.AllArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;

//@AllArgsConstructor
@ToString
public class TableOne extends Tables implements PlaceOrder {

    public TableOne(@Value("${}") int tableNum, TableStatus tableStatus, MealStatus mealStatus) {
        super(tableNum, tableStatus, mealStatus);
    }

    @Override
    public int tableNum() {
        return this.tableNum;
    }
}
