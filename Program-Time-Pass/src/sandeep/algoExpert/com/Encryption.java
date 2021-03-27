package sandeep.algoExpert.com;
import java.util.Scanner;
public class Encryption 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number of String ??? ");
		String str=sc.next();
		String s=encryption(str);
		System.out.println(s + " ");
	}

	private static String encryption(String s)
	{
		    int length=0;
		    int lower=0;
		    int upper=0;
		    String res="";
		    String str = s.replace(" ", "");
		    length=str.length();
		   double sqr=Math.sqrt(length);
		    lower=(int)sqr; //lower bound
		    upper=lower;    //upper bound

		    if(lower*upper<length)
		    	upper=upper+1; 
		    char st[]=str.toCharArray();
		    for(int i=0;i<upper;i++)
		    {
		        for(int j=i;j<length;j=j+upper)
		         res=res+st[j];
		    res=res+' ';
		    }
		    return res;	
	}
}
/*
nter Any Number of String ??? 
feedthedog 
fto ehg ee dd
*/