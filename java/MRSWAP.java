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
            int[] arr=new int[2*n];
            for(int i=0;i<2*n;i++){
                arr[i]=sc.nextInt();
            }
            int start=0;
            int end=2*n-1;
            while(start<=end){
                if(arr[start]<arr[end]){
                    int temp=arr[start];
                    arr[start]=arr[end];
                    arr[end]=temp;
                }
                start++;
                end--;
            }
            int sum=0;
            for(int i=0;i<n;i++){
                sum+=arr[i];
            }
            System.out.println(sum);
        }
	}
}
