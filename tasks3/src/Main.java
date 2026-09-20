import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> speeds = new ArrayList<>();
        speeds.add(120);
        speeds.add(75);
        speeds.add(42);
        speeds.add(60);
        speeds.add(110);
        speeds.add(20);

        int sum = 0;
        for (int speed : speeds) {
            sum += speed;
        }

        int averageSpeed = sum / speeds.size();
        System.out.println("Средняя скорость равна " + averageSpeed + " км/ч");
    }
}