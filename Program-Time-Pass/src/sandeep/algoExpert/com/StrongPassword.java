package sandeep.algoExpert.com;
import java.util.Scanner;
public class StrongPassword 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any number ?  ? ");
		int number=sc.nextInt();
		System.out.println("Enter "+number+ " length String ?  ");
		String str1=sc.next();
		strongpwd(number,str1);	
		
	}
	private static void strongpwd(int n, String password)
	{
		 int lowerCount=0,upperCountc=0,numberCount=0,specialCount=0;
	        int sum=0;
	        
	        String lowercase = ".*[a-z]+.*";
	        String uppercase = ".*[A-Z]+.*";
	        String num = ".*[0-9]+.*";
	        String specialchar = ".*[-!@#$%^&*()+]+.*"; 
	        //Regex for pattern matching
	        
	        if(!(password.matches(lowercase)))
	        	lowerCount++; 
	        //if there is no match to a lowercase,"lc" is increased by 1.
	    
	        if(!(password.matches(uppercase)))
	        	upperCountc++; 
	        //if there is no match to an uppercase,"uc" is increased by 1.
	    
	        if(!(password.matches(num)))
	        	numberCount++; 
	        //if there is no match to a number,"no" is increased by 1.
	    
	        if(!(password.matches(specialchar)))
	        	specialCount++; 
	        //if there is no match to a specialCharacter,"sc" is increased by 1.
	         
	        sum=lowerCount+upperCountc+specialCount+numberCount;
	        
	        if(sum>(6-n))
	        {
	        	System.out.println(sum);
	        }
	        else
	        	System.out.println(6-n);   
	    }	
	}

/*
Enter Any number ?  ? 
3
Enter 3 length String ?  
AB1
3
*/













