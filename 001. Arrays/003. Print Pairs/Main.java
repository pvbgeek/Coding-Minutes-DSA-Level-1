import java.util.*;

public class Main
{
	static void printpairs(int[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				System.out.println("("+arr[i]+","+arr[j]+")");
			}
		}
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
		printpairs(arr);
	}
}
