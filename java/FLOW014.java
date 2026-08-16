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
            double hd=sc.nextDouble();
            double cc=sc.nextDouble();
            double ts=sc.nextDouble();
            
            if(hd>50&&cc<0.7&&ts>5600){
                System.out.println(10);
            }else if(hd>50 && cc<0.7&& ts<=5600){
                System.out.println(9);
            }else if(cc<0.7 && ts>5600 && hd<=50){
                System.out.println(8);
            }else if(hd>50 && cc>=0.7 && ts>5600){
                System.out.println(7);
            }else if(hd>50 || cc<0.7 || ts>5600){
                System.out.println(6);
            }else{
                System.out.println(5);
            }
        }
	}
}
