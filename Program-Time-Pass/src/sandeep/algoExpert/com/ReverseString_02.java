package sandeep.algoExpert.com;

import java.util.Scanner;

public class ReverseString_02
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any String ? ?");
		String sandeepstr=sc.nextLine();
		 StringBuilder sb = new StringBuilder();
		 
		 for(int i = sandeepstr.length() - 1; i >= 0; i--)
		 {
		 sb.append(sandeepstr.charAt(i));
		 }
		 
		 System.out.println("Reverse String is :" +sb.toString());
	}
}
