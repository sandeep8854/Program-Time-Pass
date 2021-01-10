package sandeep.algoExpert.com;
import java.util.Scanner;
public class BinaryToDecimal
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Binary Number ?");
		long BinNumber=sc.nextLong();
		long decimal=0;
		int count=0;
		while(BinNumber>0)
		{
			long reminder=BinNumber%10;
			decimal=decimal+reminder*power(2,count);
			count++;
			BinNumber=BinNumber/10;
		}
		System.out.println("Decimal Equivalent:" + decimal);
	}
	private static long power(int num, int p)
	{
		int pw=1;
		while(p>0)
		{
			pw=pw*num;
			p--;
		}
		return pw;
	}
}
/*
Enter The Binary Number ?
111100001111
Decimal Number=:3855
*/