import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String pattern = "\\b(?<!\\S)(([a-z0-9\\-\\.]+@[a-z0-9\\-]+\\.[a-z]+([\\.a-z]+)?)\\b)";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(text);
        while(m.find()) {
            System.out.println(m.group());
        }
    }
}
