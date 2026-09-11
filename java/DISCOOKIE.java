import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner (System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt(),m=sc.nextInt();
		    if(n>=m){
		        System.out.println(n-m);
		        continue;
		    }
		    int rem=m%n;
		    int a=rem,b=n-rem;
		    System.out.println(Math.min(a,b));
		}

	}
}