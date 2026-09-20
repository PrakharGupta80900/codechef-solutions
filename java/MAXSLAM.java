import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();

        int needed = Math.max(0, 25 - X);
        int years = (needed + 3) / 4;

        System.out.println(years);
	}
}
