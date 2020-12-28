package sandeep.algoExpert.com;

import java.util.Scanner;

public class ReverseString_03 {

	public static void main(String[] args)
	{
		System.out.println("Enter string to reverse:");
		 
		 Scanner read = new Scanner(System.in);
		 String sandeepstr = read.nextLine();
		 
		 StringBuilder sb = new StringBuilder(sandeepstr);
		 
		 System.out.println("Reversed string is:"+sb.reverse().toString());
		 }
	}

