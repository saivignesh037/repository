import java.util.Scanner;


public class Pro11 {
	public static void main(String args[]){
		int noOfPairs;
		int noOfChildren;
		int count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no of pairs : ");
		noOfPairs=s.nextInt();
		noOfChildren=2*noOfPairs;
		System.out.println("Possibilities : ");
		for(int i=0;i<noOfPairs;i++){
			for(int j=i+1;j<=noOfPairs;j++){
				System.out.println(i+" pair with "+j);
			count++;
			}
		}
		System.out.println("No of possibilities : "+count);
		s.close();
}
}
