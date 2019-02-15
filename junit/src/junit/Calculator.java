package junit;

public class Calculator {
	private int a;
	private int b;
	
	public Calculator() {
		// TODO Auto-generated constructor stub
	}
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public int div(int a, int b) {
		return a/b;
	}
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	
}
