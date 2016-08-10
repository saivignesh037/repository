import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Hunter107 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter sentece: ");
	String input=sc.nextLine();
String result="";
String [] arr=input.split(" ");
	String res[]=new String[arr.length];
	TreeSet <String> tree =new TreeSet <String>();
	
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length();j++)
			{
				if(arr[i].charAt(j)>=65&&arr[i].charAt(j)<=90||arr[i].charAt(j)>=97&&arr[i].charAt(j)<=122)
				{
					res[i]+= arr[i].charAt(j);
				}
			}
		
		
		tree.add(res[i].toLowerCase());
	}
		
	Iterator<String> it=tree.iterator();
	while(it.hasNext())
	{
		result+= it.next().substring(4)+" ";
	}
	result.trim();
	System.out.println(result);
	sc.close();
}
}
