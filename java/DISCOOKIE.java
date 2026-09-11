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
            int m=sc.nextInt();
            int count=0;
            while(m%n!=0){
                if(m%n>n/2){
                    count++;
                    m++;
                }else{
                    count--;
                    m--;
                }
            }
            System.out.println(count);
        }
	}
}
