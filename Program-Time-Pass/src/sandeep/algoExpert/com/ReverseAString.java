package sandeep.algoExpert.com;

import java.util.Scanner;

public class ReverseAString
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any String ? ");
		String str=sc.next();
		reverse(str);	
	}
	private static void reverse(String str)
	{
		char[] reverseTry=str.toCharArray();
		for(int i=reverseTry.length-1;i>=0;i--)
		{
			System.out.print(reverseTry[i]);
		}
	}
}
/*
Enter Any String ? 
dcba
abcd
*/