package MethodOverloading;

/* Method OVerloading - same name method 
* two way we can overload the methods 
* 1. changing the no of arguments 
* 2. changing the data type  
* */

public class Overloading_changing_argdatatype {
	static int sum(int a,int b) { //int type arguments
		return a+b;
	}
	static double sum(double a, double b) { //double type arguments
		return a+b;
	}
	public static void main(String[] args) {
		System.out.println(Overloading_changing_argdatatype.sum(7, 3));
		System.out.println(Overloading_changing_argdatatype.sum(5.1, 4.5));
	}
	
}