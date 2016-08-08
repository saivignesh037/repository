import java.util.Scanner;

public class Hunter92 
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		String s1 = s.nextLine();
		int len = 0;
		String sr[] = s1.split(" ");
		if (sr.length - 1 > 0) {
			for (int i = 0; i < sr.length - 1; i++) {
				len += 1;
			}
			System.out.println("Number of Spaces is : " + len + " for Entered String " + "/*" + s1 + "*/");
			System.out.println("Lessen Space is : " + (len - 1) + " for Entered String " + "/*" + s1 + "*/");
		} else {
			System.out.println("Lessen Space is : " + (len) + " for Entered String " + "/*" + s1 + "*/");
		}

	}
}
