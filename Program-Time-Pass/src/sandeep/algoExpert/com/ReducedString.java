package sandeep.algoExpert.com;
import java.util.Scanner;
public class ReducedString 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any String ? ?");
		StringBuilder sandeepString=new StringBuilder(sc.nextLine());
		for(int i=1;i<sandeepString.length();i++)
		{
			if(sandeepString.charAt(i)==sandeepString.charAt(i-1))
			{
				sandeepString.delete(i-1, i+1);
				i=0;
			}
		}
		if(sandeepString.length()==0)
		{
			System.out.println("Empty String");
		}
		else
			System.out.println(sandeepString);	
	}
}
/*
Enter Any String ? ?
baab
Empty String
*/
/*Enter Any String ? ?
aaabccddd
abd
*/