package sandeep.algoExpert.com;
import java.util.Arrays;
import java.util.Scanner;
public class BiggerIsGreater 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any String Length  ?   ? ");
		int TestCases=sc.nextInt();
	    for(int i=0;i<TestCases;i++)
		{
	    	String str=sc.next();
	    	System.out.println(biggerAndGreatest(str));
		}	
	}
	private static String biggerAndGreatest(String s)
	{
		char charnewArr[]=s.toCharArray();
		int n=charnewArr.length;
		int i=0;
		for(i=n-1;i>0;i--)
		{
			if(charnewArr[i]>charnewArr[i-1])
			{
				break;
			}
		}
		if(i==0)
		{
			return "no answer";
		}
		else
		{
			int small=charnewArr[i-1];
			int next=i;
			for(int j=i+1;j<n;j++)
			{
				if(charnewArr[j]>small && charnewArr[j]<charnewArr[next])
				{
					next=j;
				}
			}
			swap(charnewArr,i-1,next);
			Arrays.sort(charnewArr,i,n);
		}
		return new String(charnewArr);
	}
	private static void swap(char[] charArr, int i, int j)
	{
		 char temp = charArr[i];
	        charArr[i] = charArr[j];
	        charArr[j] = temp;	
	}
}
/*
 Enter Any String Length  ?   ? 
5
ab
ba
bb
no answer
hefg
hegf
dhck
dhkc
dkhc
hcdk

 */
/*

Enter Any String Length  ?   ? 
6
lmno
lmon
dcba
no answer
dcbb
no answer
abdc
acbd
abcd
abdc
fedcbabcd
fedcbabdc

*/