import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number=");
        int num = sc.nextInt();

        while (num > 0) {
            int remainder = num % 10;
            System.out.print(remainder + " ");
            num = num / 10;

        }

    }
}
