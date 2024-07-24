import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {

        int temp = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a:");
        int a = sc.nextInt();

        System.out.println("Enter b:");
        int b = sc.nextInt();

        temp = a;

        a = b;

        b = temp;

        System.out.println("a=" + a);
        System.out.println("b=" + b);

    }

}
