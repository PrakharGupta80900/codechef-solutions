import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	static final long MOD = 998244353L;
    static final int MAXN = 200000;

    static long[] inv = new long[MAXN + 1];
    static long[] pow2 = new long[MAXN + 1];

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        inv[1] = 1;

        for (int i = 2; i <= MAXN; i++) {
            inv[i] = MOD - (MOD / i) * inv[(int)(MOD % i)] % MOD;
        }
        pow2[0] = 1;

        for (int i = 1; i <= MAXN; i++) {
            pow2[i] = pow2[i - 1] * 2 % MOD;
        }
        while (T-- > 0) {

            int N = sc.nextInt();
            ArrayList<Integer> groups = new ArrayList<>();

            int start = 1;

            while (start <= N) {

                int end = Math.min(N, 2 * start - 1);

                int size = end - start + 1;

                groups.add(size);

                start *= 2;
            }

            int M = 0;

            for (int c : groups) {
                M = Math.max(M, c);
            }
            int g = groups.size();

            long[] currentCombination = new long[g];
            long[] prefix = new long[g];
            for (int i = 0; i < g; i++) {
                currentCombination[i] = 1;
                prefix[i] = 1;
            }

            long badSum = 0;
            for (int r = 0; r < M; r++) {

                long product = 1;

                for (int i = 0; i < g; i++) {

                    int c = groups.get(i);

                    if (r > 0 && r <= c) {
                        currentCombination[i] =
                                currentCombination[i]
                                * (c - r + 1)
                                % MOD
                                * inv[r]
                                % MOD;

                        prefix[i] += currentCombination[i];

                        if (prefix[i] >= MOD) {
                            prefix[i] -= MOD;
                        }
                    }

                    product = product * prefix[i] % MOD;
                }

                badSum += product;

                if (badSum >= MOD) {
                    badSum -= MOD;
                }
            }

            long total = pow2[N];

            long answer =
                    (M * total % MOD - badSum + MOD) % MOD;

            System.out.println(answer);
        }
    }
}
