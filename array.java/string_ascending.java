package array;
import java.util.Scanner;
import java.util.Arrays;

public class ascending {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] name = new String [4];
		System.out.println();

		for(int i = 0; i< 4;i++) {
			name [i]=sc.nextLine();
		}
         Arrays.sort(name);
         System.out.println("Ascending =");
		for(int i = 0; i < 4;i++) {
			System.out.println(" "+name[i]);

		}
        System.out.println("descending =");

		for(int i = 3; i >= 0 ;i--) {
			System.out.print(" "+name[i]);

		}

		
		
	}

}
