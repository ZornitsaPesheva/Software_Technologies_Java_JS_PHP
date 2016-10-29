import static java.lang.Math.toIntExact;
import java.util.Scanner;

/**
 * Created by zorry on 26.10.2016 г..
 */
public class EngNameLastDigit {
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        String n = (reader.next());

        String lastDig = LastDigit(n);
        System.out.println(lastDig);
    }

    private static String LastDigit(String n)
    {
        char[] num = n.toCharArray();
        int last = Integer.parseInt(n.substring(num.length - 1));
        String digName = "";
        switch (last)
        {
            case 1:
                digName = "one";
                break;
            case 2:
                digName = "two";
                break;
            case 3:
                digName = "three";
                break;
            case 4:
                digName = "four";
                break;
            case 5:
                digName = "five";
                break;
            case 6:
                digName = "six";
                break;
            case 7:
                digName = "seven";
                break;
            case 8:
                digName = "eight";
                break;
            case 9:
                digName = "nine";
                break;
            case 0:
                digName = "zero";
                break;
        }
        return digName;
    }
}
