package sandeep.algoExpert.com;
import java.util.Arrays;
import java.util.Scanner;

public class median
{
	public static void main(String[] args)
	{
		Scanner scanBySandeep=new Scanner(System.in);
		System.out.println("Enter Any Length ?");
		int length=scanBySandeep.nextInt();
		int arr[]=new int[length];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scanBySandeep.nextInt();
		}
		double result1=median(arr);
		System.out.println("median  is " + result1);	
	}

	private static double median(int[] b) 
	{
		Arrays.sort(b);
		int size=b.length;
		int middle=size/2;
		if(b.length%2==1)
		{
			return b[middle];
		}
		else
		{
			return (double)(b[middle-1]+b[middle])/2;
		}	
	}
}
/*
Enter Any Length ?
7
0
1
2
4
6
5
3
median  is 3.0
*/