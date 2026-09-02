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
            long n=sc.nextLong();
            
            long rem=n%3;
            
            if(n==1){
                System.out.println(1);
            }else if(n%2==0){
                System.out.println(3*n/2+1);
            }else{
                System.out.println((3*n-1)/2);
            }
        }
	}
}
