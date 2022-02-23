package week1.assignment;

public class Car {
	public void applyBreak()
	{
		System.out.println("applyBreak");
	}
	public void applyGear()
	{
		System.out.println("gear");
	}
	public void switchonAc()
	{
		System.out.println("on Ac");
	}
	public void applyAccelerate()
	{
		System.out.println("accelerate");
	}

	public static void main(String[] args) {
		Car lenovo=new Car();
		lenovo.applyBreak();
		lenovo.applyGear();
		lenovo.switchonAc();
		lenovo.applyAccelerate();

	}

}
