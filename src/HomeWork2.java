import java.util.Objects;

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
}