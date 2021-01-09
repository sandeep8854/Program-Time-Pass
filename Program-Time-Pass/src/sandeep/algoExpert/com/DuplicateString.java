package sandeep.algoExpert.com;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class DuplicateString 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Word ? ? ");
		String str1=sc.nextLine();
	//for 1 method	duplicted(str);
		//2 nd method
		duplicated(str1);
		
	/*	  // Given below Input String containing duplicate words
	      String input = "Google is the most popular is is the search engine in the world. Bing comes at number two.";
	      // Converting given  Input String to lowerCase below:
	      input = input.toLowerCase();
	      /* Split the given Input String into words using 
	      built-in split() method below*/
	//      String[] words = input.split(" ");
	//      int length = words.length;
	      // Using for loop 
//	      for( int i=0; i < length; i++)
//	      {
	          // Set count to 1 for every iteration
//	          int count = 1;
//	          for(int j=i+1; j < length; j++)
//	          {
	//              if(words[i].equals(words[j]))
	//              {
//	                  count++;
	                  /* Setting words[j]="0" to avoid 
	                  visited words */
//	                  words[j] = "0";
	//              }
//	          }
//	          if (words[i] != "0" && count > 1)
	//              System.out.print(" "+words[i]+" ");
//	      }	*/
	}

	private static void duplicated(String str1)
	{
		String str2=str1.toLowerCase();
		String[] strArray=str2.split(" ");
		List<String> listofWord=Arrays.asList(strArray);
		HashSet<String> uniquiWord=new HashSet<>(listofWord);
		for(String word:uniquiWord)
		{
			if(Collections.frequency(listofWord, word)>1)
				System.out.println(word+" ");
		}
	}

//1st method
/*	private static void duplicted(String str)
	{
		String str1=str.toLowerCase();
		String[] word=str1.split(" ");
		int length=word.length;
		for(int i=0;i<length;i++)
		{
			int count=1;
			for(int j=i+1;j<length;j++)
			{
				if(word[i].equals(word[j]))
				{
					count++;
					word[j]="0";
				}
			}
			if(word[i]!="0" && count>1)
				System.out.println(word[i]+" ");
	
		}
	}*/
}
/*
Enter Any Word ? ? 
san san dsam is is san san is  the is san deeo the
san 
is 
the 
*/
