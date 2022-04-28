import java.util.HashMap;
import java.util.Map;

public enum EmployeeMenu {
    PRINT_ALL_CUSTOMERS(1),
    PRINT_ALL_VIP_CUSTOMERS(2),
    CUSTOMERS_WITH_AT_LEAST_ONE_BUY(3),
    MOST_BUYING_CUSTOMER(4),
    ADD_PRODUCT(5),
    CHANGE_PRODUCT_STATUS(6),
    BUY_AS_CLIENT(7),
    MAIN_MENU(8);


    private int value;
    private static Map map = new HashMap<>();

    private EmployeeMenu(int value) {
        this.value = value;
    }

    static {
        for (EmployeeMenu choice : EmployeeMenu.values()) {
            map.put(choice.value, choice);
        }
    }

    public static EmployeeMenu valueOf(int chooseValue) {
        return (EmployeeMenu) map.get(chooseValue);
    }

    public int getValue() {
        return value;
    }
}


