import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[] phrases = new String[]
                {
                        "Excellent product.",
                        "Such a great product.",
                        "I always use that product.",
                        "Best product of its category.",
                        "Exceptional product.",
                        "I can’t live without this product."
                };

        String[] events = new String[]
                {
                        "Now I feel good.",
                        "I have succeeded with this product.",
                        "Makes miracles. I am happy of the results!",
                        "I cannot believe but now I feel awesome.",
                        "Try it yourself, I am very satisfied.",
                        "I feel great!"
                };

        String[] authors = new String[]
                {
                        "Diana", "Petya", "Stella", "Elena",
                        "Katya", "Iva", "Annie", "Eva"
                };

        String[] cities = new String[]
                {
                        "Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"
                };

        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.next());
        Random rnd = new Random();

        for (int i = 1; i <= number; i++)
        {
            int n = 0;
            n = rnd.nextInt(phrases.length);
            String phrase = phrases[n];
            n = rnd.nextInt(events.length);
            String eventx = events[n];
            n = rnd.nextInt(authors.length);
            String author = authors[n];
            n = rnd.nextInt(cities.length);
            String city = cities[n];
            System.out.println(phrase + " " + eventx + " "+
                    author + " - " + city);
        }
    }
}
