package sandeep.algoExpert.com;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class LonelyInteger 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Length ?   ? ");
		int Len=sc.nextInt();
		int arr[]=new int[Len];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int result=lonelyBySandeep(arr);
		System.out.println(result);
	}
	private static int lonelyBySandeep(int[] arr)
	{
		int UniqueNumber=0;
		 for(int i=0; i<arr.length; i++)
		 {
			 UniqueNumber ^= arr[i];
         }
        return UniqueNumber;	
	}
}
/*
Enter Array Length ?   ? 
7
1
2
3
4
3
2
1
4
*/