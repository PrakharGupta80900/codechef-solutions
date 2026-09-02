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
            
            long[] a=new long[n];
            
            for(int i=0;i<n;i++){
                a[i]=sc.nextLong();
                
            }
            
            long sum=Math.abs(a[0]);
            
            for(int i=1;i<n;i++){
                sum+=Math.abs(a[i]+a[i-1]);
            }
            
            sum+=Math.abs(a[n-1]);
            
            System.out.println(sum/2);
            
            
            
            
        }
	}
}
