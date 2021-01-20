package sandeep.algoExpert.com;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class WeightedString_2
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Any String ?  ? ");
        String s = in.next();
        System.out.println("Enter Number Of length Queries  ? ? ");
        int n = in.nextInt();
       
        int countString = 1;
        int prevAsciiVal = 0;
        Set<Integer> numList = new HashSet<Integer>();
        //iterating chars and adding ascii value to hashset
        for(char x : s.toCharArray())
        {
            int asciiVal = x-'a'+ 1;
            if(asciiVal == prevAsciiVal)
            {
            	countString++;
            }
            else 
            {
            	countString = 1;
                prevAsciiVal = asciiVal;
            }
            numList.add(asciiVal * countString); 
        }
        for(int i=0;i<n;i++)
        {
        	int x = in.nextInt();
        	String answer=numList.contains(x) ?"Yes":"No";
        	System.out.println(answer);
        }
        
        
	}
	
}





