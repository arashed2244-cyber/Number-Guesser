import java.util.Scanner;

public class AssignmentFour {
    public static void main(String[] args) {
        System.out.println("Enter an integer between 1 and 1,000,000: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        int low = 1;
        int high = 1000000;
        if (input <= high && input >= low) {
            System.out.println("I am guessing your number is: " + guess(low, high));
        }

    }

    public static int guess(int low, int high) {
        if (low == high) {
            return low;
        } else {
            int midpoint = (low + high) / 2;
            System.out.println("Is your number: " + midpoint + "? Enter 1 for Yes otherwise enter any other number");
            Scanner scan = new Scanner(System.in);
            int out = scan.nextInt();
            if (out == 1) {
                return midpoint;
            } else {
                System.out.println(
                        "Enter 1 if your number is greater than: " + midpoint + " otherwise enter any other number");
                Scanner nextScan = new Scanner(System.in);
                int nextOut = nextScan.nextInt();
                if (nextOut == 1) {
                    low = midpoint + 1;
                    return guess(low, high);
                } else {
                    high = midpoint - 1;
                    return guess(low, high);
                }
            }

        }
    }
}
