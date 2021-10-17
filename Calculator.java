package week3.day1;

public class Calculator implements InterfaceConcept, SecondInterface {

	public void add(int a, int b, int c) {
		int sum = a + b + c;
		System.out.println(sum);
	}

	public void sub(int a, int b) {
		int subtract = a - b;
		System.out.println(subtract);
	}

	public void multi(int a, int b) {
		int mul = a * b;
		System.out.println(mul);
	}
	
	public void divide() {
		int div= 4/2;
		System.out.println(div);
	}

	public void welcomeNote(String name) {

		System.out.println(name);
	}

}
