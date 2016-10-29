import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Map<String, String> phonebook = new HashMap<String, String>();
        String entry = " ";
        Scanner scanner = new Scanner(System.in);
       // String[] phone = new String[3];
        while (!entry.equals("END"))
        {
            entry = scanner.nextLine();
            String[] phone = entry.split(" ");
            if (phone[0].equals("A"))
            {
                String name = phone[1];
                String ph =  phone[2];
              //  phonebook[name] = ph;
                phonebook.put(name, ph);
            }
            else if (phone[0].equals("S"))
            {
                if (phonebook.containsKey(phone[1]))
                {
                    String name = phone[1];
                    System.out.printf("%s -> %s",phone[1], phonebook.get(name));
                    System.out.println();
                }
                else
                {
                    System.out.printf("Contact %s does not exist.", phone[1]);
                    System.out.println();
                }
            }
        }
    }
}
