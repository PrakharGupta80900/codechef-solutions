import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
        int diff=Math.max(a,b)-Math.min(a,b);
        if(diff<=2){
            System.out.println("Interesting");
        }else{
            System.out.println("boring");
        }
        
        
        
	}
}
