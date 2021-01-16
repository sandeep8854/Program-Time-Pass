package sandeep.algoExpert.com;
import java.util.Scanner;
public class InsertionSort
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length Of Array ?  ? ");
		int length=sc.nextInt();
		int arr1[]=new int[length];
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		insertionSort(arr1);	
	}
	private static void insertionSort(int[] arr1) 
	{
		for(int i=1;i<arr1.length;i++)
		{
			int value=arr1[i];
			int j=i-1;
			while(j>=0 && arr1[j]>value)
			{
				arr1[j+1]=arr1[j];
				j=j-1;
			}
			arr1[j+1]=value;
		}
		printArray(arr1);
	}
	private static void printArray(int[] arr1) 
	{
		for(int n:arr1) {
			System.out.println(n+" ");
		}
	}
}
/*
Enter Length Of Array ?  ? 
5
10
15
11
19
09
9 
10 
11 
15 
19 
*/