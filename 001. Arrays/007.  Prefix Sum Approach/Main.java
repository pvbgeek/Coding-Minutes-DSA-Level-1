import java.util.*;

public class Main
{
	static int PrefixSumSubarr(int[] arr)
	{
		int currsum = Integer.MIN_VALUE;
		int[] prarr = new int[arr.length];
		prarr[0] = arr[0];
		for(int i=1;i<prarr.length;i++)
		{
			prarr[i] = prarr[i-1] + arr[i];
		}
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i; j<arr.length; j++)
			{
				int sum=0;
				if(i==0)
				{
					sum=prarr[i];
					if(sum>currsum)
					{currsum=sum;}
				}
				else
				{
					sum=prarr[j]-prarr[i-1];
					if(sum>currsum)
					{currsum=sum;}
				}
			}
		}
		return currsum;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int[] arr = {-1,1,2,-3,4,-1};
		System.out.println(PrefixSumSubarr(arr));
	}
}
