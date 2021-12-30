package java6;

public  class Suzuki extends Car{
	 private double topSpeed;

	public Suzuki(double topSpeed) {
		super();
		this.topSpeed = topSpeed;
	}

	public Suzuki() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(double topSpeed) {
		this.topSpeed = topSpeed;
	}

	
	public void test() {
		System.out.println("Test is failed");
	}

	
	public void test1() {
		System.out.println("Test is success");
		
	}
	
  public void showOff(){
	  System.out.println("This is my child class");
  }
	
}
