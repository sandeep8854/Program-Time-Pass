package sandeep.algoExpert.com;
import java.util.Arrays;
import java.util.Scanner;
public class Priyanka_and_Toys
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Length ? ? ");
		int Len=sc.nextInt();
		int Toys[]=new int[Len];
		for(int i=0;i<Toys.length;i++)
		{
			Toys[i]=sc.nextInt();
		}
		priyankaToys(Toys);	
	}
	private static void priyankaToys(int[] Toys)
	{
		int miniNumzofContaiRequi=1;
		Arrays.sort(Toys);
		int currentWeight=Toys[0];
		for(int weight:Toys)
		{
			if(!(weight<=currentWeight+4))
			{
				miniNumzofContaiRequi++;
				currentWeight=weight;	
			}
		}
		System.out.println(miniNumzofContaiRequi);
	}
}
/*
Enter Array Length ? ? 
8
1
2
3
21
7
12
14
21
4
*/