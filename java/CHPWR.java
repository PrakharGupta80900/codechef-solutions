import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int P = sc.nextInt();
        int R = sc.nextInt();
        int C = sc.nextInt();

        double[][] glasses = new double[100][100];

        glasses[0][0] = P;

        for (int r = 0; r < R; r++) {
            for (int c = 0; c <= r; c++) {

                if (glasses[r][c] > 1) {
                    double overflow = glasses[r][c] - 1;

                    glasses[r + 1][c] += overflow / 2;
                    glasses[r + 1][c + 1] += overflow / 2;
                }
            }
        }

        System.out.printf("%.5f%n", Math.min(1.0, glasses[R][C]));
    }
}