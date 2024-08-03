import java.util.Scanner;

public class CharacterIncrement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Character=");
        char ch = sc.next().charAt(0);

        for (char i = 'A'; i <= ch; i++) {

            for (char j = 'A'; j <= ch; j++) {
                System.out.print(j + "  ");
            }
            System.out.println("");
        }
    }
}

/*
 * Enter a Character=
 * F
 * A B C D E F
 * A B C D E F
 * A B C D E F
 * A B C D E F
 * A B C D E F
 * A B C D E F
 */