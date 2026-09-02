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
            int K = sc.nextInt();

            long[] A = new long[N];

            for (int i = 0; i < N; i++) {
                A[i] = sc.nextLong();
            }

            int remaining = N - K;

            // Sum of first window
            long windowSum = 0;

            for (int i = 0; i < remaining; i++) {
                windowSum += A[i];
            }

            long maxSum = windowSum;

            // Slide the window
            for (int i = remaining; i < N; i++) {
                windowSum += A[i];
                windowSum -= A[i - remaining];

                maxSum = Math.max(maxSum, windowSum);
            }

            System.out.println(maxSum);
        }

        sc.close();
	}
}
