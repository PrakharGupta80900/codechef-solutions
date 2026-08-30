import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt(); // Amin
            int b = sc.nextInt(); // Bmin
            int c = sc.nextInt(); // Cmin
            int d = sc.nextInt(); // Tmin

            int e = sc.nextInt(); // A
            int f = sc.nextInt(); // B
            int g = sc.nextInt(); // C

            if (e >= a && f >= b && g >= c && e + f + g >= d) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}