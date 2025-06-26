package BaekJoon.Class01;
<<<<<<< HEAD

import java.io.*;
import java.util.*;
=======
import java.io.*;
import java.util.StringTokenizer;
>>>>>>> 20f4bd0 (test)

public class Ex2884 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if (M < 45) {
<<<<<<< HEAD
            if (H == 0)
                H = 23;
            else H--;

=======
            H--;
>>>>>>> 20f4bd0 (test)
            M = 60 - (45 - M);
        }
        else {
            M -= 45;
        }
        System.out.println(H + " " + M);
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 20f4bd0 (test)
