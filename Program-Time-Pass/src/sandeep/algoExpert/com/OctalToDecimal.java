package sandeep.algoExpert.com;
import java.util.Scanner;
public class OctalToDecimal 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Octal Number ? ? ");
		int number=sc.nextInt();
		int decimal=0;
		int count=0;
		while(number>0)
		{
			int reminder=number%10;
			decimal=decimal+reminder*power(8,count);
			count++;
			number=number/10;
		}
		System.out.println("Decimal Equivalent =: "+decimal);
	}
	private static int power(int n, int p)
	{
		int pw=1;
		while(p>0)
		{
			pw=pw*n;
			p--;
		}
		return pw;
	}
}
/*
Enter The Octal Number ? ? 
763
Decimal Number is =: 499
*/