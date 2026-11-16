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
        
        char a=s.charAt(0);
        char b=s.charAt(2);
        char c=s.charAt(4);
        StringBuilder sb=new StringBuilder();
        sb.append(a);
        sb.append(b);
        sb.append(c);
        System.out.println(sb);
    }
}
