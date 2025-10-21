import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Конвертер длины: 1) км -> мили  2) мили -> км");
        System.out.print("Выберите опцию: ");
        int option = sc.nextInt();

        System.out.print("Введите значение: ");
        double value = sc.nextDouble();

        if(option == 1) {
            System.out.println(value + " км = " + (value * 0.621371) + " миль");
        } else if(option == 2) {
            System.out.println(value + " миль = " + (value / 0.621371) + " км");
        } else {
            System.out.println("Неверная опция");
        }
    }
}
