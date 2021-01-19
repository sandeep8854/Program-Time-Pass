package sandeep.algoExpert.com;
import java.util.Scanner;
public class PangramHackerRank
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Sentence ?  ?");
		String str=sc.next();
		boolean rs=pangram(str);
		if(rs==true)
			System.out.println("pangram");
		else
			System.out.println("not pangram");
		
	}
	private static boolean pangram(String str)
	{
		if(str.length()<26)
			return false;
		str=str.toLowerCase();
		for(char ch='a';ch<='z';ch++)
		{
			if(str.indexOf(ch)==-1)
				return false;
		}
		return true;
	}
}
