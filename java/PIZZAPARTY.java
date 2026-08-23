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
        
        int slices=((a+1)*4+b*3);
        if(slices%8==0){
            System.out.println(slices/8);
        }else{
            System.out.println(slices/8+1);
        }
	}
}
