package sandeep.algoExpert.com;

import java.util.Scanner;
import java.util.TreeSet;

public class MonasaAndStones
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Test Case ?  ?");
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
			System.out.println("Enter the Non Zero Stone   ?  ?  ");
			int a=sc.nextInt();
			System.out.println("Enter One Possible integer Difference  ?");
			int b=sc.nextInt();
			System.out.println("Enter Second Possible integer Difference  ?");
			
			
			TreeSet<Integer> stoneFin=new TreeSet<Integer>();
			for(int ii=0;ii<n;ii++)
			{
				int sum=(ii*a)+((n-1-ii)*b);
				stoneFin.add(sum);
			}
			for(Integer e:stoneFin)
			{
				System.out.println(e+" ");
			}
			System.out.println();	
		}
	}
}
