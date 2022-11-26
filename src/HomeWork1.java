import java.util.ArrayList;
import java.util.Scanner;

public class HomeWork1 {
    public static void task1() {
//        Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите значение для вычисления треугольного числа и факториала: ");
        int number = sc.nextInt();

        System.out.printf("Факториал: %d, Треугольное число:  %d", fact(number), summ(number));
        System.out.println();

    }

    public static int summ(int a) {
        int sum = 0;
        for (int i = 0; i <= a; i++) {
            sum = sum + i;
        }
        return sum;

    }

    public static int fact(int a) {
        if (a > 0) {
            int b = 1;
            for (int i = 1; i <= a; i++) {
                b = b * i;
            }
            return b;
        } else return 1;
    }

    public static void task2() {
        // Вывести все простые числа от 1 до 1000
        ArrayList<String> list = new ArrayList<>();

        for (int i = 2; i <= 1000; i++) {
            boolean isPrimeNumber = true;

            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }

            if (isPrimeNumber) {
                list.add(String.valueOf(i));
            }
        }
        String s = list.toString().replace("[", "").replace("]", "");
        System.out.println("Простые числа: " + s);
    }


    // калькурятор
    public static void task3() {
        float result;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Choose math operator(*,/,+,-): ");
        String ch = sc.next();


        switch (ch) {
            case "*":
                result = num1 * num2;
                System.out.print("result = " + result);
            case "/":
                if (num2 == 0) System.out.print("division by zero");
                else {
                    result = num1 / num2;
                    System.out.print("result = " + result);
                }
            case "+":
                result = num1 + num2;
                System.out.print("result = " + result);
            case "-":
                result = num1 - num2;
                System.out.print("result = " + result);
        }

    }

}





