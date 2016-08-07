import java.util.Scanner;

public class Sum21 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number : ");
		int num=sc.nextInt();
		String s=String.valueOf(num);
		int len=s.length();
		int arr[]=new int[len];
		int numDup2=0;
		while(num!=0)
		{
			numDup2=numDup2*10;
			numDup2=numDup2+num%10;
			num=num/10;
		}
		int l=0;
		int result=0;
		while(numDup2!=0)
		{
			arr[l]=numDup2%10;
			numDup2=numDup2/10;                 
			l++;
		for(int j=0;j<l;j++)
		{
		result=result+arr[j];
		}
		}
		System.out.println(result);
		sc.close();
	}

}
