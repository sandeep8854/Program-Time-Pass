package sandeep.algoExpert.com;
import java.util.Scanner;
public class SherlockAndArray 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter Any Number ? ");
		int number=sc.nextInt();
	//	for(int i=0;i<number;i++)
	//	{
			int arrayLen=sc.nextInt();
			int array[]=new int[arrayLen];
			for(int ii=0;ii<arrayLen;ii++)
			{
				array[ii]=sc.nextInt();
			}
			sherlock(array);
	//	}
	}

	private static void sherlock(int[] arr) 
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		int leftSumBySandeep=0;
		for(int i=0;i<arr.length;i++)
		{
			if(leftSumBySandeep==(sum-leftSumBySandeep-arr[i]))
			{
				System.out.println("YES");
			}
			leftSumBySandeep=leftSumBySandeep+arr[i];
		}
		
		System.out.println("NO");
	}
}
/*
int sum = 0;
// get sum of all array index.
for (int i = 0; i < arr.size(); i++){
    sum += arr.get(i);
}

// initially left sum is zero.
int leftSum = 0;
for (int i = 0; i < arr.size(); i++) {
    //if left sum equals right sum print yes.
    if (leftSum == (sum - leftSum - arr.get(i))) 
    {
        return "YES";
    }

    leftSum += arr.get(i);
}

return "NO";
*/