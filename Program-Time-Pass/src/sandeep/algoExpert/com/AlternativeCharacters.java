package sandeep.algoExpert.com;

import java.util.Scanner;

public class AlternativeCharacters
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number ?  ?");
		int num=sc.nextInt();
		System.out.println("Enter String ?  ?");
		String str=sc.nextLine();
		//String arr[]=new String[num];
		for(int i=0;i<num;i++)
		{
			str=sc.next();
		}
		alter(str);
	}

	private static void  alter(String str)
	{
		int count=0;
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)==str.charAt(i+1))
			{
				count++;
			}
		}
		System.out.println(count);	
	}
}
