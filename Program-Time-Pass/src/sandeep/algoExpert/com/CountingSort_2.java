package sandeep.algoExpert.com;

import java.util.Arrays;
import java.util.Scanner;

public class CountingSort_2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number ?  ?");
		int num=sc.nextInt();
		int arr[]=new int[num];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int[] resultBySandeep=countsort(arr);
		for(int i=0;i<resultBySandeep.length;i++)
		{
			System.out.print(resultBySandeep[i]+ " ");
		}
	}
	private static int[] countsort(int[] arr)
	{
		 int n = arr.length;
	        int k = arr[0];
	        for(int i=1;i<n;i++)
	        {
	            if(arr[i]>k)
	            {
	                k = arr[i];
	            }
	        }
	        int count[] = new int[k+1];
	        for(int i=0;i<n;i++) 
	        {
	            ++count[arr[i]];
	        }
	        for(int i=1;i<k+1;i++)
	        {
	            count[i] = count[i]+count[i-1];
	        }
	        int b[] = new int[n];
	        for(int i=n-1;i>=0;i--)
	        {
	            b[--count[arr[i]]] = arr[i];
	        }
	        for(int i=0;i<n;i++)
	        {
	            arr[i] = b[i];
	        }
	        return arr;
		
	}
}
/*
Enter Any Number ?  ?
5
1
4
2
3
1
1 1 2 3 4 
*/
/*
Enter Any Number ?  ?
10
9
9
58
12
14
1
2
35
6
63
1 2 6 9 9 12 14 35 58 63 
*/
