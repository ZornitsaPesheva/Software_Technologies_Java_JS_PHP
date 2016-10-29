import java.util.Scanner;

/**
 * Created by zorry on 26.10.2016 г..
 */
public class intToHexAndBin {
    public static void main(String[] args){

        Scanner reader = new Scanner(System.in);
        int num = Integer.parseInt(reader.next());
        int nb = num;
     //   int r = 0;
        int r = 0;
        char rs = 'a';
        String hex = "";
        do
        {
            r = num % 16;
            num /= 16;
            if (r >= 10)
            {
                switch (r)
                {
                    case 10: rs = 'A'; break;
                    case 11: rs = 'B'; break;
                    case 12: rs = 'C'; break;
                    case 13: rs = 'D'; break;
                    case 14: rs = 'E'; break;
                    case 15: rs = 'F'; break;
                }
                hex = rs + hex;
            }
            else
            {
                hex = r + hex;
            }
        } while (num / 16 > 0);
        if (num != 0)
        {
            hex = num + hex;
        }
        //String hex = Integer.toHexString(num);
       // System.out.println(hex.toUpperCase());
        System.out.println(hex);
        System.out.println(Integer.toBinaryString(nb));
    }
}
