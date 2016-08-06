import java.util.Scanner;

public class Hunter09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		int n;
		System.out.println("Enter size of array");
		n=s.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		int sum=0;
		int sum1=0;
		int a=0;
		int b=0;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				sum=Math.abs(arr[i]+arr[j]);
				if(i==0&&j==1)
				{
					sum1=sum;
					a=arr[i];
					b=arr[j];
					
				}
				if(sum<sum1)
				{
					sum1=sum;
					a=arr[i];
					b=arr[j];
				}
				
				
			}
			
		}
		System.out.println("the two elements those sum is nearest to zero : "+a+" "+b);
	}

}
