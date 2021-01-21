package sandeep.algoExpert.com;
import java.util.Arrays;
import java.util.Scanner;
public class CountingSort_1 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number  ?   ?  ");
		int num=sc.nextInt();
		int arr[]=new int[num];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
	int[] result=countSort(arr);
	for(int i=0;i<result.length;i++)
	{
		System.out.print(result[i]+" ");
	}
		
	}
	private static int[]  countSort(int[] arr)
	{
		int arr1=arr.length;
		int count[]=new int[arr1];
		for(int i=0;i<arr1;i++)
		{
			count[i]=0;
		}
		for(int i=0;i<arr.length;i++)
		{
			count[arr[i]]=count[arr[i]]+1;
		}
		return count;
	}
}
/*
 * Enter Any Number  ?   ?  
5
1
1
3
2
1
0 3 1 1 0 
*/
