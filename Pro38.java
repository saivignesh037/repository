import java.util.Scanner;


public class Pro38 {
	public static void main(String[] args) {
		String[] arr={"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the any one day of the week :");
		String day=sc.nextLine();
		System.out.println("Enter year Type (leap/nonleap) :");
		String yearType=sc.nextLine();
		int flag=0;
		for(int i=0;i<7;i++){
			if(day.equalsIgnoreCase(arr[i]))
				flag=i;
		}
		if(flag % 2 == 0)
		{
		for(int j=0;j<7;j=j+2)
	     	{
			System.out.println(arr[j]);
		    }
	    }
		if(flag % 2 == 1)
		{
			for(int j=1;j<7;j=j+2)
			{
				System.out.println(arr[j]);
			}
	    }
		if(yearType.equalsIgnoreCase("leap"))
			System.out.println(arr[flag+1]);
		sc.close();
}
}
