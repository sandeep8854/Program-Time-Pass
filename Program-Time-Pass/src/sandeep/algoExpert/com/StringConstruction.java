package sandeep.algoExpert.com;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class StringConstruction
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any NUmber ?  ? ");
		int number=sc.nextInt();
		for(int i=0;i<number;i++)
		{
			String str=sc.next();
			int result=stringConstruction(str);
			System.out.println(result);
			
		}	
	}
	private static int stringConstruction(String str) 
	{
		Set<Character> kaiseSandeep=new HashSet<>();
		char[] c=str.toCharArray();
		for(char ch:c)
		{
			kaiseSandeep.add(ch);
		}
		return kaiseSandeep.size();	
	}
}
/*
Enter Any NUmber ?  ? 
2
abcd
4
abab
2
*/