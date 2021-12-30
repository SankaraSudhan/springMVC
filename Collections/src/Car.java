
public class Car implements Comparable<Car> {
	private int engineNumber;
	private String model;
	private String varient;

	public int getEngineNumber() {
		return engineNumber;
	}

	public void setEngineNumber(int engineNumber) {
		this.engineNumber = engineNumber;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getVarient() {
		return varient;
	}

	public void setVarient(String varient) {
		this.varient = varient;
	}

	public Car(int engineNumber, String model, String varient) {
		super();
		this.engineNumber = engineNumber;
		this.model = model;
		this.varient = varient;
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Car o) {
		if(this.engineNumber==o.engineNumber) {
			return 0;
		
		}else if(this.engineNumber>o.engineNumber) {
			return 1;
		}else {
			return -1;
		}

	}

	@Override
	public String toString() {
		return "\nengineNumber=" + engineNumber + ", \nmodel=" + model + ",\nvarient=" + varient + "";
	}

	
}
