package MethodOverloading;

public class Overloadingtypepromothion { //class
	void add(int a, double b) { //method 1
		System.out.println(a+b);
	}
	void add(int a, int b, int c) { //method 2
		System.out.println(a+b+c);
	}
	
	public static void main(String args[]) {
		
		Overloading_changing_argdatatype obj= new Overloading_changing_argdatatype();
		obj.add(3,5); // 2nd (5) will be promoted to double 
		obj.add(10,5,8); 
	}

}

//byte-int--float--long--float--double
//char--int--float--double--loang
