import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        String pattern = scanner.nextLine().toLowerCase();
        int counter = 0;
        int index = input.indexOf(pattern);
        while (index != -1)
        {
            counter++;
            index = input.indexOf(pattern, index + 1);
        }
        System.out.println(counter);
    }
}
