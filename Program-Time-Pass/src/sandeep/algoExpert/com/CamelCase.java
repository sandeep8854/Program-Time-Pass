package sandeep.algoExpert.com;
import java.util.Scanner;
public class CamelCase 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String ?  ?");
		String str1=sc.next();
		int count=camelCase(str1);
		System.out.println(count);
	}
	private static int camelCase(String str1)
	{
		int countString=1;
		for(int i=0;i<str1.length();i++)
		{
			 String letter = Character.toString(str1.charAt(i));
	            if (letter == letter.toUpperCase())
	            {
	            	countString++;
	            }
		}
	return countString;
	}
}
/*
Enter The String ?  ?
sandeepIsHacker
3
*/