package sandeep.algoExpert.com;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class WeightedUniformString
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Any String ?  ? ");
        String s = in.next();
        System.out.println("Enter Number Of Queries  ? ? ");
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
        //determining if hashset contains the testcase
        for(int a0 = 0; a0 < n; a0++) {
            int x = in.nextInt();
            String ans = numList.contains(x) ? "Yes" : "No"; 
            System.out.println(ans);
        }
	}
}
/*
Enter Any String ?  ? 
aaabbbbcccddd
Enter Number Of Queries  ? ? 
5
9
Yes
7
No
8
Yes
12
Yes
5
No
 */

