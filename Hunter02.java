import java.util.Arrays;
import java.util.Scanner;

public class Hunter02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
         Arrays.sort(a);
         String Num="";
 		for(int i=a.length-1;i>=0;i--)
         {
 			Num +=String.valueOf(a[i]);
         }
 		System.out.println("Largest number obtained from concatination of array elements is : "+Num);
	}

}
