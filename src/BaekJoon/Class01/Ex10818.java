package BaekJoon.Class01;
import java.util.Scanner;

public class Ex10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        int len = n;

        for(; n > 0; n--)
            num[n - 1] = sc.nextInt();

        // 비교
        int min = num[0];
        int max = num[0];
        for (int i = 0; i < len; i++)
        {
            if (num[i] < min)
                min = num[i];
            else if (num[i] > max)
                max = num[i];
        }
        System.out.println(min + " " + max);
    }
}

// 한줄 받고
// 받은 수 만큼 다음 줄에서 후보 받고
// 최대 최소 비교



//String str[];
//str = sc.nextLine().split(" ")