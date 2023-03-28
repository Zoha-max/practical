package constructor;

public class Parameterize_cons {
int age;
String name;
Parameterize_cons(int a , String n){
	age=a;
	name=n;
}
void show() {
	System.out.println(age+" "+name);
}
public static void main(String[] args) {
	Parameterize_cons d=new  Parameterize_cons(50,"Zoha");
	Parameterize_cons d1=new  Parameterize_cons(50,"Arsh");
	Parameterize_cons d2=new  Parameterize_cons(50,"Manaal");
	d.show();
	d1.show();
	d2.show();
}
}
