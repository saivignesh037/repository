import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Hunter88 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string : ");
String input=sc.nextLine();
LinkedHashSet<Character> set =new LinkedHashSet<Character>();
char arr[]=input.toCharArray();
for(int i=0;i<arr.length;i++)
{
	set.add(arr[i]);
}
Iterator it =set.iterator();
String res="";
while(it.hasNext())
{
	res +=it.next();
}
System.out.println("string after removing repeating letters ");
System.out.println(res);
}

}
