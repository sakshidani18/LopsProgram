import java.util.Scanner;

public class Even_Number {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter The Number of Limit : ");
		int l =input.nextInt();
		for(int s=1;s<=l;s++)
		{
			if(s%2==1)
				System.out.println(s);
		}
	}

}
