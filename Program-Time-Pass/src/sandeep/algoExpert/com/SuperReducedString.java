package sandeep.algoExpert.com;

import java.util.Scanner;
public class SuperReducedString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any String ? ?");
		String str1=sc.next();
		reduceString(str1);
	}
	private static void reduceString(String str1) 
	{
		for(int i=1;i<str1.length();i++)
		{
			if(str1.charAt(i)==str1.charAt(i-1))
			{
				str1=str1.substring(0, i-1)+str1.substring(i+1);
				i=0;
			}
		}
			if(str1.length()==0)
			{
				System.out.println("Empty String");
			}
			else
				System.out.println(str1);
		
	}
}
