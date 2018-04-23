package hello;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator calc = new Calculator();

		int result;
		result = calc.add(1, 2);
		System.out.println(result);

		System.out.println(calc.add(5,3));

	}

}
