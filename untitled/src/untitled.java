import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class untitled {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String arr1 = scanner.next();
        String arr2 = scanner.next();
        char[] array1 = arr1.replaceAll(" ", "").toCharArray();
        char[] array2 = arr2.replaceAll(" ", "").toCharArray();
        //     int shorter = 0;

        int min = Math.min(array1.length, array2.length);
        for (int i = 0; i < min; i++)
        {
            if (array1[i] < array2[i] && i < min -1)
            {
                System.out.println(array1.toString());
                System.out.println(array2.toString());
                break;
            }
            else if (array1[i] > array2[i] && i < min - 1)
            {
                System.out.println(array2.toString());
                System.out.println(array1.toString());
                break;
            }
            else
            {
                if (i == min - 1 && array1.length == min)
                {
                    System.out.println(array1.toString());
                    System.out.println(array2.toString());
                }
                else if (i == min - 1 && array2.length == min)
                {
                    System.out.println(array2.toString());
                    System.out.println(array1.toString());;
                }
            }
        }
    }
}
