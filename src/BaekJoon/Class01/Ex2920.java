package BaekJoon.Class01;
import java.util.Scanner;

public class Ex2920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        String result = "";

        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();
        sc.close();

        for (int i = 0; i < (arr.length - 1); i++)
        {
            if (arr[i] == arr[i + 1] - 1)
                result = "ascending";
            else if (arr[i] == arr[i + 1] + 1)
                result = "descending";
            else {
                result = "mixed";
                break;
                }
        }
        System.out.println(result);
    }
}
