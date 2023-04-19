package array;

class Student { // main class
	// declaring instance variables
	int studentNo;
	String Name, Mail, Address;
	double fees;
	// static member for increaseFees method
	static double increasedFees;
	/*creating constructor for assessing the details
	to student passing values through
	overloaded constructor*/
	Student(int sn, String name, String mail, String address) {
		this.studentNo = sn;
		this.Name = name;
		this.Mail = mail;
		this.Address = address;
	}
	
	//method for initializing fees to student
	void fees(double f) {
		fees=f; // assigning passing value
	}
	//method for printing out
	//for concatenation and SOP the output
	void display() {
		//updating fees before printing
		this.fees=this.fees+increasedFees;
		System.out.println("ID-" + this.studentNo + "	" + "Name-" + this.Name + " 	" + "Mail-"+ this.Mail + " 	" + "Address-" + this.Address + " 	Fees-" + fees);
	}
	
	//increasing fees method
	static void increaseFees(int n, double f) {
		if (f<2000) { // condition
			f=(f*10/100); // logic for increasing fees
			increasedFees=f; // assigning the value to static instance variable
			
		}
	}
	// main method
	public static void main(String[] args) {
		//Instantiating Student type of array and declaring
		Student[] student = new Student[5];
		
		//Instantiating object of StudentClass and Initializing
		student[0]= new Student(101,"Akash","akash@gmail.com","Somewhere, Bihar");
		student[1]= new Student(102,"Sayan","sayan@gmail.com","Aurangabad, Maharashtra");
		student[2]= new Student(103,"Sagnik","sagnik@gmail.com","Somewhere, karnataka");
		student[3]= new Student(104,"Ravi","ravi@gmail.com","Mumbai, Maharashtra");
		student[4]= new Student(105,"Owashim","owashim@gmail.com","Bid, Maharashtra");
		
		//adding fees values
		student[0].fees(1064);
		student[1].fees(2056);
		student[2].fees(957);
		student[3].fees(1999);
		student[4].fees(2001);
		
		//increasing fees whose fees is less than 2000
		increaseFees(100, 1064);
		increaseFees(102, 957);
		increaseFees(103, 1999);
		
		//traversing the array of student objects
		System.out.println("________________________Details of Students_____________________");
		for(Student i:student) {
			i.display(); // traversing with invocation of display
		}
	}
}
