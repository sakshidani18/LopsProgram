import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Starting number");
		int s = input.nextInt();
		System.out.println("Enter the Ending Number");
		int e = input.nextInt();
		
		while(s>=e)
		{
			System.out.println(s);
			s--;
		}

	}

}
