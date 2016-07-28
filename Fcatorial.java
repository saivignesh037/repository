import java.util.Scanner;

public class Fcatorial {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of elements ");
		int ele=sc.nextInt();
		int [] a=new int [ele];
		System.out.println("enter the elements ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=1+i;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
					System.exit(0);
				}
			}
		}
		
		
		
	}
	

}
