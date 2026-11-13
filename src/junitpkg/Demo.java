package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Demo {
	
	@Before
	public void envsetup() {
		System.out.println("Browser and url setup");
	}
	
	@Test
public void titleverification() {
		System.out.println("Title verification ");
	}
	
	@Test
	public void currenturl() {
		System.out.println("current url");
	}
	@Test
	public void opensourse() {
		System.out.println("Test contains");
	}
	@After
	public void browserclose() {
		System.out.println("Browser clsoe");
	}
	

}
