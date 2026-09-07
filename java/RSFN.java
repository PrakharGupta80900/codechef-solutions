import java.util.*;

class Codechef {
    static final long MOD = 1000000007;

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        int[] arr = new int[n];

        int max = 0;

        // Read array and find maximum Fibonacci index
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            max = Math.max(max, arr[i]);
        }

        // Fibonacci numbers
        long[] fib = new long[max + 1];

        if (max >= 1) {
            fib[1] = 1;
        }

        if (max >= 2) {
            fib[2] = 1;
        }

        for (int i = 3; i <= max; i++) {
            fib[i] = (fib[i - 1] + fib[i - 2]) % MOD;
        }

        // Prefix sum
        long[] prefix = new long[n + 1];

        for (int i = 0; i < n; i++) {
            prefix[i + 1] = (prefix[i] + fib[arr[i]]) % MOD;
        }

        // Answer queries
        while (q-- > 0) {

            int l = sc.nextInt();
            int r = sc.nextInt();

            long ans = (prefix[r] - prefix[l - 1] + MOD) % MOD;

            System.out.println(ans);
        }
    }
}