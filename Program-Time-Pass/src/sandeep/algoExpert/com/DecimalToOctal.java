package sandeep.algoExpert.com;
import java.util.Scanner;
public class DecimalToOctal 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Decimal Number  Number ? ? ");
		int number=sc.nextInt();
		String octal=" ";
		while(number>0)
		{
			int reminder=number%8;
			octal=reminder+octal;
			number=number/8;
		}
		System.out.println("Octal Equivalent := " +octal);
	}
}
/*
Enter The Decimal Number  Number ? ? 
56
Octal Number is := 70 
*/