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
		int a = 69000;
		int b = 420;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a,b);
		
		int expected =69420;
		assertEquals (expected, actual);
	}
	
	@Test //Boundary
	public void testAddB() {
		//fail("Not yet implemented");
		int a = 0;
		int b = 9999999;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a,b);
		
		int expected = 9999999;
		assertEquals (expected, actual);
	}
	
	@Test //Error
	public void testAddE() {
		//fail("Not yet implemented");
		int a = 0;
		int b = 9999999;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a,b);
		
		String expected = "Banana";
		assertNotEquals (expected, actual);
	}
	
	@Test //Normal
	public void testSubtractN() {
		//fail("Not yet implemented");
		int a = 1000;
		int b = 999;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a,b);
		
		int expected =1;
		assertEquals (expected, actual);
	}
	
	@Test //Boundary
	public void testSubtractB() {
		//fail("Not yet implemented");
		int a = 10000;
		int b = 0;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a,b);
		
		int expected = 10000;
		assertEquals (expected, actual);
	}
	
	@Test //Error
	public void testSubtractE() {
		//fail("Not yet implemented");
		int a = -1;
		int b = 999;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a,b);
		
		int expected = 1000;
		assertNotEquals (expected, actual);
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
		int a = 1;
		int b = 99999;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(a,b);
		
		int expected = 99999;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testMultiplyE() {
		//fail("Not yet implemented");
		int a = 0;
		int b = 0;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(a,b);
		
		int expected = 1;
		assertNotEquals (expected, actual);
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
		int a = 10000;
		int b = 1;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a,b);
		
		int expected = 10000;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testDivideE() {
		//fail("Not yet implemented");
		int a = 144;
		int b = 13;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a,b);
		
		int expected = 12;
		assertNotEquals (expected, actual);
	}

	@After
	public void tearDown() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
}