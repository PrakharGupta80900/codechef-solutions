import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    static final long MOD=998244353;
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int[] pos = new int[N + 1];
            for (int i = 1; i <= N; i++) {
                int x = sc.nextInt();
                pos[x] = i;
            }
            long[] dp = new long[N];
            dp[0] = 1;
            for (int i = 1; i < N; i++) {
                long[] ndp = new long[N];
                long[] prefix = new long[N + 1];
                for (int j = 0; j < i; j++) {
                    prefix[j + 1] = (prefix[j] + dp[j]) % MOD;
                }
                if (pos[i] < pos[i + 1]) {
                    for (int j = 0; j <= i; j++) {
                        ndp[j] = prefix[j];
                    }
                } else {
                    for (int j = 0; j < i; j++) {
                        ndp[j] = (prefix[i] - prefix[j] + MOD) % MOD;
                    }
                }
                dp = ndp;
            }
            long answer = 0;
            for (int j = 0; j < N; j++) {
                answer = (answer + dp[j]) % MOD;
            }
            System.out.println(answer);
        }
	}
}
