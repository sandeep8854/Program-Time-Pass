package sandeep.algoExpert.com;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class MissingNumbers
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Array Length ? ");
		int Array_length_1=sc.nextInt();
		int array_1[]=new int[Array_length_1];
			for(int i=0;i<array_1.length;i++)
			{
				array_1[i]=sc.nextInt();
			}
		System.out.println("Enter Second Array Length ? ");
		int Array_length_2=sc.nextInt();
		int array_2[]=new int[Array_length_2];
		for(int i=0;i<array_2.length;i++)
		{
			array_2[i]=sc.nextInt();
		}
		
	int[] result=findMissingNumber(array_1,array_2);
	for(int i=0;i<result.length;i++)
	{
		System.out.println(result[i]+ "");
	}

	}
	private static int[] findMissingNumber(int[] a1, int[] a2)
	{
		int array[]=new int[20];
		int k=0;
		ArrayList<Integer> p=new ArrayList();
		for(int i=0;i<a2.length;i++)
		{
			array[a2[i]]++;
		}
		for(int i=0;i<a1.length;i++)
		{
			array[a1[i]]++;
		}
		for(int i=0;i<array.length;i++)
		{
			if(array[i]!=0)
				p.add(i);
		}
		
		int maxNoOfFreq[]=new int[p.size()];
		for(int t:p)
			maxNoOfFreq[k++]=t;
		return maxNoOfFreq;	
		
	}
		
}






















