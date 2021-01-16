package sandeep.algoExpert.com;
import java.util.Scanner;
public class InsertionSort_2 
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
	private static void insertionSort(int[] array) 
	{
		  int shifts = 0;
	        for (int i = 1; i < array.length; i++) {
	            int j = i;
	            int value = array[i];
	            while (j >= 1 && array[j-1] > value) {
	                array[j] = array[j-1];
	                j--;
	                shifts++;
	            }
	            array[j] = value;
	        }
	        System.out.println(shifts);
	}
}
/*
Enter Length Of Array ?  ? 
12
1
1
2
2
3
3
5
5
7
7
9
9
0
*/