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
            int[] arr=new int[10];
            for(int i=0;i<10;i++){
                arr[i]=sc.nextInt();
            }
            int count1=0;//for team 2
            for(int i=0;i<9;i+=2){
                if(arr[i]==1){
                    count1++;
                }
            }
            int count2=0;//for team 1
            for(int i=1;i<10;i+=2){
                if(arr[i]==1){
                    count2++;
                }
            }
            if(count1==count2){
                System.out.println(0);
            }else if(count2>count1){
                System.out.println(2);
            }else{
                System.out.println(1);
            }
        }
	}
}
