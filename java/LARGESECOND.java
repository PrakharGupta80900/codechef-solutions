import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            // Your code goes here
            int largest=0;
            int sec=0;
            
            for(int i=0;i<a.length;i++){
                if(a[i]>largest){
                    sec=largest;
                    largest=a[i];
                }else if(a[i]>sec && a[i]<largest){
                    sec=a[i];
                }
            }
            System.out.println(largest+sec);
            
        }
    }
}
