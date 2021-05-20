
public class DemoOverriding {

	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	
	
	public void add(int a,int b, int c)
	{
		System.out.println("Integer 3 "+a+b+c);
	}
	public void add(double a,int b)
	{
		System.out.println("double 2 "+a+b);
	}
	public static void main(String[] args) {
		DemoOverriding d=new DemoOverriding();
		d.add(1,2);
		d.add(1,2,3);
		d.add(1.0,2);

	}

}
