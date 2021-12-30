package java6;
//create a java class with private data members make use of getters and setters to calculate the sum of datamembers(class-Student,datamembers-tamil,english,maths,social,science,total) create a non static  method to calculate the sum and store it in total

public class DataMembers {
 private int tamil;
 private int english;
 private int maths;
 private int social;
 private int science;
 private int total;
public int getTamil() {
	return tamil;
}
public void setTamil(int tamil) {
	this.tamil = tamil;
}
public int getEnglish() {
	return english;
}
public void setEnglish(int english) {
	this.english = english;
}
public int getMaths() {
	return maths;
}
public void setMaths(int maths) {
	this.maths = maths;
}
public int getSocial() {
	return social;
}
public void setSocial(int social) {
	this.social = social;
}
public int getScience() {
	return science;
}
public void setScience(int science) {
	this.science = science;
}
public int getTotal() {
	return total;
}
public void setTotal(int total) {
	this.total = total;
}
 public int sum() 
 {
	 int total = tamil+english+maths+science+social;
	return total;
	 
 }
 
}

