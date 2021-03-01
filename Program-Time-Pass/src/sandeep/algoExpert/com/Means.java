package sandeep.algoExpert.com;
import java.util.Scanner;
public class Means
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		  System.out.println("Enter Any Length ?");
	        int length=sc.nextInt();
	        int arr[]=new int[length];
	        for(int i=0;i<arr.length;i++)
	        {
	            arr[i]=sc.nextInt();
	        }
	        double result=means(arr);
	        System.out.println(" Means is :- " + result);
		
	}

	private static double means(int[] a)
	{
		 double mean=0;
	        int sum=0;
	        int size=a.length;
	        for(int i:a)
	        {
	            sum=sum+i;
	        }
	        mean=(double)sum/size;
	        return mean;
	}
}
/*
Enter Any Length ?
10
64630 
11735 
14216 
99233 
14470 
4978 
73429 
38120 
51135 
67060
 Means is :-  43900.6
*/