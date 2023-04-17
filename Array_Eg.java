package Array;

public class Array_Eg {
	public static void main(String[] args) {
	int a[]=new int[5];
	//initialization
	a[0]=2;
	a[1]=9;
	a[2]=5;
	a[3]=7;
	a[0]=1;
	//traversing (printing one after another)using array
	System.out.println("Traversing using for Each loop");
	for(int i:a)
		System.out.println(i);
	//Traversing using For loop
	System.out.println("Traversing using For Loop");
	for(int i=0;i<a.length;i++)//length is one of the property
		System.out.println(a[i]);
	}

}
