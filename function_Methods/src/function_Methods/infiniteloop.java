package function_Methods;
import java.util.*;

public class infiniteloop {
	public static void infinite(int a) {
		do {
			System.out.print(a +" won't stop");
		}while (true);
		
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		infinite(a);
	}

}
