import java.util.*;

class Codechef {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            int odd = 0;
            int even = 0;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();

                if (x % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }

            int answer = 2 * Math.min(odd, even);


            if (odd != even) {
                answer++;
            }

            System.out.println(answer);
        }
    }
}