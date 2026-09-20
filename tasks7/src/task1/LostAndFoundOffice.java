package task1;

import java.util.ArrayList;

public class LostAndFoundOffice {
    private final ArrayList<Object> things = new ArrayList<>();

    /** Принимает объект любого класса. */
    public void put(Object element) {
        things.add(element);
    }

    /** Проверяет наличие вещи в бюро находок. */
    public boolean check(Object target) {
        if (target == null) {
            return false;
        }
        for (Object object : things) {
            if (object.equals(target)) {
                return true;
            }
        }
        return false;
    }
}
