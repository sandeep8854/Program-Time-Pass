package sandeep.algoExpert.com;
import java.util.Scanner;
public class InsertionSort_1
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
		int count=0;
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
			count++;
		}
		System.out.println(count);
	}
}
