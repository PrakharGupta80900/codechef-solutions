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
            int a=sc.nextInt();
            int b=sc.nextInt();
            
            int min=Math.min(a,b);
            int max=Math.max(a,b);
            while(min<max){
                min*=2;
            }
            if(min==max){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
        
	}
}
