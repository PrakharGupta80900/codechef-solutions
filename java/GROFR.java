import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        int count = 0;
        
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1' && (i == 0 || s.charAt(i - 1) == '0')) {
                count++;
            }
        }

        System.out.println(count);
    }
}