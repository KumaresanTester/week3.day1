package week3.day1;

public class Execution {

	public static void main(String[] args) {

		BMW b = new BMW();
		b.airBagEnabled();
		b.closreDoor();
		b.driveVehicle();
		b.accelarate();
		b.fillFuel();
		b.shiftGear();
		b.airBagEnabled();
		
		System.out.println("Wheel Count "+b.wheelCar);
	}

}
