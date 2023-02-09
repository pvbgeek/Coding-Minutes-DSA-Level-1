import java.util.*;

public class Main
{
	static int linearsrch(int[] arr, int k)
	{
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==k)
			{return i;}
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
		System.out.println(linearsrch(arr,k));
	}
}
