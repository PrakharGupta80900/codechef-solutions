import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        long[][] dp = new long[n][n];

        // Prefix sum for calculating colors
        int[] prefix = new int[n + 1];

        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + arr[i];
        }

        for (int len = 2; len <= n; len++) {

            for (int i = 0; i + len <= n; i++) {

                int j = i + len - 1;
                dp[i][j] = Long.MAX_VALUE;

                for (int k = i; k < j; k++) {

                    int leftColor =
                        (prefix[k + 1] - prefix[i]) % 100;

                    int rightColor =
                        (prefix[j + 1] - prefix[k + 1]) % 100;

                    long smoke =
                        dp[i][k]
                        + dp[k + 1][j]
                        + (long) leftColor * rightColor;

                    dp[i][j] = Math.min(dp[i][j], smoke);
                }
            }
        }

        System.out.println(dp[0][n - 1]);
    }
}