import java.util.*;

public class Main
{
	static void printsubarr(int[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i; j<arr.length; j++)
			{
				for(int k=i; k<=j; k++)
				{System.out.print(k+" ");}
				System.out.println();
			}
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int[] arr = new int[len];
		for(int i=0; i<len; i++)
		{arr[i]=i;}
		printsubarr(arr);
	}
}
