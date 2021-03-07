package sandeep.algoExpert.com;
import java.util.Scanner;
public class flopping_Bits 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Length ?  ? ");
		int Len=sc.nextInt();
		for(int i=0;i<Len;i++)
		{
			long result=sc.nextLong();
			long res=flopping(result);
			System.out.println(res);
		}		
	}
	private static long flopping(long result)
	{
		long maxInt=(long)Math.pow(2, 32)-1;
		return maxInt-result;	
	}
}
/*
Enter Any Length ?  ? 
3
2147483647
2147483648
1
4294967294
0
4294967295
*/
