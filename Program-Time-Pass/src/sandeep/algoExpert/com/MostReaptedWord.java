package sandeep.algoExpert.com;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class MostReaptedWord 
{
	public static void main(String[] args)
	{
	/*	System.out.println("Enter The Sentence ?  ?");
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		MostReaptedWord mrw=new MostReaptedWord();
		System.out.println(mrw.mostreaptedword(str1));
		*/
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter Any Sentence ?");
		String str=sc1.nextLine();
		String st=mostreaptedword(str);
		System.out.println(st);
	}
	static String mostreaptedword(String s)
	{
		String[] splitted=s.split(" ");
		List<String> listString=Arrays.asList(splitted);
		Set<String> setString=new HashSet<String>(listString);
		int count=0;
		int maxCount=1;
		String maxReapted=null;
		for(String imp:setString)
		{
			count=Collections.frequency(listString, imp);
			if(count>maxCount)
			{
				maxCount=count;
				maxReapted=imp;		
			}
		}	
		return maxReapted;
	}
}
/*
Enter The Sentence ?  ?
san san is is is is is 
is
*/