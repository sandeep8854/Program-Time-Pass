package sandeep.algoExpert.com;
import java.util.Scanner;
public class ReverseStringREturn 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any String ?  ?");
		String str=sc.next();
		String str1=reverse(str);
		System.out.println(str1);
	}
	private static String reverse(String str) 
	{
		String revString="";
		char[] arr=str.toCharArray();
		for(int i=str.length()-1;i>=0;i--)
		{
			revString=revString+str.charAt(i);
		}
		return revString;
	}
}
/*
Enter Any String ?  ?
dcba
abcd
*/