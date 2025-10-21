import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Конвертер длины: \n1) км -> мили  \n2) мили -> км \n3) кг -> фунты  \n4) фунты -> кг \n5) Цельсий -> Фаренгейт  \n6) Фаренгейт -> Цельсий");
        System.out.print("Выберите опцию: ");
        int option = sc.nextInt();

        System.out.print("Введите значение: ");
        double value = sc.nextDouble();
        я
        if(value < 0) {
            System.out.println("Значение не может быть отрицательным!");
        } else {
            if(option == 1) {
                System.out.println(value + " км = " + (value * 0.621371) + " миль");
            } else if(option == 2) {
                System.out.println(value + " миль = " + (value / 0.621371) + " км");
            } else if(option == 3) {
                System.out.println(value + " кг = " + (value * 2.20462) + " фунтов");
            } else if(option == 4) {
                System.out.println(value + " фунты = " + (value / 2.20462) + " кг");
            } else if(option == 5) {
                System.out.println(value + " °C = " + ((value * 9/5) + 32) + " °F");
            } else if(option == 6) {
                System.out.println(value + " °F = " + ((value - 32) * 5/9) + " °C");
            } else {
                System.out.println("Неверная опция");
            }
        }

    }
}


