import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        
        if(s.contains("c")){
            if(s.contains("a")){
                if(s.contains("t")){
                    System.out.println("Yes");
                }else{
                    System.out.println("no");
                }
            }else{
                System.out.println("no");
            }
        }else{
            System.out.println("No");
        }
	}
}
