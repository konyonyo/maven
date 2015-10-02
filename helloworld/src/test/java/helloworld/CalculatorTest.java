package helloworld;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class CalculatorTest {
	@Test
	public void multiplyで3と4の乗算結果が取得できる() throws Exception {
		Calculator cal = new Calculator();
		int expected = 12;
		int actual = cal.multiply(3, 4);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void divideで3と2の除算結果が取得できる() throws Exception {
		Calculator cal = new Calculator();
		float expected = 1.5f;
		float actual = cal.divide(3, 2);
		assertThat(actual, is(expected));
	}
}
