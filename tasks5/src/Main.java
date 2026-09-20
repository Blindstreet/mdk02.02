import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя работника:");
        WorkCalculator calculator = new WorkCalculator(scanner.next());

        System.out.println("Введите коэффициент в формате 1.5:");
        calculator.coefficient = scanner.nextDouble();

        System.out.println("Введите количество отработанных дней без коэффициента:");
        double hoursWithoutCoefficient = calculator.calculate(scanner.nextInt());

        System.out.println("Введите количество отработанных дней с коэффициентом:");
        double hoursWithCoefficient = calculator.calculateWithCoefficient(scanner.nextInt());

        double allWorkHours = hoursWithoutCoefficient + hoursWithCoefficient;
        System.out.printf("Работник %s отработал %.2f часов.",
                calculator.getWorkerName(), allWorkHours);
    }
}
class WorkCalculator {

    private int workingHours = 8;   // данные закрыты
    private String workerName;      // данные закрыты
    public double coefficient;      // доступ максимально широкий

    public WorkCalculator(String newName) {  // конструктор должен быть доступен извне пакета
        workerName = newName;
    }

    public String getWorkerName() {
        return workerName;
    }

    public int calculate(int workDays) {
        return workDays * workingHours;
    }

    public double calculateWithCoefficient(int workDays) {
        return workDays * workingHours * coefficient;
    }
}