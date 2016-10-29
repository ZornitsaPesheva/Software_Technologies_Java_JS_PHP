import java.util.Scanner;
/**
 * Created by zorry on 26.10.2016 г..
 */
public class NumInRevOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String num = (reader.next());
        String reversed = ReverseN(num);
        System.out.print(reversed);
    }

    public static String ReverseN(String n) {
        String rstr = ReverseS(n);
        return rstr;

    }

    public static String ReverseS(String str) {
        char[] charArray = str.toCharArray();
        String reverse = new StringBuilder(new String(charArray)).reverse().toString();
        return new String(reverse);
    }
}
