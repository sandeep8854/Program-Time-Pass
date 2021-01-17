package sandeep.algoExpert.com;
import java.util.Scanner;
public class CaeserCipher 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String Size ?  ? ");
		int size=sc.nextInt();
		System.out.println("Enter The "+size+ " String ? ");
		String s=sc.next();
		System.out.println("Enter The Rotation of String ? ");
		int k=sc.nextInt()%26;
		String str1="";
		for(int i=0;i<size;i++)
		{
			str1=str1+getAsciiCodeBySandeep(s.charAt(i),k);
		}	
		System.out.println(str1);
	}
	private static char getAsciiCodeBySandeep(char ch, int increment)
	{
		if(Character.isLetter(ch)) {
			int i=(int)ch;
			i=i+increment;
			
			if(Character.isUpperCase(ch)) {
				if(i>90) {
					int num=(int)ch+increment;
					i=num-26;
				}
			}
			else if(i>122){
				int num=(int)ch+increment;
				i=num-26;
			}
			return (char)i;
		}
		return ch;
	}
}
/*
Enter The String Size ?  ? 
11
Enter The 11 String ? 
middle-Outz
Enter The Rotation of String ? 
2
okffng-Qwvb
*/
/*
Enter The String Size ?  ? 
12
Enter The 12 String ? 
Hello_World!
Enter The Rotation of String ? 
4
Lipps_Asvph!
*/