import java.util.Scanner;

public class SeperateEvenOddAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number=");
        int num = sc.nextInt();
        int evensum = 0;
        int oddsum = 0;
        while (num > 0) {
            int rem = num % 10;
            if (rem % 2 == 0) {
                evensum = evensum + rem;

            }

            else {
                oddsum = oddsum + rem;

            }

            num = num / 10;
        }
        System.out.println("evensum=" + evensum);
        System.out.println("oddsum=" + oddsum);
    }
}
