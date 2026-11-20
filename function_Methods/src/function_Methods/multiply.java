package function_Methods;
import java.util.*;

public class multiply {
	public static int product(int a, int b) {
		int product = a*b;
		return product;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value of A :" );
		int a = sc.nextInt();
		System.out.println("Enter value of B :" );
		int b = sc.nextInt();
		
		//int product = product(a,b);
		System.out.println("product of 2 numbers is :"+ product(a,b));
		
		
	}

}
