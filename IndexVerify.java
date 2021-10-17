package week3.day1;

public class IndexVerify {

	public static void main(String[] args) {

		String text = "Java Exercise";

		char[] charArray = text.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == 'E') {

				System.out.println("Index of E is " + i);
			}
			if (charArray[i] == 's') {
				System.out.println("Index of s is " + i);
			}
		}
	}
}
