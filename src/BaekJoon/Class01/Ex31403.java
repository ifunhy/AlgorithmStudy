package BaekJoon.Class01;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

//public class Ex31403 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int A = sc.nextInt();
//        int B = sc.nextInt();
//        int C = sc.nextInt();
//
//        int num = A + B - C;
//        int result = Integer.parseInt(A + "" + B) - C;
//        String str = String.valueOf(result);
//        System.out.println(num);
//        System.out.println(str);
//    }
//}


public class Ex31403 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String A = br.readLine();
        String B = br.readLine();
        String C = br.readLine();

        System.out.println(Integer.parseInt(A) + Integer.parseInt(B) - Integer.parseInt(C));
        System.out.println(Integer.parseInt(A + B) - Integer.parseInt(C));
    }
}