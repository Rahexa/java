package string;

public class string1 {
	public static void main(String[] args) {
		
        String s1 =  new String ("Raihan");
	
	StringBuffer s2 = new StringBuffer(s1);
		
		
String s3 = s2.reverse().toString();
if(s2.equals(s3) ) {
	System.out.println("Palin drom");
	
	
}
else {
	
	System.out.println("not");
}

}
}