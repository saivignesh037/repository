package assignment08;

public class Saaai
{
	public static void main(String[] args) {
		String str=new String("SAI VIGNESH");
		//SPLITTING THE STRINGS
		String[] str2=str.split(" ");
		//DECLARING THE CHAEACTER ARRAY
		for(int m=str2.length-1;m>=0;m--)
		{


			System.out.print(str2[m]+" ");
			
		}
	}
}
