package summa;

public class Asci {
public static void main(String[] args) {
	String input="java technology";
	String [] arr=input.split(" ");
	String [] output=new String[arr.length];
	int keypos=0;
	char keychar=' ';
	int n=0;
	for(int i=0;i<arr.length;i++)
	{
		char chaarr[]=arr[i].toCharArray();
		System.out.println(arr[i]);
		int last=chaarr.length-1;
		while(n==0)
		{
			if((chaarr[last] >= 65 && chaarr[last] <= 90)||(chaarr[last] >= 97 && chaarr[last]<=122))
					{
				keychar=chaarr[last];
				n=1;
					}
			else
				last=last-1;
		}
		if(keychar >=65 && keychar <= 90)
		{
			keypos=(int)(keychar-64);
		}
		else if(keychar >=97 && keychar <= 122)
		{
			keypos=(int)(keychar-96);
		}
		for(int j=0;j<chaarr.length-1;j++)
		{
			if(chaarr[j] >= 65 && chaarr[j] <= 90)		
				{
				chaarr[j]=(char)((int)chaarr[j]-keypos);
				}
			if(chaarr[j] <= 64)
			{	
				chaarr[j]=(char)((int)chaarr[j]+26);
			}
				
		 if(chaarr[j] >= 97 && chaarr[j] <= 122)
		 {
				chaarr[j]=(char)((int)chaarr[j]-keypos);
		 }
		 if(chaarr[j] <= 96)
		 {
				chaarr[j]=(char)((int)chaarr[j]+26);
		 }
		}
		output[i]=new String(chaarr);
	}
	for(int i=0;i<output.length;i++)
	{
		System.out.print(output[i]+" ");
	}
	
}
}
