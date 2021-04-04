package sandeep.algoExpert.com;
import java.util.Scanner;
public class TotalTechMahidra
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
	private static int methodBySandeep(int[] sandeepArray) 
	{
		int count=0;
		int differene=0;
		for(int i=0;i<sandeepArray.length-1;i++)
		{
			differene=Math.abs(sandeepArray[i]-sandeepArray[i+1]);
			count=count+differene;
		}
		return count;
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
12
*/