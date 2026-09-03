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
            int D=sc.nextInt();
            int d=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            
            int km=d*D;
            if(km>=10 && km<21){
                System.out.println(a);
            }else if(km>=21 && km<42){
                System.out.println(b);
            }else if(km>=42){
                System.out.println(c);
            }else{
                System.out.println(0);
            }
        }
	}
}
