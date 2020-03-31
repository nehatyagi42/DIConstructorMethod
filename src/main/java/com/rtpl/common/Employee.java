package com.rtpl.common;

public class Employee {

	private int Id;
	private String Name;
	
	public Employee() {
		
		System.out.println("Constructor Method printed");
	}
	
	public Employee(int id) {
		this.Id=id;
	}
	public Employee(String name) {  
		this.Name = name;
	}  
	
	public Employee(int id, String name) {  
	    this.Id = id;  
	    this.Name = name;  
	}  
	
	void show(){  
	    System.out.println(Id+" "+Name);  
	}  
	  
}
