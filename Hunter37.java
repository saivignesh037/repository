import java.util.Scanner;

public class Hunter37 {
	static String rev(String in)
	   {
	      String res="";
	    for(int i=(in.length())-1;i>=0;i--)
	     {
	        res += in.charAt(i);
	     }
	    return res;
	   } 
public static void main(String[] args)
{ 
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String : ");
	String in=sc.nextLine();
	StringBuffer temp=new StringBuffer(in);
	for(int i=0;i<in.length();i++)
	{
	temp =temp.deleteCharAt(i);
	String res="";
	res=rev(temp.toString());
	if(temp.toString().equals(res))
	{
		System.out.println("After Removing The Character '"+ in.charAt(i)+"' From The String \""+in+"\" becomes \""+res+"\" which is palindrome.");
	}
	temp=new StringBuffer(in);
	}
	sc.close();
}
}
