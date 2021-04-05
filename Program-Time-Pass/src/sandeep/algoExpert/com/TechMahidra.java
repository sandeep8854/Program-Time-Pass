package sandeep.algoExpert.com;
import java.util.Scanner;
public class TechMahidra
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Array Length ?  ? ");
	int len=sc.nextInt();
	int sandeepArray[]=new int[len];
	
	for(int i=0;i<sandeepArray.length;i++)
	{
		sandeepArray[i]=sc.nextInt();
	}
	int result=methodBySandeep(sandeepArray);	
	System.out.println(result);	
	}

	private static int methodBySandeep(int[] a)
	{
		int diff=0;
		int n=a.length;
		for(int i=0;i<n-1;i++)
		{
			diff=Math.max(diff,a[i]-a[i+1]);
		}
		return diff;
	}
}
/*
Enter Array Length ?  ? 
5
10
11
7
12
14
4
*/