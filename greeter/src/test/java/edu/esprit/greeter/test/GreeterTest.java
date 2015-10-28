package edu.esprit.greeter.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import edu.esprit.greeter.Greteer;

public class GreeterTest {
	Greteer greeter;
	
	@Before
	public void setUp(){
		 greeter = new Greteer();
		
	}
	
	@Test 
	public void itShouldSayHelloWorld(){
		
		
		String result= greeter.sayHello("World");
		Assert.assertEquals("Hello World", result);
	}

	@Test(expected = IllegalArgumentException.class)
	public void itShouldRaiseException(){
		
		String  param= "Man";
		greeter.sayHello(param);
	}
	
	@After
	public void tearDown(){
		// liberer le variable  greeter
		greeter= null;
	}

}
