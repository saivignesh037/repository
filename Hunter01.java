import java.util.Scanner;

public class Hunter01 {
public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner s=new Scanner(System.in);
	int n;
	System.out.println("Enter size of array");
	n=s.nextInt();
	int[] a=new int[n];
	System.out.println("Enter elements");
	for(int i=0;i<n;i++)
	{
		a[i]=s.nextInt();
	}
	System.out.println("Repeated numbers are: ");
	for(int i=0;i<a.length-1;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
		if(a[i]==a[j] && i!=j)
		{
			System.out.println(a[i]);
		}
		}
	}
}
}
