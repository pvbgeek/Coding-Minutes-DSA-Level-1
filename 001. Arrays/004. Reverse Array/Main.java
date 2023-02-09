import java.util.*;

public class Main
{
	static void revarr(int[] arr)
	{
		int s=0;
		int e=arr.length-1;
		while(s<=e)
		{
			int temp = arr[s];
			arr[s]=arr[e];
			arr[e]=temp;
			
			s++; e--;
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int[] arr = new int[len];
		for(int i=0; i<len; i++)
		{arr[i]=i;}
		for(int x:arr)
		{System.out.print(x+" ");}
		System.out.println();
		revarr(arr);
		for(int x:arr)
		{System.out.print(x+" ");}
		System.out.println();
	}
}
