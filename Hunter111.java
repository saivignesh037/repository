import java.util.Scanner;

public class Hunter111 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string : ");
		String input=sc.nextLine();
		String [] arr=input.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			char [] ar=arr[i].toCharArray();
			int m=0,n=0;
			if(arr[i].length()%2==0)
			{
			for(int j=0;j<ar.length;j++)
			{
			
				if(ar[j]>= (int)'A' && ar[j]<=(int)'M'||ar[j]>= (int)'a' && ar[j]<=(int)'m' )
				{
					m++;
				}
				else if(ar[j]>= (int)'N' && ar[j]<=(int)'Z'||ar[j]>= (int)'n' && ar[j]<=(int)'z')
				{
					n++;
				}
			}
				if(n==m)
				{
					System.out.println(arr[i]+" is balanaced");
				}
				else
				{
					System.out.println(arr[i]+" is not balanced");
				}
				
			}
				else
				{
					System.out.println(arr[i]+" is not balanced");

				}
			
		}
		sc.close();
	}

}
