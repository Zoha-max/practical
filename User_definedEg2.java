package method;
import java.util.*;

public class User_definedEg2 {
	public static void positive_or_negative(int num) {
		if(num>0)
		{
			System.out.println("Positive");
		}
		else {
			System.out.println("Negative");
		}
	}
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number: ");
	int num=sc.nextInt();
	positive_or_negative(num);
}
}
