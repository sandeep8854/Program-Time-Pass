package sandeep.algoExpert.com;
import java.util.Scanner;
public class DecimalToHexaDecimal
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Decimal NUmber ? ?");
		int number=sc.nextInt();
		String hexadecimal=" ";
		while(number>0)
		{
			int reminder=number%16;
			switch(reminder)
			{
			case 10:hexadecimal='A'+hexadecimal;
			break;
			case 11:hexadecimal='B'+hexadecimal;
			break;
			case 12:hexadecimal='C'+hexadecimal;
			break;
			case 13:hexadecimal='D'+hexadecimal;
			break;
			case 14:hexadecimal='E'+hexadecimal;
			break;
			case 15:hexadecimal='F'+hexadecimal;
			break;
			default:hexadecimal=reminder+hexadecimal;
			break;
			}
			number=number/16;
		}
		System.out.println("Hexadecimal Equivalent =: "+hexadecimal);
	}
}
