package io.operator;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class MainClass {
	public static void main(String[] args) {
		ClassPathResource resource=new ClassPathResource("berbin.xml");  
	    BeanFactory factory=new XmlBeanFactory(resource); 
	    
	    SpringOne student=(SpringOne)factory.getBean("name");  
	   
	    student.displayinfo("sudhan");
	    student.displayinfo("berbin");

	}

}
