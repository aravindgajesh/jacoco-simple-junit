package com.ecofreeze.jacocotest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyControllerTest {

	@Test
	 public void getMessageValidCheck()
	    {
		MyController obj = new MyController();
		 Assertions.assertEquals("Hi dear Aravind", obj.myMessage("Aravind"));
	    }
}
