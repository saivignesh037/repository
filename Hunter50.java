import java.util.Scanner;

public class Hunter50 
{
	 public static void main(String[] args)
	    {
	    int number,divider,quotient=0;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number : ");
	    number=sc.nextInt();
	    System.out.println("Enter the divider : ");
	    divider=sc.nextInt();
	    while(number>=divider)
	    {
	    	number -= divider;
	        quotient++;
	    }
	    System.out.println("Quotient : "+quotient);
	    System.out.println("Remainder : "+number);
	    sc.close();
	    }
}
