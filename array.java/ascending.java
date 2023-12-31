package array;
import java.util.Scanner;
import java.util.Arrays;

public class ascending {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		int [] num = new int [4];
		for(int i = 0; i< 4;i++) {
			num [i]=sc.nextInt();
		}
         Arrays.sort(num);
         System.out.println("Ascending =");
		for(int i = 0; i < 4;i++) {
			System.out.println(" "+num[i]);

		}
        System.out.println("descending =");

		for(int i = 3; i >= 0 ;i--) {
			System.out.print(" "+num[i]);

		}

		
		
	}

}
