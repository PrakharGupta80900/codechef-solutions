import java.util.*;

class Codechef {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int w = sc.nextInt();
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int sum = 0;
        int count = 0;

        for (int i = n - 1; i >= 0; i--) {
            sum += arr[i];
            count++;

            if (sum >= w) {
                System.out.println(count);
                return;
            }

            sum += arr[i];
            count++;

            if (sum >= w) {
                System.out.println(count);
                return;
            }
        }

        System.out.println(-1);
    }
}