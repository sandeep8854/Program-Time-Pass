package sandeep.algoExpert.com;

import java.util.Scanner;

public class LargestPermtation 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter N Value ?  ? ");
		int number=sc.nextInt();
		System.out.println("Enter K Value ?  ? ");
		int k=sc.nextInt();
		int arr[]=new int[number];
		int index[]=new int[number+1];
		for(int i=0;i<number;i++)
		{
			arr[i]=sc.nextInt();
			index[arr[i]]=i;
		}
		for (int i = 0; i < number && k > 0; i++)
		{
	        if (arr[i] == number - i)
	        {
	            continue;
	        }
	        arr[index[number - i]] = arr[i];
	        index[arr[i]] = index[number - i];
	        arr[i] = number - i;
	        index[number - i] = i;
	        k--; 
		}	
		  for (int i = 0; i < number; i++)
		  {
		        System.out.print(arr[i] + " ");
		  }
	}
}
/*
Enter N Value ?  ? 
3
Enter K Value ?  ? 
1
2
1
3
3 1 2 
 */
/*
Enter N Value ?  ? 
5
Enter K Value ?  ? 
1
4
2
3
5
1
5 2 3 4 1 
 */


