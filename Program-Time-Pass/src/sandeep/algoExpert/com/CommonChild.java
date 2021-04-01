package sandeep.algoExpert.com;
import java.util.Scanner;
public class CommonChild
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First String ?   ?   ? ");
		String str1=sc.next();
		System.out.println("Enter Second String ?  ?   ? ");
		String str2=sc.next();
		int result=commonString(str1,str2);	
		System.out.println(result);
	}
	private static int commonString(String a, String b) 
	{
		int[][] c=new int[a.length()+1][b.length()+1];
		for(int i=0;i<a.length();i++)
		{
			for(int j=0;j<b.length();j++)
			{
				if(a.charAt(i)==b.charAt(j))
				{
					c[i+1][j+1]=c[i][j]+1;
				}
				else
				{
					c[i+1][j+1]=Math.max(c[i+1][j], c[i][j+1]);
				}
			}
		}
		return c[a.length()][b.length()];
	}
}
/*
Enter First String ?   ?   ? 
harry
Enter Second String ?  ?   ? 
sally
2
 */
/*
Enter First String ?   ?   ? 
aa
Enter Second String ?  ?   ? 
bb
0
 */
/*
Enter First String ?   ?   ? 
SHINCHAN
Enter Second String ?  ?   ? 
NOHARAAA
3
 */
/*
https://en.wikipedia.org/wiki/Longest_common_subsequence_problem
 */