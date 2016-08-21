
public class Pro21 {
	public static void main(String[] args) {
		int arr[]={4,2,4,3,2};
		float sum1=0;
		float sum2=0;
		int cou1=0;
		int cou2=0;
		float avg1=0;
		float avg2=0;
		int m=0;
		int res1[]=new int[arr.length];
		int res2[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			cou1++;
			sum1 += arr[i];
			res1[i]=arr[i];
			avg1 = sum1/cou1;
			for(int j=arr.length-1;j>i;j--)
			{
				sum2 += arr[j];
				res2[j] = arr[j];
				cou2++;
				avg2=sum2/cou2;
			}
			if(avg1==avg2)
			{
				m=1;
				break;
			}
			else
			{
			sum2=0;
			cou2=0;
			for(int k=0;k<arr.length;k++)
			{
				res2[k]=0;
			}
			}
		}
		if(avg1==avg2)
		{
			for(int i=0;i<arr.length;i++)
			{
				if(res1[i]!=0)
				System.out.print(res1[i]+" ");
			}
			System.out.println();
			for(int i=0;i<arr.length;i++)
			{
				if(res2[i]!=0)
				System.out.print(res2[i]+" ");
			}
		}
		if(m==0)
		{
			System.out.println("Not Possible ");
		}
		}
}
