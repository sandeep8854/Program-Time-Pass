package sandeep.algoExpert.com;
import java.util.Scanner;
public class InsertionSort_1HackerRank
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Number ?  ? ");
		int n=sc.nextInt();
		int arr1[]=new int[n];
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		insertionMethod(n,arr1);
	}
	private static void insertionMethod(int n, int[] arr1) 
	{
		int a=arr1[n-1];
		for(int i=n-2;i>=0;i--)
		{
			if(arr1[i]<a)
			{
				arr1[i+1]=a;
				print(arr1);
				break;
			}
			else
			{
				arr1[i+1]=arr1[i];
				print(arr1);
				if(i==0)
				{
					arr1[i]=a;
					print(arr1);
				}
			}
		}
	}
	private static void print(int[] arr)
	{
		for(int i:arr)
		{
			System.out.print(i+" ");
		//	System.out.println();
		}
		System.out.println();
		
	}
}
/*
Enter Array Number ?  ? 
5
1
2
4
5
3
1 2 4 5 5 
1 2 4 4 5 
1 2 3 4 5 
*/