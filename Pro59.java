import java.util.Scanner;

public class Pro59 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the sentences ");
String input=sc.nextLine();
int flag=0;
if(input.length()<26)
{
	System.out.println("not pangram");
}
else
{
	for(char ch='A';ch<'Z';ch++)
	{
		if(input.toUpperCase().contains(String.valueOf(ch)))
		{
			flag=1;
		}
	}
	if(flag==1)
	{
		System.out.println("pangram");
	}
	else
	{
		System.out.println("not pangram");

	}
}
	}

}
