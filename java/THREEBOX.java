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
            int c=sc.nextInt();
            int d=sc.nextInt();
            
            if(a+b+c<=d){
                System.out.println(1);
            }else if((a+b<=d || b+c<=d || c+a<=d)&& (a+b+c>d) ){
                System.out.println(2);
            }else{
                System.out.println(3);
            }
        }
	}
}
