import java.io.*;
import java.util.*;

class Codechef {

    public static void main(String[] args) throws Exception {

        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st =
            new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] cost = new int[N + 1];

        st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= N; i++) {
            cost[i] = Integer.parseInt(st.nextToken());
        }

        /*
         * dp[k] = minimum number of segments needed
         * after processing the current prefix, using k skips.
         *
         * rem[k] = maximum remaining stamina among states
         * having dp[k] segments.
         */

        int INF = N + 1;

        int[] dp = new int[K + 1];
        int[] rem = new int[K + 1];

        Arrays.fill(dp, INF);
        Arrays.fill(rem, -1);

        dp[0] = 1;
        rem[0] = S;

        for (int i = 1; i <= N; i++) {

            int x = cost[i];

            int[] newDp = new int[K + 1];
            int[] newRem = new int[K + 1];

            Arrays.fill(newDp, INF);
            Arrays.fill(newRem, -1);

            for (int k = 0; k <= K; k++) {

                if (dp[k] == INF)
                    continue;

                int segments = dp[k];
                int stamina = rem[k];

                // -----------------------
                // Option 1: Skip enemy
                // -----------------------
                if (k < K) {

                    if (segments < newDp[k + 1] ||
                       (segments == newDp[k + 1] &&
                        stamina > newRem[k + 1])) {

                        newDp[k + 1] = segments;
                        newRem[k + 1] = stamina;
                    }
                }

                // Enemy cannot be defeated
                if (x > S)
                    continue;

                // -----------------------
                // Option 2: Fight
                // -----------------------
                if (stamina >= x) {

                    int ns = stamina - x;

                    if (segments < newDp[k] ||
                       (segments == newDp[k] &&
                        ns > newRem[k])) {

                        newDp[k] = segments;
                        newRem[k] = ns;
                    }
                }

                // -----------------------
                // Option 3: Potion + fight
                // -----------------------
                int ns = S - x;
                int nseg = segments + 1;

                if (nseg < newDp[k] ||
                   (nseg == newDp[k] &&
                    ns > newRem[k])) {

                    newDp[k] = nseg;
                    newRem[k] = ns;
                }
            }

            dp = newDp;
            rem = newRem;
        }

        int answer = INF;

        for (int k = 0; k <= K; k++) {
            answer = Math.min(answer, dp[k]);
        }

        System.out.println(answer == INF ? -1 : answer - 1);
    }
}