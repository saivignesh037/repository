import java.util.Scanner;

public class Hunter27
{
	 
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		String str;
		System.out.println("Enter the string");
		str=scr.nextLine();
		if((str.length() % 2) == 0)
		{
			System.out.println("Maximun length of non palindrome substring is :"+str.length());
		}
		else
		{
			System.out.println("Maximun length of non palindrome substring is :"+(str.length()-1));
		}
       scr.close();
	}
}
