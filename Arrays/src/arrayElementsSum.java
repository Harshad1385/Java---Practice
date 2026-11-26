import java.util.*;

public class arrayElementsSum {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		int sum=0;
		
		int[][] numbers= new int[rows][cols];
		
		for(int i=0;i<rows;i++) {
			for (int j=0;j<cols;j++) {
				numbers[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0;i<rows;i++) {
			for (int j=0;j<cols;j++) {
				System.out.print(numbers [i][j] +" ");
				sum = sum + numbers[i][j];
			}
		}
		System.out.println("Sum = "+sum);
	}

}
