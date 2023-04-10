package MethodOverloading;
/* Method OVerloading - same name method 
 * two way we can overload the methods 
 * 1. changing the no of arguments 
 * 2. changing the data type  
 * */

public class OverloadingChangingArgs {
	static int sum(int a, int b) { //two parameters/arguments
		return a + b;
		
	}
	
	static int sum(int x, int y, int z) { //three parameters/arguments
		return x+y+z;
	}
	public static void main(String[] args) {
		System.out.println(OverloadingChangingArgs.sum(5, 2));
		System.out.println(OverloadingChangingArgs.sum(3, 7, 6));
	}

}
