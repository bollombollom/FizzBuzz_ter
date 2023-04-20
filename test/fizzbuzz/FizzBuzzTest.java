package fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	private FizzBuzz fb;

	@BeforeEach
	void setUp() throws Exception {
		fb = new FizzBuzz();
	}

	@Test
	void fizzbuzz_repond_1_pour_1() {
		assertEquals("1", fb.fizzBuzz(1));
	}

	@Test
	void fizzbuzz_repond_2_pour_2() {
		assertEquals("2", fb.fizzBuzz(2));
	}

	@Test
	void fizzbuzz_repond_3_pour_3() {
		assertEquals("fizz", fb.fizzBuzz(3));
	}

	@Test
	void fizzbuzz_repond_un_entier() {
		assertEquals("4", fb.fizzBuzz(4));
		assertEquals("7", fb.fizzBuzz(7));
		assertEquals("13", fb.fizzBuzz(13));
	}

	@Test
	void fizzbuzz_repond_buzz() {
		assertEquals("buzz", fb.fizzBuzz(5));
	}

	@Test
	void fizzbuzz_repond_correctement_sur_multiple() {
		assertEquals("fizz", fb.fizzBuzz(6));
		assertEquals("buzz", fb.fizzBuzz(400));

	}

}
