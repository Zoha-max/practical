package MethodOverloading;
//Changing_Returntype is not possible in case of method overloading
public class Changing_Returntype {
	static int sum(int a, int b) {
		return a+b;
	}
	//double type argument 
	static double sum(int a, int b) {
		return a+b;
	}
	public static void main(String[] args) {
		System.out.println(Overloading_changing_argdatatype.sum(5, 2)); //ambiguity
		
	}
	

}
