package sandeep.algoExpert.com;

import java.util.Scanner;

public class XOR_String 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First String As A Binary ??  ");
		String str1=sc.next();
		System.out.println("Enter Second String As A Binary ?   ?");
		String str2=sc.next();
		System.out.println(stringBySandeepXOR(str1,str2));
	
	}

	private static String stringBySandeepXOR(String s1, String s2) 
	{
		String result="";
		for(int i=0;i<s1.length();i++)
		{
			
				if(s1.charAt(i) == s2.charAt(i))
					result=result+"0";
				else
					result=result+"1";
		}
		return result;
	}

}
