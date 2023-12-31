package array;
import java.util.Scanner;

public class matrix {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the element of A");
	
	int [][] num = new int [2][3];
	
	for(int row = 0; row < 2 ; row ++) {
		for(int col = 0 ; col < 3 ; col ++) {
			num [row][col] = sc.nextInt();
			
			
		}
		
		
	}
	for(int row = 0; row < 2 ; row ++) {
		for(int col = 0 ; col < 3 ; col ++) {
			System.out.print(num [row][col]+ " ");
			
		}
		
		System.out.println();		
	}
System.out.println("Enter the element of B");
	
	for(int row = 0; row < 2 ; row ++) {
		for(int col = 0 ; col < 3 ; col ++) {
			num [row][col] = sc.nextInt();
			
			
		}
		
		
	}
	for(int row = 0; row < 2 ; row ++) {
		for(int col = 0 ; col < 3 ; col ++) {
			System.out.print(num [row][col]+ " ");
			
		}
		
		System.out.println();		
	}
		
		
		
	}

}
