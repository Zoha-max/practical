package Inheritance;

 public class Book {
     String name;
     double price;
     
    public Book(String name, double price) {
        this.name = name;
        this.price = price;
        }

     void print1() {
	    System.out.println("---------------------Book Details------------------------");
	   	System.out.println("Book Name:"+name);
	   	System.out.println(("Book Price:"+price));
     }
	   	public static void main(String[] args) {
	   		Book b=new Book("Core Java",800);
	   		b.print1();
	   		Author a =new Author("Micheal",32,"USA");
	   		a.show();
	   		Publisher p= new Publisher("Sun Publisher","ABC-1110","London");
	   		p.print();
	   		
	   	
	   	
 
    }
}
