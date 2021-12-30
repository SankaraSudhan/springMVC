package java6;

import java.util.Scanner;

public class Add {
	private String string1;
	private String string2;
	private String string3;
	
	public Add(String string1, String string2, String string3) {
		super();
		this.string1 = string1;
		this.string2 = string2;
		this.string3 = string3;
		
	}
	String concate()
	{
		String s1 = string1+string2+string3;
		return s1;
	}
	   
	class StringConcat{
		public static void main(String[] args) {
			System.out.println("Enter three strings: ");
			Scanner sc = new Scanner(System.in);
			String string1 = sc.nextLine();
			String string2 = sc.nextLine();
			String string3 = sc.nextLine();
			Add obj = new Add(string1, string2, string3);
			String result = obj.concate();
			System.out.println(result);
			
			
					
		}
	}

}
