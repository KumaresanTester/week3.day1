package week3.day1;

public class JustfyCode {
	
	/**
	 * String is a non-primitive data type, String is a class if we use the "==" we
	 * will not get the proper output. Instead of "==" we can use ".equals" we will
	 * get the proper output. Since the data stored in pool memory "==" wont work
	 * will get the output as false.
	 */

	public static void main(String[] args) {
		
		 String str3 = new String("Kutty");
		 String str4 = new String("Kutty");
		 
		 if(str3.equalsIgnoreCase(str4)) {
			 System.out.println(" Same text");
		 }
		 else
			 System.out.println("Diff text");
		 
		 System.out.println("*****");
	}

}
