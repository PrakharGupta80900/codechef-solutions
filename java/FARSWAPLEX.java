import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();

            int[] P = new int[N];
            int[] pos = new int[N + 1];

            for (int i = 0; i < N; i++) {
                P[i] = sc.nextInt();
                pos[P[i]] = i;
            }
            List<Integer>[] graph = new ArrayList[N + 1];

            for (int i = 1; i <= N; i++) {
                graph[i] = new ArrayList<>();
            }

            int[] indegree = new int[N + 1];
            for (int x = 1; x < N; x++) {
                if (pos[x] < pos[x + 1]) {
                    graph[x].add(x + 1);
                    indegree[x + 1]++;
                } else {
                    graph[x + 1].add(x);
                    indegree[x]++;
                }
            }
            PriorityQueue<Integer> pq = new PriorityQueue<>();

            for (int i = 1; i <= N; i++) {
                if (indegree[i] == 0) {
                    pq.add(i);
                }
            }

            int[] ans = new int[N];
            int idx = 0;

            while (!pq.isEmpty()) {
                int u = pq.poll();

                ans[idx++] = u;

                for (int v : graph[u]) {
                    indegree[v]--;

                    if (indegree[v] == 0) {
                        pq.add(v);
                    }
                }
            }
            for (int i = 0; i < N; i++) {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
        sc.close();
	}
}
