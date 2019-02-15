package junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class juntest {
	private Calculator cal;
	
	@Before
	public void setup() {
		cal = new Calculator();
		System.out.println("Setup");
	}
	
	@Test
	public void add() {
		assertEquals(3, cal.add(2, 1));
		System.out.println("add");
	}
	
	@Test
	public void div() {
		assertEquals(2, cal.div(4, 2));
		System.out.println("div");
	}
	
	@After
	public void tear() {
		System.out.println("test");
	}
}
