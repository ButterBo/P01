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

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		int a = 69000;
		int b = 420;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a,b);
		
		int expected =69420;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testSubtract() {
		//fail("Not yet implemented");
		int a = 1000;
		int b = 999;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a,b);
		
		int expected =1;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testMultiply() {
		//fail("Not yet implemented");
		int a = 7;
		int b = 8;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(a,b);
		
		int expected = 56;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testDivide() {
		//fail("Not yet implemented");
		int a = 144;
		int b = 12;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a,b);
		
		int expected = 12;
		assertEquals (expected, actual);
	}

	@After
	public void tearDown() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
}