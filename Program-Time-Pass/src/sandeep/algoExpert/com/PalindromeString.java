package sandeep.algoExpert.com;
import java.util.Scanner;
public class PalindromeString
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String You Want To Check  ?  ? ");
		String str=sc.nextLine();
		palindromeString(str);	
	}
	private static void palindromeString(String a)
	{
		String b="";
		int n=a.length();
		for(int i=n-1;i>=0;i--)
		{
			b=b+a.charAt(i);
		}
		
		if(a.equalsIgnoreCase(b))
		{
			System.out.println("The String is palindrome ... ");
		}
		else
		{
			System.out.println("The String is Not Palindrome ");
		}	
	}
}
/*
Enter the String You Want To Check  ?  ? 
madam
The String is palindrome ... 
*/
/*
Enter the String You Want To Check  ?  ? 
NeveroddorEveN
The String is palindrome ... 
 */
/*
Enter the String You Want To Check  ?  ? 
sandeep
The String is Not Palindrome 
*/