package array;
import java.util.ArrayList;
import java.util.Scanner;

public class array {
	public static void main(String[] args) {
		
ArrayList<Integer> number = new ArrayList<Integer>();
System.out.println("The element =");		
		
number.add(10);
number.add(20);
number.add(30);
number.add(40);
number.add(50);
number.add(60);

for(int x : number) {
	System.out.print(x+" ");
}
System.out.println();
	System.out.println("size = "+number.size());
	
	
	//adding element
	System.out.println("After adding new element\n");
	number.add(6,70);
	
	System.out.println(number);
	
	//removing element
	System.out.println("After remove a element\n");


	number.remove(2);
	System.out.println(number);
	//replacing element
	System.out.println("After replacing a  element\n");

	
		
		number.set(1, 90);
	
	System.out.println(number);
	
	}

}
