import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String again;

        do {
            System.out.print("Enter temperature and unit (ex: 100 F or 0 C): ");
            double value = scanner.nextDouble();
            char unit = scanner.next().charAt(0);

            // validate input unit
            while (unit != 'C' && unit != 'c' && unit != 'F' && unit != 'f') {
                System.out.print("Enter C or F: ");
                unit = scanner.next().charAt(0);
            }

            double result;
            char outUnit;

            if (unit == 'F' || unit == 'f') {   // Fahrenheit to Celsius
                result = (value - 32) * 5.0 / 9.0;
                outUnit = 'C';
            } else {                            // Celsius to Fahrenheit
                result = (value * 9.0 / 5.0) + 32.0;
                outUnit = 'F';
            }

            System.out.printf("Converted temperature: %.1f %c%n", result, outUnit);

            System.out.print("Compute another (yes/no)? ");
            again = scanner.next();
        } while (again.equalsIgnoreCase("yes") || again.equalsIgnoreCase("y"));
    }
}
