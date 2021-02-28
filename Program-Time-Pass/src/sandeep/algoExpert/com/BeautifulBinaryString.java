package sandeep.algoExpert.com;

import java.util.Scanner;

public class BeautifulBinaryString 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Length  ? ?");
		int n=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter " + n + " of Binary String ?  ? ");
		String binString=sc.nextLine();
		int stepCountBySandeep=0;
		for(int i=0;i<binString.length()-2;i++)
		{
			if(binString.charAt(i)=='0' && binString.charAt(i+1)=='1' && binString.charAt(i+2)=='0')
			{
				stepCountBySandeep++;
				i=i+2;
			}
		}
		System.out.println(stepCountBySandeep);	
	}
}
/*
Enter any Length  ??
7
Enter 7 of Binary String  
0101010
2
*/
/*Enter any Length  ? ?
10
Enter 10 of Binary String ?  ? 
0100101010
3
*/

