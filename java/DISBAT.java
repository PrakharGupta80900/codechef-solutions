import java.util.*;

class Codechef {

    static int[] parent;
    static int[] maxScore;

    static int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    static void union(int x, int y) {

        int chefX = find(x);
        int chefY = find(y);

        // Same chef
        if (chefX == chefY) {
            System.out.println("Invalid query!");
            return;
        }

        // Chef with higher maximum score wins
        if (maxScore[chefX] > maxScore[chefY]) {
            parent[chefY] = chefX;
        } 
        else if (maxScore[chefY] > maxScore[chefX]) {
            parent[chefX] = chefY;
        }
        // Tie -> no change
    }

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {

            int n = sc.nextInt();

            parent = new int[n + 1];
            maxScore = new int[n + 1];

            for (int i = 1; i <= n; i++) {
                parent[i] = i;
            }

            // Each chef initially owns one dish
            for (int i = 1; i <= n; i++) {
                maxScore[i] = sc.nextInt();
            }

            int q = sc.nextInt();

            while (q-- > 0) {

                int type = sc.nextInt();

                if (type == 0) {

                    int x = sc.nextInt();
                    int y = sc.nextInt();

                    int chefX = find(x);
                    int chefY = find(y);

                    if (chefX == chefY) {
                        System.out.println("Invalid query!");
                    } else {
                        union(chefX, chefY);
                    }

                } else {

                    int x = sc.nextInt();

                    System.out.println(find(x));
                }
            }
        }
    }
}