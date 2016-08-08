import java.util.Scanner;

public class Hunter83
{
	public static void main(String[] args) {
	System.out.println("Enter the String to decode ");
	@SuppressWarnings("resource")
	Scanner s=new Scanner(System.in);
	String input = s.nextLine();
	if (input.contains("x")) 
	{
		int a = input.indexOf("x") - 1;
		int b = Integer.parseInt(Character.toString(input.charAt(a)));
		String mid="";
		for (int i=0;i <= b;i++) 
		{
			mid += input.charAt(a + 2);
		}
		String first = input.substring(0, a);
		String sec = input.substring(a + 2, input.length());
		System.out.println("Decoded String : " + first + mid + sec);

	}
	else 
	{
		System.out.println("Invalid");
	}
}
}