package sandeep.algoExpert.com;
import java.util.Scanner;
public class EvenOddTechMahindra
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Length ?");
		int length=sc.nextInt();
		int arr1[]=new int[length];
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		oddEvenSum(arr1);	
	}
	private static void oddEvenSum(int[] arr1)
	{
		int evenSum=0;
		int oddSum=0;
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]%2==0)
			{
				 evenSum=evenSum+arr1[i];
			}
			else
			{
				oddSum=oddSum+arr1[i];			
			}
		}	
		int evenOddDiffer=oddSum-evenSum;
		System.out.println(evenOddDiffer);
	}
}
/*
Enter Array Length ?
5
10
11
7
12
14
-18
*/
