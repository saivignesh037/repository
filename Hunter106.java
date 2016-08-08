import java.util.Scanner;

public class Hunter106 
{
	static char findmirror(char c)
	{
		switch(c)
		{
		case 'A':return c;
	    case 'E':return '3';
	    case 'H':return c;
	    case 'I':return c;
	    case 'G':return '4';
	    case 'J':return 'L';
	    case'L':return 'J';
	    case'M':return c;
	    case 'O':return c;
	    case 'S':return '2';
	    case 'T':return c;
	    case'U':return c;
	    case'W':return c;
	    case'X':return c;
	    case'Y':return c;
	    case'Z':return '5';
	    case'1':return c;
	    case'2':return 'S';
	    case'3':return 'E';
	    case'5':return 'Z';
	    case '4':return 'G';
	    case'8':return c;
	    default: return '@'; 
		}
	}
	static String rev(String in)
	   {
	      String res="";
	    for(int i=(in.length())-1;i>=0;i--)
	     {
	        res += in.charAt(i);
	     }
	    return res;
	   } 
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
System.out.println("Enter the String : ");
String input=sc.nextLine();
String array[]=input.split(" ");

for(int i=0;i<array.length;i++)
{
	int palindrome=0,mirror=0;
		if(array[i].equals(rev(array[i])))
		{
			palindrome=1;
		}
		char arr[]=array[i].toCharArray();
		int m=0,j;
		for(j=0;j<(int)((arr.length)/2);j++)
		{
			if(findmirror(arr[j])!=arr[arr.length-j-1])
			{
				m++;
			}
			
		}
		if(m==0)
		{
			mirror=1;
		}
		if(palindrome ==1 && mirror ==1)
		{
			System.out.println(array[i]+" both PALINDROME AND mirror");	
		}
		else if(palindrome ==1 && mirror ==0)
		{
			System.out.println(array[i]+" is palindrome");	

		}
		else if(palindrome ==0 && mirror ==1)
		{
			System.out.println(array[i]+" is mirror");	
		}
		else if(palindrome==0 && mirror ==0)
		{
			System.out.println(array[i]+" not palindrome not mirror");	
		}
	}
	sc.close();
}
	}

