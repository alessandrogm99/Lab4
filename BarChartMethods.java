public class BarChartMethods {
    // prints a bar of stars with the given length
    public static void printStars(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    // prints a label with a number and the corresponding stars
    public static void printLabeledBar(int num, int value) {
        System.out.print("Number " + num + ": ");
        printStars(value);
    }
}
