import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int majority = N / 2 + 1;
        int needed = Math.max(0, majority - K);

        System.out.println(needed);
	}
}
