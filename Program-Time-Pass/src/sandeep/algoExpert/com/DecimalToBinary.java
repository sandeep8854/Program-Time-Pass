package sandeep.algoExpert.com;
import java.util.Scanner;
public class DecimalToBinary 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Decimal Number Like As 3855 etc. ? ?");
		int number=sc.nextInt();
		String binary=" ";
		while(number>0)
		{
			int reminder=number%2;
			binary=reminder+binary;
			number=number/2;
		}
		System.out.println("Binary Equivalent =: " +binary);
	}
}
/*
Enter Decimal Number Like As 3855 etc. ? ?
3855
Binary Number is =: 111100001111 
*/