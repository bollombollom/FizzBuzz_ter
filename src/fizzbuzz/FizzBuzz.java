package fizzbuzz;

public class FizzBuzz {

	private static final String FIZZ = "fizz";

	public String fizzBuzz(int numero) {
		if (numero == 3)
			return FIZZ;
		return Integer.toString(numero);
	}

}
