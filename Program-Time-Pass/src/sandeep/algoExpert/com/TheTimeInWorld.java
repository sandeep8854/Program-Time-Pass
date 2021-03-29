package sandeep.algoExpert.com;
import java.util.Scanner;
public class TheTimeInWorld 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Hours ??   ??");
		int hours=sc.nextInt();
		System.out.println("Enter Any Minutes ?   ?  ");
		int minutes=sc.nextInt();
		
		String word[]= {"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eifgteen","nineteen","twenty","twenty one","twenty two","twenty three","twenty four","twenty five","twenty six","twenty seven","twenty eight","twenty nine"};
		String time="";
		
		if(minutes==0)
		{
			time=word[hours] + " o' clock";
		}
		else if(minutes==15)
		{
			time="quarter past " + word[hours];
		}
		else if(minutes==30)
		{
			time="half past " + word[hours];
		}
		else if(minutes==45)
		{
			time="quarter to " + word[hours+1];
		}
		else if(minutes==1)
		{
			time=word[minutes]+ " minute past " + word[hours];
		}
		else if(minutes < 30)
		{
			time=word[minutes]+ " minutes past " +word[hours];
		}
		else
		{
			time=word[60-minutes]+" minutes to " +word[hours+1]; 
		}
		System.out.println(time);
	}
}
/*
Enter Any Hours ??   ??
5
Enter Any Minutes ?   ?  
28
twenty eight minutes past five
*/