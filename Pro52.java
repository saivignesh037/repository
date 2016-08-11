import java.util.Scanner;

public class Pro52 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int [] arr=new int[8];
System.out.println("Enter points as lowerleft(LL1,LL2),lowerright(LR1,LR2),upperleft(UL1,UL2),upperright(UR1,UR2) ");
for(int i=0;i<8;i++)
{
arr[i]=sc.nextInt();	
}
int diff=arr[2]-arr[0];
if(arr[5]-arr[1]==diff && arr[7]-arr[3]==diff && arr[6]-arr[4]==diff)
{
	System.out.println("Forms square ");
}
else
{
	System.out.println("Not forms square");
}
sc.close();
	}

}
