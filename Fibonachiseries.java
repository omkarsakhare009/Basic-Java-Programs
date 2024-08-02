import java.util.Scanner;

public class Fibonachiseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a 1st number=");
        int term = sc.nextInt();

        int F0 = 0;
        int F1 = 1;

        for (int i = 3; i <= term; i++) {
            int F2 = F0 + F1;
            System.out.println(F2);
            F0 = F1;
            F1 = F2;

        }

    }
}
