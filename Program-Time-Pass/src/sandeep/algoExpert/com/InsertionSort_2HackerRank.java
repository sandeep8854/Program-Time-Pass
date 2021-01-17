package sandeep.algoExpert.com;
import java.util.Scanner;
public class InsertionSort_2HackerRank
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
		insertionMethod_2(arr1);		
	}
	private static void insertionMethod_2(int[] arr1)
	{
		 for (int i = 1; i < arr1.length; i++)
		 {
		        int j = i;
		        int value = arr1[i];
		        while (j >= 1 && arr1[j-1] > value) 
		        {
		        	arr1[j] = arr1[j-1];
		            j--;
		        }
		        arr1[j] = value;
		        print(arr1);
		    }	
	}
	private static void print(int[] arr2) 
	{
		for(int ab:arr2)
		{
			System.out.print(ab+" ");
		}
		System.out.println();
	}
}
/*
Enter Array Number ?  ? 
6
1
4
3
5
6
2
1 4 3 5 6 2 
1 3 4 5 6 2 
1 3 4 5 6 2 
1 3 4 5 6 2 
1 2 3 4 5 6 
*/