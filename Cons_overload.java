package constructor;

public class Cons_overload {
int age;
String name;
String place;
//constructor 1 with 2 args
Cons_overload(int a,String n){
	age=a;
	name=n;
}
//constructor 2 with 3 args
Cons_overload(int a, String n, String p){
	age=a;
	name=n;
	place=p;
}
public void show() {
	System.out.println("Name="+ name+" Age="+ age+" place+"+ place);
}
public static void main(String[] args) {
	Cons_overload ob=new Cons_overload(25,"Zoha");
	Cons_overload obj=new Cons_overload(25,"Zoha","Solapur");
	ob.show();
	obj.show();
}
}
