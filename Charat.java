package assignment07;

public class Charat {

	public static void main(String[] args)
	{
String str=new String("SAi VIGnESH");
//SPLITTING THE STRINGS
String[] str2=str.split(" ");
String str3 []=new String[str2.length];
//DECLARING THE CHAEACTER ARRAY
for(int m=0;m<str2.length;m++)
{
// 	
char [] ch=new char[str2[m].length()];
int l=0;
//INITIALISING EACH STRING TO THE CHARACTER ARRAY
for(int i=str2[m].length()-1;i>=0;i--)
{
ch[l]=str2[m].charAt(i);
l++;
}
str3[m]=new String(ch);
}
for(int i=0;i<str2.length;i++)
{
	System.out.print(str3[i]+" ");
}
}
}
