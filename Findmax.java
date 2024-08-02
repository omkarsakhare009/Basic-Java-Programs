import java.util.Scanner;

public class Findmax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("a=");
        int a = sc.nextInt();

        System.out.println("b=");
        int b = sc.nextInt();

        System.out.println("c=");
        int c = sc.nextInt();

        if (a >= b) {
            System.out.println("a is greater");

            if (a >= c) {
                System.out.println("a is greater");
            } else {
                System.out.println("c is greater");

            }
        } else if (b >= c) {
            System.out.println("b is greater");
        } else {
            System.out.println("c is greater");

        }

    }

}
