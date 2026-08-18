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
            char ch=Character.toLowerCase(sc.next().charAt(0));
        
            if(ch=='b'){
                System.out.println("BattleShip");
            }else if(ch=='c'){
                System.out.println("Cruiser");
            }else if(ch=='d'){
                System.out.println("Destroyer");
            }else if(ch=='f'){
                System.out.println("Frigate");
            }
            
        }
        
	}
}
