import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter arrays values");
		for(int i=0;i<a.length;i++)
		{
		a[i]=sc.nextInt();
		
		}
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
		
		
		
		
		System.out.println("for each loop");
		//for each
		for(int p:a) {
			System.out.println(p);
		}
		
		
		//2D Array
		System.out.println("for 2d loop");
		int js[][]=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				js[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(js[i][j]+" ");
				
			}
			System.out.println();
		}
			
		
		
		
		
		
		
			}

}


