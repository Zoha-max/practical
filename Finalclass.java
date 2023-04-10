package Super;

//Final keyword

// final class-- cannot extend the final class 
final class Finalclass{ // parent class

 void show() { 
	 System.out.println("Final class method");
 }

 // can't extend final class 8/ class test extends Finalclass{

 //void show ()

 //System.out.println("child class override method");

public static void main(String[] args) {
	Finalclass t = new Finalclass ();
    t.show();
}}

