import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        Long n = Long.parseLong(reader.next());
        if (IsPrime(n)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
    private static boolean IsPrime(Long n)
    {
        boolean prime = true;
        if (n <= 1)
        {
            prime = false;
        }
        else
        {
            for (int i = 2; i <= Math.sqrt(n); i++)
            {
                if (n % i == 0)
                {
                    prime = false;
                    break;
                }
            }
        }
        return prime;
    }
}
