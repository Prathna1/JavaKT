
public class DemoThis {
	
	int a,b;
	DemoThis()
	{
	System.out.println("hi");
	
	}
	DemoThis(int a,int b)
	{this();	// constructor chaining
		System.out.println("kj");
		this.a=a;
		this.b=b;
		
	
	}
	public void display(int a)
	{
		show();
		a=a*2;
		this.a=this.a+2;
		
		System.out.println(a);
		System.out.println(this.a);
	}
	public void show()
	{
		
		System.out.println("kj show");
		
	}
	

	public static void main(String[] args) {
		
DemoThis p=new DemoThis(1,2);
System.out.println(p.a);
p.display(20);

	}

}
