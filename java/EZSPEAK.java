import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        
        while(T-- >0){
            int n=sc.nextInt();
            String s=sc.next();
            int consecutive=0;
            
            for(int i=0;i<n;i++){
                char ch=s.charAt(i);
                if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u'){
                    consecutive++;
                    if(consecutive>=4){
                        System.out.println("No");
                        break;
                    }
                }else{
                    consecutive=0;
                }
            }
            if(consecutive<4){
                System.out.println("Yes");
            }
            
            
        }
	}
}
