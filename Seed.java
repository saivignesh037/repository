
public class Seed {
	public static void main(String[] args)
	{
		
	
	int num=Integer.parseInt(args[0]);
	int count=0;
	for(int i=11;i<num/2;i++) 
	{
	int temp=i;
	int temp1=i;
	while(temp1>0)
	{
		temp=temp*(temp1%10);
		temp1=temp1/10;
	}
		if(temp==num)
		{
			System.out.println(i+" is the seed of the  "+num);
			count++;
		}
	}
	if(count==0)
	{
		System.out.println("No seed found.");
	}
	}

}
