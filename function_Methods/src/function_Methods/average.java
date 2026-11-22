package function_Methods;
import java.util.*;

public class average {
	public static int Avg(int a,int b, int c) {
		int average = (a+b+c)/3;
		return average;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a :" );
		int a = sc.nextInt();
		System.out.println("Enter value of b :" );
		int b = sc.nextInt();
		System.out.println("Enter value of c :" );
		int c = sc.nextInt();
		
		//Avg(a,b,c);
		System.out.print("Average of 3 numbers is :"+ Avg(a,b,c) );
		
		
	}

}
