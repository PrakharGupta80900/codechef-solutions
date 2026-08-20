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
            int n=sc.nextInt();
            int reverse=0;
            while(n>0){
                int digit=n%10;
                reverse=reverse*10+digit;
                n=n/10;
            }
            System.out.println(reverse);
        }
        
	}
}
