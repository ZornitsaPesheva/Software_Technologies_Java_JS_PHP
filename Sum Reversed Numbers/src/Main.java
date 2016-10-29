import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        Arrays.asList(numbers);
        List<Integer> newNumbers = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++)
        {
            String rev = Reverce(numbers[i]);
            int reversed = Integer.parseInt(rev);
            newNumbers.add(reversed);
        }
        int sum = 0;
        for (int num : newNumbers)
        {
            sum += num;
        }
        System.out.println(sum);
    }

    private static String Reverce(int v)
    {
        String str = v + "";
        return new StringBuilder(str).reverse().toString();
    }
}
