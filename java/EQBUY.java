import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        
        int flour=0;
        int sugar=0;
        
        while(n!=0){
            if(flour<=sugar){
                flour++;
                n-=2;
            }else{
                sugar++;
                n-=1;
            }
        }
        if(flour==sugar){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
	}
}
