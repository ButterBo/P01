
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int add (int a, int b) {
		if (a>-1 && b >-1 && a < 10000 && b < 10000) {
			return a + b;
		} else {
			return -69;
		}
		
	}

	public int subtract (int a, int b) {
		if (a>-1 && b >-1 && a < 10000 && b < 10000) {
			return a - b;
		} else {
			return -69;
		}
	}
	
	public int multiply (int a, int b) {
		if (a>-1 && b >-1 && a < 10000 && b < 10000) {
			return a * b;
		} else {
			return -69;
		}
	}
	
	public int divide (int a, int b) {
		if (b==0) {
			throw new IllegalArgumentException();
		} 	
		if (a>-1 && b >-1 && a < 10000 && b < 10000) {
			return a / b;
		} else {
			return -69;
		}
	}

}
