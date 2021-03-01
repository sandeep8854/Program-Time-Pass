package sandeep.algoExpert.com;
import java.util.Scanner;
public class MakingAnagram
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First String  ?   ?");
		String str1=sc.nextLine();
		System.out.println("Enter Second String ?  ? ");
		String str2=sc.nextLine();
		int result=makingAnagramBySandeep(str1,str2);
		System.out.println(result);
	}

	private static int makingAnagramBySandeep(String str1, String str2) 
	{
		int noOfDeletionCount=0;
		int array_1[]=new int[26];
		int array_2[]=new int[26];
		for(int i=0;i<str1.length();i++)
		{
			array_1[str1.charAt(i)-97]++;
		}
		for(int i=0;i<str2.length();i++)
		{
			array_2[str2.charAt(i)-97]++;
		}
		for(int i=0;i<26;i++)
		{
			noOfDeletionCount=noOfDeletionCount+Math.abs(array_1[i]-array_2[i]);
		}
		return noOfDeletionCount;	
	}
}
/*
Enter First String  ?   ?
cde
Enter Second String ?  ? 
abc
4
*/
