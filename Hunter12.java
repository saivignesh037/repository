import java.util.Arrays;
import java.util.Scanner;

public class Hunter12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n;
		System.out.println("Enter number of students");
		n=s.nextInt();
		int[] a=new int[n];
		System.out.println("Enter heights");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		Arrays.sort(a);
		System.out.println("Enter the Kth Tallest Student ");
		int pos=s.nextInt();
		System.out.println(a[a.length-pos]);

	}

}
