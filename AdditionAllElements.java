import java.util.Scanner;

public class AdditionAllElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size");
        int size = sc.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter array index=");
            array[i] = sc.nextInt();
            System.out.println(array[i]);

        }
        int sum = 0;
        for (int i = 0; i < size; i++) {

            sum = sum + array[i];

        }
        System.out.println("Addition=" + sum);

    }
}
