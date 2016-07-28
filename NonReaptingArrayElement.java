import java.util.Arrays;
import java.util.Scanner;
public class NonReaptingArrayElement {
  public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no elements of array");
		int num=sc.nextInt();
		int a[]=new int[num];
		for(int i=0;i<num;i++)
		{
			a[i]=sc.nextInt();
		}
		
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=a[i+1])
			{
				System.out.println(a[i]);
				break;
			}
			i=i+1;	
		}
		
		sc.close();
	}


}
