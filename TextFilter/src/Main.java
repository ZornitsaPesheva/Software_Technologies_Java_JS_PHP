import java.util.Scanner;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] banWords = scanner.nextLine().split(", ");

        String text =scanner.nextLine();
        for (String banWord : banWords)
        {
            if (text.contains(banWord))
            {
                int len =  banWord.length();
                char[] charArray = new char[len];
                Arrays.fill(charArray, '*');
                String str = new String(charArray);
                text = text.replace(banWord, str);
            }
        }
        System.out.println(text);
    }
}
