package week3.day1;

public class Compare {

	public static void main(String[] args) {

		String str1 = "I am Learning Java";
		String str2 = "I am learning java?";
		
		if (str1==str2) {
			System.out.println("Both Strings with same Text- Checked with by using ==" );
			
		}
		else {
			System.out.println("Both Strings are with different Text- Checked with by using ==");
		}
		
		if (str1.equals(str2)) {
			System.out.println("Both Strings with same Text- Checked with by using .equals");
			
		}
		else {
			System.out.println("Both Strings are with different Text- Checked with by using .equals");
		}
		
		if (str1.equalsIgnoreCase(str2)) {
			System.out.println("Both Strings with same Text- Checked with by using .equalsIgnoreCase");
			
		}
		else {
			System.out.println("Both Strings are with different Text- Checked with by using .equalsIgnoreCase");
		}

	}

}
