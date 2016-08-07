import java.util.Scanner;

public class Hunter51 {

	public static void main(String[] args)
	{
String a,b;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first number String : ");
a=sc.nextLine();
System.out.println("Enter the second number String : ");
b=sc.nextLine();
int a1=Integer.parseInt(a);
int b1=Integer.parseInt(b);
if(a1>0 && b1>0)
{
	int res=a1*b1;
	System.out.println("Result is : "+res);
}
else
{
	System.out.println("Invalid ");
}
sc.close();

	}

}
