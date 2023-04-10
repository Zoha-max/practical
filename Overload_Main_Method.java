package MethodOverloading;
//overload main method is possible which received a string type array
public class Overload_Main_Method {
	//JVM call the main method with string array 
	public static void main(String[] args) {
		System.out.println("main with string type array");
	}
	public static void main(String args) {
		System.out.println("main with without array");
		
	}
	public static void main() {
		System.out.println("main with without arguments");
		
	}

}