import java.util.Scanner;

public class Hunter24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		System.out.println("Enter the Target number : ");
		int target=s.nextInt();
		int a=0;
		int b=0;
		for(int i=0;i<arr.length;i++)
		{
		     for(int j=0;j<arr.length;j++)
		     {
		    	 if(arr[i]+arr[j]==target)
		    	 {
		    		 a=arr[i];
		    		 b=arr[j];
		    	 }
		     }
		}
		s.close();
		System.out.println("the elements whose sum produce target value : "+a+" "+b);
	}

}
