package sandeep.algoExpert.com;
import java.util.Arrays;
import java.util.Scanner;
public class MinimumAbsoluteDifferenceDifference 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Length ?   ? ");
		int Len=sc.nextInt();
		int arr[]=new int[Len];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int result=minAbsuDiffSandeep(arr);
		System.out.println(result);
	}
	private static int minAbsuDiffSandeep(int[] arr)
	{
		Arrays.sort(arr);

		int minimumDifference = Integer.MAX_VALUE;
//2147483647 Max_Value;
		for (int i = 0; i < arr.length - 1; i++)
		{
		    int difference = arr[i + 1] - arr[i];
		    
		    if (difference < minimumDifference)
		    {
		        minimumDifference = difference;
		        
		        if (minimumDifference == 0)
		        {
		            return 0;
		        }
		    }
		}

		return minimumDifference;
	}
}
/*
Enter Any Length ?   ? 
3
3
-7
0
3
*/