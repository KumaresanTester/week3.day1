package week3.day1;

public class LearnOverloading {

	public void add(int a, int b) {
		int sum = a + b;
		System.out.println(sum);
	}

	public void add(int a, int b, int c) {
		int sum = a + b + c;
		System.out.println(sum);
	}

	public void mul(int a, int b) {
		int multiply = a * b;
		System.out.println(multiply);
	}

	public void mul(int a, double b) {
		double multiply = a * b;
		System.out.println(multiply);
	}

	public void sub(int a, int b) {
		int sub = a - b;
		System.out.println(sub);
	}

	public void sub(double a, double b) {
		double sub = a - b;
		System.out.println(sub);
	}

	public void divide(int a, int b) {
		double div = a / b;
		System.out.println(div);
	}

	public void divide(double a, int b) {
		double div = a / b;
		System.out.println(div);
	}

	public static void main(String[] args) {
		LearnOverloading obj = new LearnOverloading();
		obj.add(5, 7);
		obj.add(4, 3, 6);
		obj.mul(4, 5);
		obj.mul(6, 7.5);
		obj.divide(4, 2);
		obj.divide(6.5, 2);
		obj.sub(20, 15);
		obj.sub(20.5, 6);
	}

}
