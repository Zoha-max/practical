package Super;


/* Run time poly---dynamic method dispatch
 * overload a static method in java--compile time poly
 * overridden method called by the referace variable of parent class
 * overridden method is resolved at runtime rather than compile time  
 */

public class RunTimePoly { //main class
	public static void main(String[] args) {
		Java_Student js;//referance variable of parent class(upcasting)
			js=new Pooja();
			System.out.println("quality of pooja is "+js.quality());
			js=new Zoha();
			System.out.println("quality of Zoha is "+js.quality());
	}
}

class Java_Student { //parent class
	String quality() { //parent method 
		return null;
	}
}

class Tushar extends Java_Student { //child class 1
	String quality() { //overridden method
		return "Active";
	}
}

class Pooja extends Java_Student { //child class 2
	String quality() { //overridden method
		return "Irregular";
	}
}

class Zoha extends Java_Student { //child class 3
	String quality() { //overridden method
		return "Shy";						
	}
}

class Sohel extends Java_Student { //child class 1
	String quality() { //overridden method
		return "Active";
	}
}