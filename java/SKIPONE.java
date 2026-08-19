import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int sum = 0;
            int max = 0;
            int prod = 0;

            for (int i = 0; i < n; i++) {

                sum += arr[i];

                max = Math.max(max, arr[i]);

                // Use coupon on the most expensive item
                if (sum - max <= k) {
                    prod = i + 1;
                } else {
                    break;
                }
            }

            System.out.println(prod);
        }
    }
}