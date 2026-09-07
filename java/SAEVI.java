import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long k = sc.nextLong();

        long sum = 0;
        long limit = 2 * k;

        for (int i = 0; i < n; i++) {
            long x = sc.nextLong();

            if (i % 2 == 0 && x > limit) {
                sum += x;
            }
        }

        System.out.println(sum);
    }
}