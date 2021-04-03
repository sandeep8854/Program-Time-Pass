package sandeep.algoExpert.com;

import java.util.Scanner;

public class CommonFactor
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number ?> ?   ?   ");
		int number1=sc.nextInt();
		System.out.println("Enter Second NUmber ?   ?  ");
		int number2=sc.nextInt();
		
		int result=common(number1,number2);
		System.out.println(result);
		
	}

	private static int common(int x, int y)
	{
		int n=gcd1(x,y);
		int result=0;
		for(int i=1;i<=Math.sqrt(n);i++) {
		if(n%i==0)
		{
			if(n/i==i)
				result=result+1;
			else
				result=result+2;
		}
		}
		
		return result;
		
		
		
	}
	static int gcd1(int a,int b)
	{
		if(a==0)
			return b;
		return gcd1(b%a,b);
	}	

}
