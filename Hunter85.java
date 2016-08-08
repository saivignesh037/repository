import java.util.Scanner;

public class Hunter85 {

	public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the last number : ");
			int input=s.nextInt();
			int d0=0;
			int d1=0;
			int d2=0;
			int d3=0;
			int d4=0;
			int count=0;
			for(int i=0;i<=input;i++)
			{
				d0=i%10;
				d1=(i/10)%10;
				d2=(i/100)%10;
				d3=(i/1000)%10;
				d4=(i/10000);
				if(d0==2)
				{
					count++;
				}
				if(d1==2)
				{
					count++;
				}
				if(d2==2)
				{
					count++;
				}
				if(d3==2)
				{
					count++;
				}
				if(d4==2)
				{
					count++;
				}
			}
			System.out.println("No.of 2's between 0 and "+input+" are "+count);
		}
	}


