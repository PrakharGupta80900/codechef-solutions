import java.util.*;

class Codechef {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long k = sc.nextLong();

        long[] a = new long[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        Arrays.sort(a);

        long ans = a[n - 1] - a[0];

        for (int i = 0; i < n - 1; i++) {

            // Small elements are increased by K
            long minHeight = Math.min(a[0] + k, a[i + 1] - k);

            // Large elements are decreased by K
            long maxHeight = Math.max(a[i] + k, a[n - 1] - k);

            // We cannot decrease a[i+1] below 0
            if (a[i + 1] - k < 0) {
                continue;
            }

            ans = Math.min(ans, maxHeight - minHeight);
        }

        System.out.println(ans);
    }
}