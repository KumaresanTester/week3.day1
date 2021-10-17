package week3.day1;

public class Student {

	public void getStudentInfo() {
		System.out.println("Student info");
	}

	public void getStudentInfo(int id) {
		System.out.println("Student ID is " + id);
	}

	public void getStudentInfo(int id, String name) {
		System.out.println("Student ID is " + id + " and Student Name is " + name);
	}

	public void getStudentInfo(String emailId, long phoneNumber) {
		System.out.println("Student Email id is " + emailId + " and Student Phone Number is " + phoneNumber);
	}
	
	public static void main(String[] args) {
		Student obj = new Student();
		obj.getStudentInfo(744964);
		obj.getStudentInfo();
		obj.getStudentInfo(744964, "Kumaresan");
		obj.getStudentInfo("Kumaresh89@gmail.com", 8936524797L);
	}
}
