import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);

        int F1 = sc.nextInt();
        int P1 = sc.nextInt();
        int F2 = sc.nextInt();
        int P2 = sc.nextInt();

        int d1 = Math.abs(F1 - P1);
        int d2 = Math.abs(F2 - P2);

        if (d1 < d2) {
            System.out.println("First");
        } else if (d2 < d1) {
            System.out.println("Second");
        } else {
            System.out.println("Both");
        }
	}
}
