package java6;

public class ConstructorSample {
	int num1;
	int num2;
	
	// create constructor 
	public ConstructorSample(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	
	int  addelement()
	{
		int total =0;
		total = num1+num2;
		return total;
	}

}
