package assignment07;
import java.util.Arrays;

import java.util.Scanner;
public class ssss {
	
	 

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String str;
		System.out.println("enter the number :");
		str=input.nextLine();
		System.out.println("enter the number of digits to delete : ");
		int k=input.nextInt();
	    char frst[]=str.toCharArray();
		char dup[]=Arrays.copyOf(frst, frst.length);
		Arrays.sort(dup);   
		int num=dup.length;
		for(;k>0;k--)
		{
		char high_num=dup[num-1];
		for(int i=0;i<frst.length;i++)
		{
			if(high_num==frst[i])
			{
				frst[i]='s';	
			}
			else
			{
				continue;
			}
		}
	--num;
		}
		for(int j=0;j<str.length();j++)
		{
			if(frst[j]!='s')
			{
			System.out.print(frst[j]);	
			}
		}
		
	}

	}
	


