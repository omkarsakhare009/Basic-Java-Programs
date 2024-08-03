import java.util.Scanner;

public class SwapBitwiseOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st no=");
        int a = sc.nextInt();

        System.out.println("Enter 2nd no=");
        int b = sc.nextInt();

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("a=" + a);
        System.out.println("b=" + b);

    }

}
