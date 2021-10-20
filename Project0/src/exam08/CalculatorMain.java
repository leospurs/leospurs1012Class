package exam08;

public class CalculatorMain {

	public static void main(String[] args) {
		
		long num1 = 300;
		long num2 = 400;
		
		Calculator cal = new CalculatorC();
		
		System.out.println("num1 + num2 = " + cal.add(num1, num2));
		
		System.out.println("num1 - num2 = " + cal.substract(num1, num2));
		
		System.out.println("num1 * num2 = " + cal.multiply(num1, num2));
		
		System.out.println("num1 / num2 = " + cal.divide(num1, num2));
	}
}
