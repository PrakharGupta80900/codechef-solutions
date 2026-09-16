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
        
        if((a+b)%2!=0){
            System.out.println(-1);
        }else{
            System.out.println((a-b)/2);
        }
	}
}
