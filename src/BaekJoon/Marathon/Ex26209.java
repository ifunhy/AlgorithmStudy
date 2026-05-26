package BaekJoon.Marathon;

import java.util.Scanner;

public class Ex26209 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = -1;
        boolean isBit = true;

        for (int i = 0; i < 8; i++) {
            input = sc.nextInt();

            if (input == 9) {
                isBit = false;
            }
        }

        if (isBit == true) {
            System.out.println("S");
        } else {
            System.out.println("F");
        }
    }
}
