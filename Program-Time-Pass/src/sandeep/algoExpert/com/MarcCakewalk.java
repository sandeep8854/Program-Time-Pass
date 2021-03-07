package sandeep.algoExpert.com;
import java.util.Arrays;
import java.util.Scanner;
public class MarcCakewalk
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Length  ?   ? ");
		int Len=sc.nextInt();
		int arr[]=new int[Len];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		marcCakewalkBySandeep(arr);	
	}
	private static void marcCakewalkBySandeep(int[] arr) 
	{
		Arrays.sort(arr);
		long sum=0;
		int i=arr.length-1;
		while(i>=0)
		{
			double y=Math.pow(2, arr.length-1-i);
			long x=(long)y*arr[i];
			sum=sum+x;
			i--;
		}
		System.out.println(sum);	
	}
}
