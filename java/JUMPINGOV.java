import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	static final class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;
        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }
        int nextInt() throws IOException {
            int c;
            do {
                c = read();
            } while (c <= ' ');
            int sign = 1;
            if (c == '-') {
                sign = -1;
                c = read();
            }
            int res = 0;
            while (c > ' ') {
                res = res * 10 + (c - '0');
                c = read();
            }
            return res * sign;
        }
    }
    static class Fenwick {
        int n;
        int[] bit;
        Fenwick(int n) {
            this.n = n;
            bit = new int[n + 1];
        }
        void add(int idx, int val) {
            while (idx <= n) {
                bit[idx] += val;
                idx += idx & -idx;
            }
        }
        int sum(int idx) {
            int res = 0;
            while (idx > 0) {
                res += bit[idx];
                idx -= idx & -idx;
            }
            return res;
        }
    }
    public static void main(String[] args) throws Exception {
        //your code here
        FastScanner fs = new FastScanner();
        StringBuilder out = new StringBuilder();
        int T = fs.nextInt();
        while (T-- > 0) {
            int N = fs.nextInt();
            int[] pos = new int[N + 1];
            for (int i = 1; i <= N; i++) {
                int x = fs.nextInt();
                pos[x] = i;
            }
            long[] invLeft = new long[N + 1];
            Fenwick fw = new Fenwick(N);
            for (int x = 1; x <= N; x++) {
                int p = pos[x];
                long greater = (x - 1L) - fw.sum(p);
                invLeft[x] = invLeft[x - 1] + greater;
                fw.add(p, 1);
            }
            long[] invRight = new long[N + 2];
            fw = new Fenwick(N);
            for (int x = N; x >= 1; x--) {
                int p = pos[x];
                long smallerPosition = fw.sum(p - 1);
                invRight[x] = invRight[x + 1] + smallerPosition;
                fw.add(p, 1);
            }
            long totalInv = invLeft[N];
            long answer = Long.MAX_VALUE;
            long minA = Long.MAX_VALUE;
            for (int R = 1; R <= N; R++) {
                if (R == 1 || pos[R - 1] > pos[R]) {
                    minA = Long.MAX_VALUE;
                }
                int leftSize = R - 1;
                long A =
                        (long) leftSize * (leftSize - 1)
                        - 2L * invLeft[leftSize];
                minA = Math.min(minA, A);
                int rightSize = N - R;
                long B =
                        (long) rightSize * (rightSize - 1)
                        - 2L * invRight[R + 1];
                long cost = totalInv + minA + B;
                answer = Math.min(answer, cost);
            }
            out.append(answer).append('\n');
        }
        System.out.print(out);
    }
}
