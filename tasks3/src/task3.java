import java.util.ArrayList;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Шиншилла");
        animals.add("Крокодил");
        animals.add("Лев");
        animals.add("Медведь");
        animals.add("Слон");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Что вы хотите сделать?");
            System.out.println("1 - Показать список всех животных");
            System.out.println("2 - Добавить животное");
            System.out.println("3 - Удалить животное");
            System.out.println("4 - Очистить список");
            System.out.println("5 - Проверить, есть ли животное в зоопарке");
            System.out.println("0 - Выход");

            int command = scanner.nextInt();
            scanner.nextLine();

            switch (command) {
                case 1:
                    printAnimals(animals);
                    break;
                case 2:
                    System.out.println("Введите название животного:");
                    String toAdd = scanner.nextLine();
                    animals.add(toAdd);
                    System.out.println(toAdd + " добавлен(а) в список.");
                    break;
                case 3:
                    if (!animals.isEmpty()) {
                        System.out.println("Введите название животного:");
                        String toRemove = scanner.nextLine();
                        if (animals.remove(toRemove)) {
                            System.out.println(toRemove + " удалён(а) из списка.");
                        } else {
                            System.out.println("Такого животного в зоопарке нет.");
                        }
                    } else {
                        System.out.println("Список пуст, удалять нечего.");
                    }
                    break;
                case 4:
                    if (animals.isEmpty()) {
                        System.out.println("Список и так пуст.");
                    } else {
                        animals.clear();
                        System.out.println("Список очищен.");
                    }
                    break;
                case 5:
                    System.out.println("Введите название животного:");
                    String target = scanner.nextLine();
                    if (animals.contains(target)) {
                        System.out.println("Да, такое животное живёт в зоопарке.");
                    } else {
                        System.out.println("Нет, такого животного в зоопарке нет.");
                    }
                    break;
                case 0:
                    System.out.println("Выход");
                    return;
                default:
                    System.out.println("Извините, такой команды пока нет.");
                    break;
            }
        }
    }

    private static void printAnimals(ArrayList<String> animals) {
        System.out.println("В зоопарке " + animals.size() + " животных:");
        for (String animal : animals) {
            System.out.println(animal);
        }
    }
}
