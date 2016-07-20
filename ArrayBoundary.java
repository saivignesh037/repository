package summa;

import java.util.Scanner;

public class ArrayBoundary {
	public static void main(String args[])throws Exception
	{
	int n,i;
	System.out.println("Enter The Size Of The Array : ");
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	int arr[]=new int[n];
	for(i=0;i<n;i++)
	{
	System.out.println("Elements Of Array : ");
	arr[i]=s.nextInt();
	}
	for(i=0;i<n;i++)
	{
	if(arr[i]==i)
	{
		System.out.println("The Number "+arr[i]+" Is Equals To Its Index "+i);
break;
	}
	}
	}
}
