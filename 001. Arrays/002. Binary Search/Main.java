import java.util.*;

public class Main
{
	static int binarysrch(int[] arr, int k)
	{
		int s=0;
		int e = arr.length - 1;
		while(s<=e)
		{
			int m = (s+e)/2;
			if(arr[m] == k){return m;}
			else if(arr[m]<k){s=m+1;}
			else{e=m-1;}
		}
		return -1;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int[] arr = new int[len];
		for(int i=0; i<len; i++)
		{
			arr[i] = i;
		}
		int k = sc.nextInt();
		System.out.println(binarysrch(arr,k));
	}
}
