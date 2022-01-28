import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TestCarMain {
	public static void main(String[] args) {
		List<Car> carList = new ArrayList<Car>();
		Car c1 = new Car (12,"suv","petrol");
		Car c2 = new Car (10,"sedan","diesel");
		Car c3 = new Car (11,"mini","petrol");
		carList.add(c1);
		carList.add(c2);
		carList.add(c3);
		System.out.println(carList);
		Collections.sort(carList);
		System.out.println(carList);
		Collections.reverse(carList);
		System.out.println(carList);
	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter model: ");
     String model = sc.nextLine();
     List<Car> resList =new ArrayList<Car>();
     
     for(int i=0;i<carList.size();i++)
     {
    	 if(carList.get(i).getModel().equals(model))
    	 {
    		 resList.add(carList.get(i));
    	 }
     }
     
     System.out.println(resList);
     
     List<Car> resList1 = (List<Car>) carList.stream().filter(c-> c.getModel().equals("suv"));
     System.out.println(resList);
     
	}
	

}
