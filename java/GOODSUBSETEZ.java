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
            
            int[] count=new int[31];
            
            for(int i=0;i<n;i++){
                int x=sc.nextInt();
                
                int msb=31-Integer.numberOfLeadingZeros(x);
                count[msb]++;
            }
            
            int answer=0;
            
            for(int i=0;i<31;i++){
                answer=Math.max(answer,count[i]);
            }
            System.out.println(answer);
        }
	}
}
