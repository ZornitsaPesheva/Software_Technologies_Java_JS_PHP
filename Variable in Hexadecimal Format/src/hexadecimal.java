import java.util.Scanner;

/**
 * Created by zorry on 26.10.2016 г..
 */
public class hexadecimal {
    public static void main(String[] args){

        Scanner reader = new Scanner(System.in);
        String hex = reader.next();
        int i = Integer.decode(hex);
        System.out.println(i);
    }
}
