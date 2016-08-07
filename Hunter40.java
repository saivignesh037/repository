import java.util.Scanner;

public class Hunter40 
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number : ");
		int input=s.nextInt();
		int sum=0;
		while(input!=0)
		{
			sum +=(input%10);
			input=input/10;
		}
		int res=0;
		int tmp=sum;
		while(tmp!=0)
		{
			res = res*10;
			res +=tmp%10;
			tmp=tmp/10;
		}
		if(sum==res)
		{
			System.out.println("Sum of digits is palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
		s.close();
	}
}
