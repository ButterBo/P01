import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test //Normal
	public void testAddN() {
		//fail("Not yet implemented");
		int a = 69;
		int b = 420;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a,b);
		
		int expected = 489;
		assertEquals (expected, actual);
	}
	
	@Test //Boundary
	public void testAddB() {
		//fail("Not yet implemented");
		int a = 0;
		int b = 9999;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a,b);
		
		int expected = 9999;
		assertEquals (expected, actual);
	}
	
	@Test //Error
	public void testAddE() {
		//fail("Not yet implemented");
		int a = -1;
		int b = -1;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a,b);
		
		int expected = -69;
		assertEquals (expected, actual);
	}
	
	@Test //Normal
	public void testSubtractN() {
		//fail("Not yet implemented");
		int a = 100;
		int b = 999;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a,b);
		
		int expected = -899;
		assertEquals (expected, actual);
	}
	
	@Test //Boundary
	public void testSubtractB() {
		//fail("Not yet implemented");
		int a = 9999;
		int b = 0;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a,b);
		
		int expected = 9999;
		assertEquals (expected, actual);
	}
	
	@Test //Error
	public void testSubtractE() {
		//fail("Not yet implemented");
		int a = -1;
		int b = -1;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a,b);
		
		int expected = -69;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testMultiplyN() {
		//fail("Not yet implemented");
		int a = 7;
		int b = 8;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(a,b);
		
		int expected = 56;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testMultiplyB() {
		//fail("Not yet implemented");
		int a = 0;
		int b = 9999;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(a,b);
		
		int expected = 0;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testMultiplyE() {
		//fail("Not yet implemented");
		int a = -12;
		int b = 2000;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(a,b);
		
		int expected = -69;
		assertEquals (expected, actual);
	}
	
	
	@Test
	public void testDivideN() {
		//fail("Not yet implemented");
		int a = 144;
		int b = 12;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a,b);
		
		int expected = 12;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testDivideB() {
		//fail("Not yet implemented");
		int a = 0;
		int b = 9999;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a,b);
		
		int expected = 0;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testDivideE() {
		//fail("Not yet implemented");
		int a = 12;
		int b = -2;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a,b);
		
		int expected = -69;
		assertEquals (expected, actual);
	}

	@After
	public void tearDown() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
}