import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int b=sc.nextInt();
        int p=sc.nextInt();
        int q=sc.nextInt();
        
        System.out.println(Math.max(r*p,b*q));
	}
}
