public class strrev
{
public static void main(String [] args)
{
String str="SAIVIGNESH";
int j=str.length();
char a[]=new char[str.length()];
for(int i=0;i<str.length();i++)
{
a[j]=str.charAt(i);
j--;
System.out.print(a[i]);
}
}
}

