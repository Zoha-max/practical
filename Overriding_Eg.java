package method_overriding;
class Exam{
	int marks() {
		return 0;
	}}
class comp extends Exam{
	int marks() {
		return 80;
}}
class math extends Exam{
	int marks() {
		return 70;
}}
class science extends Exam{
	int marks() {
		return 50;
}}
class Eng extends Exam{
	int marks() {
		return 90;
}}


public class Overriding_Eg {
	public static void main(String[] args) {
		comp c=new comp();
		math m=new math();
		science s=new science();
		Eng e =new Eng();
		System.out.println("Computer marks is"+c.marks());
		System.out.println("Math marks is"+m.marks());
		s.marks();
		e.marks();
	}

}
