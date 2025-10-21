import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double value = 0;
        int option = 0;

        while(true) {
            System.out.println("Конвертер единиц:");
            System.out.println("1) км -> мили  2) мили -> км");
            System.out.println("3) кг -> фунты  4) фунты -> кг");
            System.out.println("5) °C -> °F  6) °F -> °C");
            System.out.print("Выберите опцию: ");

            if(sc.hasNextInt()) {
                option = sc.nextInt();
                if(option >=1 && option <=6) break; 
                else System.out.println("Неверная опция, попробуйте снова.");
            } else {
                System.out.println("Неверный ввод, нужно число от 1 до 6.");
                sc.next(); 
            }
        }

        while(true) {
            System.out.print("Введите значение: ");
            if(sc.hasNextDouble()) {
                value = sc.nextDouble();
                if(value < 0) System.out.println("Значение не может быть отрицательным!");
                else break;
            } else {
                System.out.println("Неверный ввод, введите число.");
                sc.next();
            }
        }

        switch(option) {
            case 1 -> System.out.println(value + " км = " + (value * 0.621371) + " миль");
            case 2 -> System.out.println(value + " миль = " + (value / 0.621371) + " км");
            case 3 -> System.out.println(value + " кг = " + (value * 2.20462) + " фунтов");
            case 4 -> System.out.println(value + " фунты = " + (value / 2.20462) + " кг");
            case 5 -> System.out.println(value + " °C = " + ((value * 9/5) + 32) + " °F");
            case 6 -> System.out.println(value + " °F = " + ((value - 32) * 5/9) + " °C");
        }
    }
}
