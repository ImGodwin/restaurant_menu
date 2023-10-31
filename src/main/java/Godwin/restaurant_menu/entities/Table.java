package Godwin.restaurant_menu.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Table {

    int tableNum;
    private TableStatus tableStatus;
    private Order order;
    private int numOfSeats;

    public Table(int tableNum, TableStatus tableStatus, Order order, int numOfSeats) {
        this.tableNum = tableNum;
        this.tableStatus = tableStatus;
        this.order = order;
        this.numOfSeats = numOfSeats;
    }
}
