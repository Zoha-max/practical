package Inheritance;

// creating Employee class
class Employee {
 long employeeId;
 String employeeName;
 String employeeAddress;
 Long employeePhone;
 double basicSalary,specialAllowance = 250.80, hra = 1000.50;

 // Overloaded constructor
 public Employee(long id, String name, String address, Long phone) {
     this.employeeId = id;
     this.employeeName = name;
     this.employeeAddress = address;
     this.employeePhone = phone;
 }

 // Method to calculate salary
 public void calculateSalary() {
     double salary = basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * hra / 100);
     System.out.println("Salary : " + salary);
     
 }
 public void calculateTransportAllowance() {
     double transportAllowance = 0.15 * basicSalary;
     System.out.println("Transport Allowance of Jack is: " + transportAllowance);
 }
}
 

//Manager class
class Manager extends Employee {
 public Manager(long id, String name, String address, Long phone, double salary) {
     super(id, name, address, phone);
     this.basicSalary = salary;
 }
 public void calculateTransportAllowance() {
     double transportAllowance = 0.15 * basicSalary;
     System.out.println("Transport Allowance of Peter is: " + transportAllowance);
 }
}

//Trainee class
class Trainee extends Employee {
 public Trainee(long id, String name, String address, Long phone, double salary) {
     super(id, name, address, phone);
     this.basicSalary = salary;
 }


//InheritanceActivity class
public class InheritanceActivity {
 public static void main(String[] args) {
     // Test case #1
     Manager manager = new Manager(126534, "Peter", "Chennai India", 237844L, 65000);
     manager.calculateSalary();
     manager.calculateTransportAllowance();
     Trainee trainee = new Trainee(29846, "Jack", "Mumbai India", 442085L, 45000);
     trainee.calculateSalary();
     trainee.calculateTransportAllowance();
 }
}
}