package Super;

//final keyword--
//final method --- cannot override the final method


class FinalMethod // parent class
{
	final void display()  // create a final method 
	{
		System.out.println("This is a final method.");
	}}

class Child extends FinalMethod //child class
{
//try to override final method
	/* public final void display()  parent class method{
System.out.println("the final method is overridden ")}
	 * */
	
}	
	public  class FinalMethod1 // main class
	{
	public static void main(String[] args) {
		
   Child c = new Child(); {
	  c.display();
	
}}}