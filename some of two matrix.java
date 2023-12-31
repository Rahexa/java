package array;
import java.util.Scanner;

public class towmatrix {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the element of A");
	
	int [][] num = new int [2][3];
	int [][] num2 = new int [2][3];
	for(int row = 0; row < 2 ; row ++) {
		for(int col = 0 ; col < 3 ; col ++) {
			System.out.printf("num[%d][%d] = ",row,col);
			num [row][col] = sc.nextInt();
			
			
		}
		
		
	}
	System.out.println("A=");

	for(int row = 0; row < 2 ; row ++) {
		for(int col = 0 ; col < 3 ; col ++) {
			System.out.print(num [row][col]+ "\t ");
			
		}
		
		System.out.println();		
	}
System.out.println("Enter the element of B");
	
	for(int row = 0; row < 2 ; row ++) {
		for(int col = 0 ; col < 3 ; col ++) {
			
			System.out.printf(" num2[%d][%d] =",row,col);
			num2 [row][col] = sc.nextInt();
			
			
		}
		
		
	}
	System.out.println("B =");
	for(int row = 0; row < 2 ; row ++) {
		for(int col = 0 ; col < 3 ; col ++) {
			System.out.print(num2 [row][col]+ "\t ");
			
		}
		
		System.out.println();		
	}
		
	// adding two matrix	
	System.out.println("A + B =");
	for(int row = 0; row < 2 ; row ++) {
		for(int col = 0 ; col < 3 ; col ++) {
			System.out.print(" \t" +(num[row][col]+num2 [row][col]));
			
		}
		
		System.out.println();		
	}
		
	}

}
