import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        
        int f=sc.nextInt();
        
        int costa=x*12;
        int costb=y*12+f;
        
        System.out.println(Math.min(costa,costb));
	}
}
