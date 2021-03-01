package sandeep.algoExpert.com;

import java.util.Scanner;

public class mode_1 
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
	        double result=modeBySandeep(arr);
	        System.out.println(" Mode is :- " + result);
		
	}

	private static double modeBySandeep(int[] c)
	{
		 int maxValue = 0,maxCount = 0;
	        for(int i=0;i<c.length;i++)
	        {
	            int count=0;
	            for(int j=0;j<c.length;j++)
	            {
	                if(c[i]==c[j])
	                    count++;
	            }
	            if(count >maxCount)
	            {
	                maxCount=count;
	                maxValue=c[i];
	            }
	        }    
	        return maxValue;
	}


}

/*
Enter Any Length ?
11
3
3
6
9
15
15
15
27
27
37
48
 Mode is :- 15.0
 */