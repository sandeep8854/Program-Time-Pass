package sandeep.algoExpert.com;
import java.util.Scanner;
public class DecimalToAll_Octal_Hexa_Binary 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number ? ");
		int number=sc.nextInt();
		System.out.println("Enter The Base ? ? ");
		int base=sc.nextInt();
		System.out.println(base+ " base equivalent " +convert(number,base));
	}
	private static String convert(int number, int base)
	{
		String st="0123456789ABCDEF";
		String b="";
		while(number>0)
		{
			int reminder=number%base;
			b=st.charAt(reminder)+b;
			number=number/base;
		}
		return b;
	}

}
/*
Enter The Number ? 
50
Enter The Base ? ? 
2
2 base equivalent 110010
=================================
Enter The Number ? 
469
Enter The Base ? ? 
16
16 base equivalent 1D5
=================================
Enter The Number ? 
369
Enter The Base ? ? 
8
8 base equivalent 561

*/