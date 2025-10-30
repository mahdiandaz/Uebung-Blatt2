package h1;

import java.util.Scanner;

public class H1_main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = s.nextInt();

        if (number > 0) {
            number = number - 10;
        }
        if (number < 0) {
            number = number + 10;
        }

        System.out.println("Result: " + number);

        s.close();
    }
}
