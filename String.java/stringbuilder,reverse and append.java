package string;

public class string1 {
	public static void main(String[] args) {
		
        String s1 =  new String ("Raihan ");
	
	StringBuilder s2 = new StringBuilder(s1);
		
	
	String x = s2.append("sikder").toString();
	System.out.println(x);
		
String s3 = s2.reverse().toString();
if(s1.equals(s3) ) {
	System.out.println("Palin drom");
	
	
}
else {
	
	System.out.println("not");
}

}
}