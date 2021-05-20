import java.util.Scanner;

public class Palindrome {
	public static void main(String args[])
	{
		int n=0;
		while(n!=999)
		{
			int r,s=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n or 999 to exit");
		n=sc.nextInt();
		if(n==999)
			break;
		int p=n;
		
		
		while(n>0)
		{
			r=n%10;
			s=s*10+r;
			n=n/10;
		}
		if(p==s)
			System.out.println("Number is Palindrome");
		else
			System.out.println("Number is not Palindrome");
	}}

}
