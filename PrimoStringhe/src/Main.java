
import java.lang.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1=new String ("CIAO");
		String s2=new String ("ciao");
		String s3=new String ("Ciam");
		String s4=new String("Cam");
		String s5=new String("Caociao");
		
		
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.concat(s2));
	    System.out.println(s1.equals(s4));
	    System.out.println(s1.substring(0, 2));
	    System.out.println(s2.endsWith(s5));
			
			
		}
		
		

	}


