package com.sudhan;
import java.util.*;

public class SwitchExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Choose any one VIBGYOR colour");
		char colours = sc.next().charAt(0);
		switch(colours) {
		
		case 'V':
		{
			System.out.println("violet");
			break;
		}
		case 'I':
		{
			System.out.println("indigo");
			break;
		}
		case 'B':
		{
			System.out.println("blue");
			break;
		}
		case 'G':
		{
			System.out.println("green");
			break;
		}
		case 'Y':
		{
			System.out.println("yellow");
			break;
		}
		case 'O':
		{
			System.out.println("orange");
			break;
		}
		case 'R':
		{
			System.out.println("red");
			break;
		}
		default:
		{
			System.out.println("printing VIBGYOR colours");
		}
		}
	}

}

