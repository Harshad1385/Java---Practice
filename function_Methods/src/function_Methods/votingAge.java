package function_Methods;
import java.util.*;

public class votingAge {
	public static void eligibleAge(int age) {
		if (age>18) {
			System.out.print("Person can vote");
		}
		else {
			System.out.print("Person in below 18, no right to vote");
		}
		return;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter age :");
		int age = sc.nextInt();
		
		eligibleAge(age);
	}

}
