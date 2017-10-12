package example;

public class Calculator {

	public final String plus = "+";
	public final String minus = "-";
	public final String mnozenie = "*";
	public final String dzielenie = "/";
	
	public double calculator(double a, double b, String operator) throws ArithmeticException, UnknowOperatorException {
		double result = 0;
		
		switch (operator) {
		case plus:
			result = a+b;
			break;
		case minus:
			result = a-b;
			break;
		case mnozenie:
			result = a*b;
			break;
		case dzielenie:
			if(b == 0) {
				throw new ArithmeticException("Nie możesz dzielić przez 0!");
			}
			result = a/b;
			break;
		default:
			throw new UnknowOperatorException("Wykorzystujesz niezdefiniowany operator");
		}
		
		return result;
	}
}