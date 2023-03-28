package method;
import java.util.Scanner;
public class Sum_avg {
  public static void sum_average(int num1,int num2,int num3)
  {
    int sum=num1+num2+num3 ;
    float average=sum/3f ;
    System.out.println("The sum is:"+sum);
    System.out.println("The average is:"+average);
  }
  public static void main(String[] args)
  {
	

    

    Scanner scan = new Scanner(System.in);
    System.out.print("Enter three numbers: ");
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();
    int num3 = scan.nextInt();
    sum_average(num1,num2,num3);
    
  }
}
