package java6;

public abstract class Car {
	private int noOfWheels;
	private String type;
	
	
	public Car(int noOfWheels, String type) {
		super();
		this.noOfWheels = noOfWheels;
		this.type = type;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getNoOfWheels() {
		return noOfWheels;
	}
	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public void showOff()
	{
		System.out.println("This is my parent class");
	}
	
    public  abstract void test();
    public  abstract void test1();
    

	
}	 
 

