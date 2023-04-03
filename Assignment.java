package Inheritance;

class Arithmetic{
	int sum;
	void addition(int a,int b)
	{
		sum=a+b;
	}
}

class Adder extends Arithmetic{
	void display() {
		System.out.println(" The sum is:"+sum);
	}
}
public class Assignment {
public static void main(String[] args) {
	Adder a=new Adder();
	a.addition(10, 20);
	a.display();
}
}