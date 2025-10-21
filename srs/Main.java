import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Конвертер длины: \n1) км -> мили  \n2) мили -> км \n3) кг -> фунты  \n4) фунты -> кг");
        System.out.print("Выберите опцию: ");
        int option = sc.nextInt();

        System.out.print("Введите значение: ");
        double value = sc.nextDouble();

        if(option == 1) {
            System.out.println(value + " км = " + (value * 0.621371) + " миль");
        } else if(option == 2) {
            System.out.println(value + " миль = " + (value / 0.621371) + " км");
        } else if(option == 3) {
            System.out.println(value + " кг = " + (value * 2.20462) + " фунтов");
        } else if(option == 4) {
            System.out.println(value + " фунты = " + (value / 2.20462) + " кг");
        } else {
            System.out.println("Неверная опция");
        }
    }
}
