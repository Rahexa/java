package array;
import java.util.Scanner;
public class sumofdiagoana {
	public static void main(String[] args) {
		
		
	Scanner sc = new Scanner(System.in);	
	System.out.println("The element of matrix =");
	int sum = 0;
	int LT = 0;
	int UT = 0;
	int [][] num = new int [3][3];
	

	for(int row = 0; row < 3 ; row ++) {
		for(int col = 0 ; col < 3; col ++) {

			num [row][col] = sc.nextInt();
		}
		
		
	}
	System.out.println("The matrix is =");
	for(int row = 0; row < 3 ; row ++) {
		for(int col = 0 ; col < 3; col ++) {
			
			System.out.print("\t" +num [row][col]);
			if(row == col) {
				sum = sum + num [row][col];
			}
			if(row < col) {
				UT = UT + num [row][col];
			}
			if(row>col) {
				LT = LT + num [row][col];
			}
		}
		System.out.print("\n\n");	
		
		
	}
		
		
	System.out.println("The sum of diagonal is = "+sum);
	
	System.out.println("The sum of diagonal is = "+LT);
	System.out.println("The sum of diagonal is = "+UT);

	
		
		
	}

}
