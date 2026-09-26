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
        if(x==8){
            System.out.println("Perfect");
        }else if(x<8){
            System.out.println("Less");
        }else{
            System.out.println("More");
        }
	}
}
