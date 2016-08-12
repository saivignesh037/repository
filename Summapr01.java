

public class Summapr01
{
	public static void main(String[] args) {
		
	String [] arr={"gang","gagster","ganamstyle","gangs"};
	String res="";
	for(int i=0;i<arr.length;i++)
	{
		for(int j=1;j<arr.length;j++)

	      {
			if(arr[0].substring(0,j).equals(arr[j].substring(0,j)))
			{
	             res = arr[j].substring(0,j);
			}
	      }
	}
		
		
	System.out.println(res);	
		
		
	}
	}