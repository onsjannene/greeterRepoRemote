package edu.esprit.greeter;

public class Greteer {
	public String val2;
	public String sayHello(String name){
		
		if(name.equals("Man"))
			throw new IllegalArgumentException();
		return "Hello " +  name;
	}

}
