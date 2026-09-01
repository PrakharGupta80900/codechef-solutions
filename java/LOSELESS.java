import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int m = sc.nextInt();
            int n = sc.nextInt();

            if (m >= n) {
                System.out.println(m - n);
            } else {
                System.out.println((n - m) % 2);
            }
        }
    }
}