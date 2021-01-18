package sandeep.algoExpert.com;
import java.util.Scanner;
public class hackerrankinaString
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Length Of String ? ");
		int num=sc.nextInt();
		System.out.println("Enter The "+num +" String ? ?");
		for(int i=0;i<num;i++)
		{
			String str=sc.next();
			String result=hackerrankString(str);
			System.out.println(result);	
		}	
	}
	private static String hackerrankString(String s) 
	{
		String str = "hackerrank";
        if (s.length() < str.length()) {
            return "NO";
        }
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (j < str.length() && s.charAt(i) == str.charAt(j))
            {
                    j++;
            }
        }
        return (j == str.length() ? "YES" : "NO");
	}
}
/*
Enter The Length Of String ? 
2
Enter The 2 String ? ?
hereiamstackerrank
YES
hackerworld
NO
*/