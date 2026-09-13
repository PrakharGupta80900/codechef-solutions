import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String a = sc.next();
            String b = sc.next();

            int score = 0;
            boolean canChoose = false;

            for (int i = 0; i < n; i++) {
                if (a.charAt(i) != b.charAt(i)) {
                    canChoose = true;
                } else if (a.charAt(i) == '1') {
                    score++;
                }
            }

            if (canChoose || score % 2 == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}