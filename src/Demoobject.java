class Add {
	int a, b, c;

	
	public  Add(int aa,int bb) {
		a=aa;
		b=bb;
		
		c = a + b;
		System.out.println(a+" "+b + " " +c);
		

	}
	public  Add() {
		
		System.out.println("hi");
		

	}

	public void display() {
		System.out.println(a+b);
	}
	public Add(int aa, int bb, int cc) {
		
		a = aa;
		b = bb;
		c = cc;
		System.out.println(a+" "+b + " " +c);
	}

}

public class Demoobject {

	public static void main(String[] args) {
		Add obj1 = new Add();
		obj1.a = 10;
		obj1.b = 20;
		
		obj1.display();
		
		Add obj2 = new Add(15,16);
		obj2.display();
		Add obj3 = new Add(10,20,30);
		
		
		
}}
