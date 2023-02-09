import java.util.*;

public class Main
{
	static int kadanesum(int[] arr)
	{
		int ans=Integer.MIN_VALUE;
		int sum=0;
		for(int i=0; i<arr.length; i++)
		{
			sum+=arr[i];
			if(sum<0){sum=0;}
			if(sum>ans){ans=sum;}
		}
		return ans;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int[] arr = {-1,-2,1,3,-4,2};
		System.out.println(kadanesum(arr));
	}
}
