package sandeep.algoExpert.com;

import java.util.Scanner;

public class HexaToDecimal
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter HexaDecimal Number ?  ?");
		String st=sc.nextLine();
		int decimal=0;
		int count=0;
		int len=st.length();
		while(len>0)
		{
			int r=0;
			char ch=st.charAt(len-1);
			if(ch>=65 &&ch<=70)
				r=ch-55;
			else if(ch>=97 && ch<=102)
				r=ch-87;
			else
				r=ch-48;
			decimal=decimal+r*power(16,count);
			count++;
			len--;
		}
		System.out.println("Decimal Equivalent =:" + decimal);
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
Enter HexaDecimal Number ?  ?
1D5
Decimal Equivalent =:469
*/