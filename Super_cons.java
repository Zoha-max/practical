package Super;
class Shape2 {//parent class
	//efault Constructor of parent class
	Shape2(){
		System.out.println("Hello");
	}
}
class Size2 extends Shape2{ //child classSize2()
//constructor for the child class
	Size2(){
	//invoke immediate parent class constructor 
	super();
	System.out.println("Hi");
}
	
	}
 
	
public class Super_cons {

}
