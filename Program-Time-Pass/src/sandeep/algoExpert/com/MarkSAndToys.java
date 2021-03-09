package sandeep.algoExpert.com;
import java.util.Arrays;
import java.util.Scanner;
public class MarkSAndToys
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Array Length ?  ? ");
		int Len=sc.nextInt();
		System.out.println("Enter Any Marks Budget ?  ?");
		int k=sc.nextInt();
		int arr[]=new int[Len];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int result=markAndToysBySandeep(arr,k);
		System.out.println(result);
	}
	private static int markAndToysBySandeep(int[] arr, int k)
	{
		Arrays.sort(arr);
		int maxiNumOfToys=0;
		int sumSomthings=0;
		for(int i=0;i<arr.length;i++)
		{
			if(sumSomthings<=k)
			{
				sumSomthings=sumSomthings+arr[i];
				maxiNumOfToys++;
			}
		}
		return maxiNumOfToys-1;	
	}
}
/*
Enter Any Array Length ?  ? 
7
Enter Any Marks Budget ?  ?
50
1
12
5
111
200
1000
10
4
*/