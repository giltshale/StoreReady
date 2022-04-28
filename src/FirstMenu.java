import java.util.HashMap;
import java.util.Map;

public enum FirstMenu {

    CREATE_USER(1),
    LOG_IN(2),
    END_PROGRAM(3);
    private int value;
    private static Map map = new HashMap<>();

    private FirstMenu(int value) {
        this.value = value;
    }

    static {
        for (FirstMenu pageType : FirstMenu.values()) {
            map.put(pageType.value, pageType);
        }
    }

    public static FirstMenu valueOf(int chooseValue) {
        return (FirstMenu) map.get(chooseValue);
    }

    public int getValue() {
        return value;
    }
}
