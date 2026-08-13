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
            int x=sc.nextInt();
            int y=sc.nextInt();
            int diff;
            if(x>y){
                diff=x-y;
            }else{
                diff=y-x;
            }
            if(x==y){
                System.out.println(0);
            }else if(x<y){
                System.out.println(diff);
            }else{
                if(diff%2==0 && x>y){
                    System.out.println(diff/2);
                }else{
                    System.out.println(diff/2+2);
                }
            }
        }
	}
}
