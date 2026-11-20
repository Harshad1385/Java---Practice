package function_Methods;
import java.util.*;

public class addition {
	
	public static int add(int a, int b){
		int sum = a+b;
		return sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("Enter first no. -" );
		int a = sc.nextInt();
		System.out.println("Enter 2nd no. -");
		int b = sc.nextInt();
		
		int sum = add(a,b);
		System.out.print(sum);
		
	}

}
