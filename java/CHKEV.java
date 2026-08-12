import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int r=sc.nextInt();
        boolean found=false;
        for(int i=l;i<=r;i++){
            if(i%2==0){
                found=true;
            }
        }
        if(found==true){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        
	}
}
