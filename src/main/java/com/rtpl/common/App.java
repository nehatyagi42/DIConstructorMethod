package com.rtpl.common;




import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.*;  

/**
 * Hello world!
 *
 */
public class App{ 

    public static void main( String[] args ) {
    	 Resource resource=new ClassPathResource("spring.xml");  
         BeanFactory factory=new XmlBeanFactory(resource);  
    	 Employee emp=(Employee)factory.getBean("employee");  
         emp.show();  
    	
    	
    }
   
}
	