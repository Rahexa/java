package array;
import java.util.Scanner;
import java.util.ArrayList;

public class arraylist {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	ArrayList<Integer>	number = new ArrayList<Integer>();
		
		System.out.println("Enter the elemennt number");
		//input the element number from user
		int count = sc.nextInt();
		System.out.println("Enter "+count+" Element =");
		//adding the element from user input
		for(int i = 0; i< count;i++) {
			int element = sc.nextInt();
			number.add(element);
			
		}
		System.out.println("The element are =");
		//printing the element 
		for(int x : number) {
			
			System.out.println(" "+x);
		}
		//checking the element exists in the Arraylist
		boolean x = number.contains(10);
	System.out.println(x);
	//checking the number of index
		int y =  number.indexOf(20);
		System.out.println(y);
		//checking the indexed number
		int z = number.get(0);
		System.out.println(z);
}
	
}
