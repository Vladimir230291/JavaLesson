import java.io.IOException;
import java.util.Objects;
import java.util.logging.*;

public class HomeWork2 {
    public static StringBuilder task1(String text) {
        StringBuilder sb = new StringBuilder();
        sb.append("select * from students where ");
        String replaceText = text.replace("{", "").replace("}", "")
                .replace(":", "=").replace("\"", " ")
                .replace(",", "").trim();
        String[] arr = replaceText.split(" ");

        for (int i = 0; i < arr.length; i++) {
            if (Objects.equals(arr[i], "name")){
                sb.append(arr[i] + " ").append(arr[i + 1] + " ").append(arr[i + 2] + " ");}
            else if (Objects.equals(arr[i], "country"))
                sb      .append("and ")
                        .append(arr[i] + " ")
                        .append(arr[i + 1] + " ")
                        .append(arr[i + 2] + " ");
            else if (Objects.equals(arr[i], "city"))
                sb      .append("and ")
                        .append(arr[i] + " ")
                        .append(arr[i + 1] + " ")
                        .append(arr[i + 2] + " ");
            else if (Objects.equals(arr[i], "age"))
                if (!Objects.equals(arr[i + 2], "null"))
                    sb      .append("and ")
                            .append(arr[i] + " ")
                            .append(arr[i + 1] + " ")
                            .append(arr[i + 2] + " ");
        }
        return new StringBuilder(sb.toString().trim());
    }

    public static void task2 () throws IOException {
        Logger log = Logger.getLogger(HomeWork2.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        log.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        int temp;
        boolean isSorted = false;

        int[] num = {1, 78, 48, 5, 22, 10, 3};
        while (!isSorted) {
            log.log(Level.INFO,"Вход в цикл While");
            isSorted = true;
            for (int i = 0; i < num.length - 1; i++) {
                if (num[i] > num[i + 1]) {
                    log.log(Level.WARNING,"Пемещение индексов массива");
                    isSorted = false;
                    temp = num[i];
                    num[i] = num[i + 1];
                    num[i + 1] = temp;
                }
            }
        }
        for (int res: num) {
            System.out.printf("%d ",res);
            }
    }
}
