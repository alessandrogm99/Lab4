import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // read three numbers
        System.out.print("Number 1 is: ");
        int num1 = scanner.nextInt();

        System.out.print("Number 2 is: ");
        int num2 = scanner.nextInt();

        System.out.print("Number 3 is: ");
        int num3 = scanner.nextInt();

        // print bar chart
        System.out.println("\nNUMBER BAR CHART");
        BarChartMethods.printLabeledBar(1, num1 / 100); 
        BarChartMethods.printLabeledBar(2, num2 / 100);
        BarChartMethods.printLabeledBar(3, num3 / 100);
    }
}

