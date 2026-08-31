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
        int a=sc.nextInt();
        int y=sc.nextInt();
        int b=sc.nextInt();
        int d=sc.nextInt();
        
        if((x*a)+(y*b)>=d){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
	}
}
