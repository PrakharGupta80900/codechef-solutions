import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int xa=sc.nextInt();
            int xb=sc.nextInt();
            int Xa=sc.nextInt();
            int Xb=sc.nextInt();
            int a=(int)Math.ceil(Xa/xa);
            int b=(int)Math.ceil(Xb/xb);
            System.out.println(a+b);
        }
	}
}
