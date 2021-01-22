package sandeep.algoExpert.com;

import java.util.Scanner;

public class Gemstones 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number ? ");
		int n=sc.nextInt();
		System.out.println("Enter String ?  ?");
		String str=sc.nextLine();
		String arr[]=new String[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.next();
		}
		int result=gemstone(arr);	
		System.out.println(result);
	}
	private static int gemstone(String[] arr) 
	{
		  String[] array ={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		   int count =0;
		   int countActualResult =0;
		   for(int i=0;i<array.length;i++)
		   {
		       count=0;
		       for(int j=0;j<arr.length;j++)
		       {
		           if(arr[j].contains(array[i]))
		           {
		               count++;
		           }
		           if(count==arr.length){
		        	   countActualResult++;
		           }
		       }
		   }
		    return countActualResult;	
	}
}
/*
Enter Any Number ? 
3
Enter String ?  ?
abcdde 
baccd
eeabg
2
*/