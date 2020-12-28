package sandeep.algoExpert.com;

import java.util.Scanner;

public class ReverseA_String
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any String ?  ?");
		String sandeepstr=sc.nextLine();
		String reverse="";
		
		 for(int i = sandeepstr.length() - 1; i >= 0; i--)
		 {
		 reverse = reverse + sandeepstr.charAt(i);
		 }
		 
		 System.out.println("Reverse String is : " +reverse);
	}
}
/*
Enter Any String ?  ?
sandeep
Reverse String is : peednas
*/
/*
This is done in the “for” loop by obtaining the characters of the original String individually
 from the end by using the “charAt” function of the String class and concatenating them to a new
  String by using the “+” operator.
*/