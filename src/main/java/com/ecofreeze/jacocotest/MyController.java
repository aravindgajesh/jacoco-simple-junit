package com.ecofreeze.jacocotest;

public class MyController {

	public String myMessage(String name) {
		
		StringBuilder s = new StringBuilder();
		if(name == null || name.equals("")) {
			s = s.append("Invalid");
		} else {
			s = s.append("Hi dear "+name);
		}
		System.out.println(s);
		return s.toString();
	}
}
