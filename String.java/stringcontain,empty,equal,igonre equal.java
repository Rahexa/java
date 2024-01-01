package string;

public class string {
	public static void main(String[] args) {
		
		String s1 = "Raihan Sikder";
		String s2 = new String("raihan Sikder");
		
		char[] s3 = {'r','a','i','h','a','n'};
		int x = s1.length();
		
		
		
if(s1.equalsIgnoreCase(s2)) {
	System.out.println("Contain");
	
}		
else {
	System.out.println("not contain");
	
}		
		boolean s = s1.contains("sikder");
		System.out.println(s);
		
		
		
	}

}
