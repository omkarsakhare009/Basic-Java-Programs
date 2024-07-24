import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter sub1 marks=");
        int sub1 = sc.nextInt();

        System.out.println("Enter sub2 marks=");
        int sub2 = sc.nextInt();

        System.out.println("Enter sub3 marks=");
        int sub3 = sc.nextInt();

        System.out.println("Enter sub4 marks=");
        int sub4 = sc.nextInt();

        System.out.println("Enter sub5 marks=");
        int sub5 = sc.nextInt();

        int total = sub1 + sub2 + sub3 + sub4 + sub5;

        float percentage = total / 5;

        System.out.println("Percentage=" + percentage);

        if (percentage <= 100 && percentage > 90) {
            System.out.println("grade=O ");

        } else if (percentage > 80 && percentage <= 89) {
            System.out.println("grade=A+ ");
        } else if (percentage > 70 && percentage <= 79) {
            System.out.println("grade= A");
        } else if (percentage > 60 && percentage <= 60) {

            System.out.println("grade= B+");

        } else if (percentage > 50 && percentage <= 59) {
            System.out.println("grade= B");

        } else if (percentage > 40 && percentage <= 49) {
            System.out.println("grade= C");
        } else {
            System.out.println("grade= Fail");
        }

    }

}
