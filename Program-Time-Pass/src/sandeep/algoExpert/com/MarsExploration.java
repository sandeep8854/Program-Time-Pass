package sandeep.algoExpert.com;
import java.util.Scanner;
public class MarsExploration
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String ? ");
		String str=sc.nextLine();
		int result=recivedSignal(str);
		System.out.println(result);
	}
	private static int recivedSignal(String quera)
	{
		String sosFixedMessage="SOS";
		int count=0;
		for(int i=0;i<quera.length();i++)
		{
			if(quera.charAt(i) != sosFixedMessage.charAt(i%3))
				count++;
		}
		return count;
	}
}
/*
Enter The String ? 
SOSSOT
1
*/