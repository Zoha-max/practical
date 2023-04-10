package Overloading_Assignments;
//in my subclass not use overloading
class Test{
	void show( ) {
		System.out.println("show result");
	}
}

		public class Withour_Overloading extends Test{
			public static void main(String[] args) {
				Withour_Overloading obj = new Withour_Overloading();
				obj.show();
 
		}
}
