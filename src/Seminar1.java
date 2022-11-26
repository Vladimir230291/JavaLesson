import java.time.LocalDateTime;
import java.util.Scanner;

public class Seminar1 {

    public static void arr() {
        // посчитать количество стоящих друг за другом единиц
        int count = 0;
        int max = 0;
        int[] arr = new int[]{1, 1, 0, 1, 1, 1, 1, 1, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) count++;

            else {
                if (count > max) max = count;
                count = 0;
            }
        }
        if (count > max) max = count;
        count = 0;
        System.out.println(max);
    }


    public static void hello() {
        // запросить имя и вывести привествие в соответвии с временем суток
        int hour;
        hour = LocalDateTime.now().getHour();
// Создается "сканер" для дальнейнего считывания вводимых данных
        Scanner sc = new Scanner(System.in);
// Вывод сообщение в консоль пользователю
        System.out.printf("Введите имя: ");
// считывание введеной информации
        String name = sc.nextLine();

        if (hour > 5 && hour < 12) System.out.printf("Доброе утро " + name);
        else if (hour > 12 && hour < 18) System.out.printf("Добрый день " + name);
        else if (hour > 18 && hour < 13) System.out.printf("Доброй ночи " + name);
        else System.out.printf("Доброй ночи " + name);
        sc.close();
    }

}
