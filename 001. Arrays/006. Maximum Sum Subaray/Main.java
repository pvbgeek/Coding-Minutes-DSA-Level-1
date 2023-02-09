import java.util.*;

public class Main
{
	static int MaxSumSubarr(int[] arr)
	{
		int currsum = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i; j<arr.length; j++)
			{
				int sum = 0;
				for(int k=i; k<=j; k++)
				{
					sum+=arr[k];
					if(sum>currsum){currsum=sum;}
				}
			}
		}
		return currsum;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int[] arr = {-1,1,2,-3,-2};
		System.out.println(MaxSumSubarr(arr));
	}
}
