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
            int count=0;
            while(n%3!=0){
                if((n+1)%3==0){
                    n=n+1;
                    count++;
                }else{
                    n=(n/5+1) * 5;
                    count++;
                }
                
            }
            System.out.println(count);
        }
        
	}
}
