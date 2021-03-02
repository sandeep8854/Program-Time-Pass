package sandeep.algoExpert.com;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class GamesOfThronesPalindromRearraged
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any String ?  ? ");
		String str=sc.nextLine();
		GamesOfThronesBySandeep(str);	
	}
	private static void GamesOfThronesBySandeep(String str) 
	{
		Set<Character> set=new HashSet();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(set.contains(ch))
			{
				set.remove(ch);
			}
			else
			{
				set.add(ch);
			}
		}
		if(set.size()<=1)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}	
	}
}
/*
Enter Any String ?  ? 
aabbccdd
YES
*/
/*
Enter Any String ?  ? 
aaabbbb
YES
*/