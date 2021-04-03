package sandeep.algoExpert.com;
import java.lang.reflect.Array;
import java.util.Scanner;
public class ArrayUpdate 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Any Array LEngth  ?  ?");
		int len=sc.nextInt();
		int arraySandeep[]=new int[len];
		for(int i=0;i<arraySandeep.length;i++)
		{
			arraySandeep[i]=sc.nextInt();
		}
		int result=arrayUpd(arraySandeep);	
		System.out.println(result);
	}
	private static int arrayUpd(int[] arr)
	{
		int n=arr.length;
		int sum=0;
		int up=0;
		for(int i=0;i<n;i++)
		{
			sum=sum+arr[i];
		}
		for(int i=0;i<n;i++)
		{
		  if(sum>=i)
		  {
			  up=up+i*n;
			 if(up>sum)
				return i+1;	
		  }
		}
		return up;
	}
}
/*
Enter Any Array LEngth  ?  ?
5
1
2
3
4
5
4
*/