import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class PalindromeBr {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int n=0;
		while(n!=999)
		{
			int r,s=0;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter n or 999 to exit");
		n=Integer.parseInt(br.readLine());
		
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
	}

	}

}
