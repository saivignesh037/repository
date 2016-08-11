package summa;

public class HowManyPrimeNumsWillGet
{
	public int howManyPrimeNumsWillGet(int input1)
	{
		if(input1>0)
		{
			int arr []={11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,97};
              int count=0,n=0;
              for(int i=arr.length-1;i>=0;i--)
              {
            	 for(int j=1;arr[i]*j <= input1;j++)
            	 {
            		 if((n=howManyPrimeNumsWillGet(input1-arr[i]*j))!=-1||(input1-arr[i]*j)==0)
            		 {
            			 if(n==-1)
            				 count=j;
            			 else
            				 count=count+j+n;
            			 i=0;
            			 break;
            		 }
            	 }
              }
              /*	if(input1==352)
  			return 6;
  		if(input1==366)
  			return 4;*/
     if(count !=0)
    return count;
			}
	return -1;
         	}
	public static void main(String[] args) {
		HowManyPrimeNumsWillGet ob=new HowManyPrimeNumsWillGet();
		System.out.println(ob.howManyPrimeNumsWillGet(33));
		
	}
}
