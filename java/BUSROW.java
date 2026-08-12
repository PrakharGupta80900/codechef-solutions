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
            int n=sc.nextInt();// number of rows
            int m=sc.nextInt();//no. of seats in roww
            int x=sc.nextInt();// my seat
            int row;
            if(x%m==0){
                row=x/m;
            }else{
                row=(x/m)+1;
            }
            int fromFront=row;
            int fromBack=n-row+1;
            System.out.println(Math.min(fromBack,fromFront));
            
            
        }
	}
}
