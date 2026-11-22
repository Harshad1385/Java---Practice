package function_Methods;
import java.util.*;

public class circumference {
	public static double Circumference(float r) {
	double c = (2*3.14*r);
	return c;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of radius :");
		float r = sc.nextFloat();
		double c = Circumference(r);
		
		System.out.print("Circumference is : "+ Circumference(r));
	}
}
