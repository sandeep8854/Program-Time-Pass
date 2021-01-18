package sandeep.algoExpert.com;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class QuickSort_1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  the Number of Array ? ");
		int number=sc.nextInt();
		int arr1[]=new int[number];
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		int[] result=quickSortingSandeep(arr1);
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(result[i]+" ");
		}
	}
	private static int[] quickSortingSandeep(int[] arr)
	{
		    List<Integer> left = new ArrayList<Integer>();
	        List <Integer> equal = new ArrayList<Integer>();
	        List <Integer> right = new ArrayList<Integer>();
	        int pivot = arr[0];
	        for(int i = 0;i < arr.length;i++)
	        {
	            if(arr[i]<pivot)
	            {
	                left.add(arr[i]);
	            }
	            else if(arr[i]==pivot)
	            {
	                equal.add(arr[i]);
	            }
	            else if(arr[i]>pivot)
	            {
	                right.add(arr[i]);
	            }
	        }
	        List<Integer> newList = new ArrayList<Integer>();
	        newList.addAll(left);
	        newList.addAll(equal);
	        newList.addAll(right);
	        int[] array = new int[newList.size()];
	        for (int i = 0; i < newList.size(); i++) {
	            array[i] = newList.get(i);
	        }
	        return array;
	}
}
/*
Enter  the Number of Array ? 
5
4
5
3
7
2
3 2 4 5 7 
 */





















