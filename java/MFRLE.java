import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.toLowerCase();
        s=s.replaceAll("[^a-z]","");
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);   
        }
        char max=' ';
        int maxVal=0;
        
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()>maxVal){
                max=entry.getKey();
                maxVal=entry.getValue();
            }
        }
        
        System.out.println(max);
        
    
	}
}
