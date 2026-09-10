import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            int[] freq = new int[1440];

            // Arrival times
            for (int i = 0; i < n; i++) {
                int time = sc.nextInt();
                freq[time]++;
            }

            // Departure times
            for (int i = 0; i < n; i++) {
                int time = sc.nextInt();
                freq[time]++;
            }

            int answer = 0;

            for (int i = 0; i < 1440; i++) {
                answer = Math.max(answer, freq[i]);
            }

            System.out.println(answer);
        }
    }
}