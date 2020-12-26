package sandeep.algoExpert.com;

import java.util.Scanner;

public class ReverseNumber 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number ? ?");
		int number=sc.nextInt();
		int reverse=0;
		do {
			int reminder=number%10;
			reverse=reverse*10+reminder;
			number=number/10;
		}
		while(number!=0);
		System.out.println("Reverse Number is : " +reverse);	
	}

}
