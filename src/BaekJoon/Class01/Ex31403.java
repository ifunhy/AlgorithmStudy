package BaekJoon.Class01;
import java.util.Scanner;

public class Ex31403 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int num = A + B - C;
        int result = Integer.parseInt(A + "" + B) - C;
        String str = String.valueOf(result);
        System.out.println(num);
        System.out.println(str);
    }
}
