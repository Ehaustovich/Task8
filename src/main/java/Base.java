import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i;
        while (true) {
            System.out.println("Выберите операцию: 1 - сложение, 2 - вычитание, 3 - умножение, 4 - деление");
            String inputLine = scanner.nextLine();
            try {
                i = Integer.parseInt(inputLine);
                break;
            } catch (NumberFormatException ex) {
                System.out.println("Неверный формат ввода, введите число");
            }
        }

        double m;
        while (true) {
            System.out.println("Введите 1 число");
            String inputLine = scanner.nextLine();
            try {
                m = Double.parseDouble(inputLine);
                break;
            } catch (NumberFormatException ex) {
                System.out.println("Неверный формат ввода, введите число c плавающей точкой");
            }
        }

        double n;
        while (true) {
            System.out.println("Введите 2 число");
            String inputLine = scanner.nextLine();
            try {
                n = Double.parseDouble(inputLine);
                break;
            } catch (NumberFormatException ex) {
                System.out.println("Неверный формат ввода, введите число c плавающей точкой");
            }
        }

        Calculator calculator = new Calculator(m, n, i);
        calculator.getResult();
        scanner.close();

    }
}
