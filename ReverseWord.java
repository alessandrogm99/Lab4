import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String again;

        do {
            System.out.print("Enter words separated by spaces ending with the word quit: ");
            String line = scanner.nextLine();
            if (line.trim().isEmpty()) line = scanner.nextLine(); // handle leftover newline

            String[] words = line.trim().split("\\s+");
            for (int i = 0; i < words.length; i++) {
                String w = words[i];
                if (w.equalsIgnoreCase("quit")) break;

                // move the first character to the end
                String moved = (w.length() > 0) ? w.substring(1) + w.charAt(0) : w;

                // manual reverse with for loop (no library reverse)
                String rev = "";
                for (int j = moved.length() - 1; j >= 0; j--) {
                    rev += moved.charAt(j);
                }

                if (rev.equals(w)) 
                    System.out.println(w + " works");
                else 
                    System.out.println(w + " does not work");
            }

            System.out.print("Enter yes to process another line? ");
            again = scanner.nextLine().trim();
        } while (again.equalsIgnoreCase("yes") || again.equalsIgnoreCase("y"));
    }
}
