import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();
            long[] A = new long[N];
            long total = 0;
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextLong();
                total += A[i];
            }
            Arrays.sort(A);

            long ans = 0;
            long largestSum = 0;

            for (int k = 1; k <= N / 2; k++) {

                
                largestSum += A[N - k];

                long redSum = largestSum;
                long blueSum = total - redSum;

                long value =
                    redSum * (N - k) +
                    blueSum * k;

                ans = Math.max(ans, value);
            }
            System.out.println(ans);
        }
	}
}
