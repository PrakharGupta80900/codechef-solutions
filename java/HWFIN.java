import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();

        if (X + 10 * Y >= 100) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}