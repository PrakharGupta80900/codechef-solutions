import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();

        if (X > 15)
            System.out.println(-1);
        else
            System.out.println(15 - X);
    }
}