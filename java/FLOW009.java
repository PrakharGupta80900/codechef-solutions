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
            int quant=sc.nextInt();
            double price=sc.nextInt();
            
            if(quant<=1000){
                System.out.println(quant*price);
            }else{
                double sum=quant*price;
                double dis=sum/100*10;
                System.out.println(sum-dis);
            }
        }
	}
}
