package sandeep.algoExpert.com;
import java.util.Scanner;
public class LarryArray_1 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any TestCases  ? ");
		int T=sc.nextInt();
		for(int i=0;i<T;i++)
		{
			System.out.println("Enter Any Array Length ?  ? ");
			int num=sc.nextInt();
			int arr[]=new int[num];
			for(int i1=0;i1<arr.length;i1++)
			{
				arr[i1]=sc.nextInt();
			}
			larryArrayBySandeep(arr);
		}	
	}
	private static  void larryArrayBySandeep(int[] arr) 
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
				
			{
				if(arr[i]>arr[j])
					count++;
			}
		}
		if(count%2==0)
		{
			System.out.println("Yes");
		}
		else	
		{
			System.out.println("No");
		}
	}
}

/*
3
3
1
2
Yes
Enter Any Array Length ?  ? 
4
1
3
4
2
Yes
Enter Any Array Length ?  ? 
5
1
2
3
5
4
No

 */





