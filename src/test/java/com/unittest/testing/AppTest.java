package com.unittest.testing;
import static org.hamcrest.CoreMatchers.both;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.everyItem;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
public class AppTest 
{
	Fahrenheit object;
	@Before
	public void newClassFahrenheit() {
		object = new Fahrenheit(); 
	}
	@Test
	public void testResultInput0() {
		double input = 0;
		double expected = 0;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected, actual,2);
	}
	@Test
	public void testResultInput1000() {
		double input = 1000;
		double expected = 1000;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected, actual,2);
	}
	@Test
	public void testResultInputMinus1000() {
		double input = -1000;
		double expected = -1000;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected, actual,2);
	}
	@Test
	public void testResultTrueInput0() {
		double input = 0;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testResultTrueInput1000() {
		double input = 1000;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testResultTrueInputMinus1000() {
		double input = -1000;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testResultTrueInput2000() {
		double input = 2000;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testResultTrueInputMinus2000() {
		double input = -2000;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testResultInput1() {
		double input = 1;
		double expected = 1;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected, actual,2);
	}
	@Test
	public void testResultInputMinus1() {
		double input = -1;
		double expected = -1;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected, actual,2);
	}
	@Test
	public void testResultInput499() {
		double input = 499;
		double expected = 499;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected, actual,2);
	}
	@Test
	public void testResultInputMinus499() {
		double input = -499;
		double expected = -499;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected, actual,2);
	}
	@Test
	public void testResultInput500() {
		double input = 500;
		double expected = 500;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected, actual,2);
	}
	@Test
	public void testResultInputMinus500() {
		double input = -500;
		double expected = -500;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected, actual,2);
	}
	@Test
	public void testResultInput501() {
		double input = 501;
		double expected = 501;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected, actual,2);
	}
	@Test
	public void testResultInputMinus501() {
		double input = -501;
		double expected = -501;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected, actual,2);
	}
	@Test
	public void testResultInput999() {
		double input = 999;
		double expected = 999;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected, actual,2);
	}
	@Test
	public void testResultInputMinus999() {
		double input = -999;
		double expected = -999;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected, actual,2);
	}
	@Test
	public void testResultInput1001() {
		double input = 1001;
		double expected = 1001;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected, actual,2);
	}
	@Test
	public void testResultInputMinus1001() {
		double input = -1001;
		double expected = -1001;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected, actual,2);
	}
	@Test
	public void testResultInput1010() {
		double input = 1010;
		double expected = 1010;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected, actual,2);
	}
	@Test
	public void testResultInputMinus1010() {
		double input = -1010;
		double expected = -1010;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected, actual,2);
	}
	@Test
	public void testResultTrueInput1010() {
		double input = 1010;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testResultTrueInputMinus1010() {
		double input = -1010;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testResultTrueInput999() {
		double input = 999;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testResultTrueInputMinus999() {
		double input = -999;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testResultTrueInput501() {
		double input = 501;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testResultTrueInputMinus501() {
		double input = -501;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testResultTrueInput500() {
		double input = 500;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testResultTrueInputMinus500() {
		double input = -500;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testResultTrueInput499() {
		double input = 499;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testResultTrueInputMinus499() {
		double input = -499;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testResultTrueInput1() {
		double input = 1;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testResultTrueInputMinus1() {
		double input = -1;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testResultMinus3568CalculateFromInputMinus2000() {
		double input = -2000;
		double expected = -3568.00;
		object.input(input);
		object.calculate();
		double actual = object.getFahnrenhiet();
		assertEquals(expected, actual, 2);
	}
	@Test
	public void testResultMinus1786CalculateFromInputMinus1010() {
		double input = -1010;
		double expected = -1786.00;
		object.input(input);
		object.calculate();
		double actual = object.getFahnrenhiet();
		assertEquals(expected, actual, 2);
	}
	@Test
	public void testResultMinus1786point8CalculateFromInputMinus1001() {
		double input = -1001;
		double expected = -1769.80;
		object.input(input);
		object.calculate();
		double actual = object.getFahnrenhiet();
		assertEquals(expected, actual, 2);
	}
	@Test
	public void testResultMinus1768CalculateFromInputMinus1000() {
		double input = -1000;
		double expected = -1768.00;
		object.input(input);
		object.calculate();
		double actual = object.getFahnrenhiet();
		assertEquals(expected, actual, 2);
	}
	@Test
	public void testResultMinus1766point2CalculateFromInputMinus999() {
		double input = -999;
		double expected = -1766.20;
		object.input(input);
		object.calculate();
		double actual = object.getFahnrenhiet();
		assertEquals(expected, actual, 2);
	}
	@Test
	public void testResultMinus869point8CalculateFromInputMinus501() {
		double input = -501;
		double expected = -869.80;
		object.input(input);
		object.calculate();
		double actual = object.getFahnrenhiet();
		assertEquals(expected, actual, 2);
	}
	@Test
	public void testResultMinus868point8CalculateFromInputMinus500() {
		double input = -500;
		double expected = -868.00;
		object.input(input);
		object.calculate();
		double actual = object.getFahnrenhiet();
		assertEquals(expected, actual, 2);
	}
	@Test
	public void testResultMinas866point2CalculateFromInputMinus499() {
		double input = -499;
		double expected = -866.20;
		object.input(input);
		object.calculate();
		double actual = object.getFahnrenhiet();
		assertEquals(expected, actual, 2);
	}
	@Test
	public void testResult30point2CalculateFromInputMinas1() {
		double input = -1;
		double expected = 30.20;
		object.input(input);
		object.calculate();
		double actual = object.getFahnrenhiet();
		assertEquals(expected, actual, 2);
	}
	@Test
	public void testResult32CalculateFromInput0() {
		double input = 0;
		double expected = 32.00;
		object.input(input);
		object.calculate();
		double actual = object.getFahnrenhiet();
		assertEquals(expected, actual, 2);
	}
	@Test
	public void testResult33point8CalculateFromInput1() {
		double input = 1;
		double expected = 33.80;
		object.input(input);
		object.calculate();
		double actual = object.getFahnrenhiet();
		assertEquals(expected, actual, 2);
	}
	@Test
	public void testResult930point2CalculateFromInput499() {
		double input = 499;
		double expected = 930.20;
		object.input(input);
		object.calculate();
		double actual = object.getFahnrenhiet();
		assertEquals(expected, actual, 2);
	}
	@Test
	public void testResult932CalculateFromInput500() {
		double input = 500;
		double expected = 932.00;
		object.input(input);
		object.calculate();
		double actual = object.getFahnrenhiet();
		assertEquals(expected, actual, 2);
	}
	@Test
	public void testResult933point8CalculateFromInput501() {
		double input = 501;
		double expected = 933.80;
		object.input(input);
		object.calculate();
		double actual = object.getFahnrenhiet();
		assertEquals(expected, actual, 2);
	}
	@Test
	public void testResult1830point2CalculateFromInput999() {
		double input = 999;
		double expected = 1830.20;
		object.input(input);
		object.calculate();
		double actual = object.getFahnrenhiet();
		assertEquals(expected, actual, 2);
	}
	@Test
	public void testResult1832CalculateFromInput1000() {
		double input = 1000;
		double expected = 1832.00;
		object.input(input);
		object.calculate(); 
		double actual = object.getFahnrenhiet();
		assertEquals(expected, actual, 2);
	}
	@Test
	public void testResult1833point8CalculateFromInput1001() {
		double input = 1001;
		double expected = 1833.80;
		object.input(input);
		object.calculate();
		double actual = object.getFahnrenhiet();
		assertEquals(expected, actual, 2);
	}
	@Test
	public void testResult1850CalculateFromInput1010() {
		double input = 1010;
		double expected = 1850.00;
		object.input(input);
		object.calculate();
		double actual = object.getFahnrenhiet();
		assertEquals(expected, actual, 2);
	}
	@Test
	public void testResult3632CalculateFromInput2000() {
		double input = 2000;
		double expected = 3632.00;
		object.input(input);
		object.calculate();
		double actual = object.getFahnrenhiet();
		assertEquals(expected, actual, 2);
	}
	@Test
	public void testResultMessageOutputFromInputMinas2000() {
		double input = -2000;
		String expected = "-2000 Celcius = -3568.00 Fahrenheit";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	@Test
	public void testResultMessageOutputFromInputMinas1010() {
		double input = -1010;
		String expected = "-1010 Celcius = -1786.00 Fahrenheit";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	@Test
	public void testResultMessageOutputFromInputMinas1001() {
		double input = -1001;
		String expected = "-1001 Celcius = -1769.80 Fahrenheit";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	@Test
	public void testResultMessageOutputFromInputMinas1000() {
		double input = -1000;
		String expected = "-1000 Celcius = -1768.00 Fahrenheit";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	@Test
	public void testResultMessageOutputFromInputMinas999() {
		double input = -999;
		String expected = "-999 Celcius = -1766.20 Fahrenheit";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	@Test
	public void testResultMessageOutputFromInputMinas501() {
		double input = -501;
		String expected = "-501 Celcius = -869.80 Fahrenheit";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	@Test
	public void testResultMessageOutputFromInputMinas500() {
		double input = -500;
		String expected = "-500 Celcius = -868.00 Fahrenheit";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	@Test
	public void testResultMessageOutputFromInputMinas499() {
		double input = -499;
		String expected = "-499 Celcius = -866.20 Fahrenheit";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	@Test
	public void testResultMessageOutputFromInputMinas1() {
		double input = -1;
		String expected = "-1 Celcius = 30.20 Fahrenheit";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	@Test
	public void testResultMessageOutputFromInput0() {
		double input = 0;
		String expected = "0 Celcius = 32.00 Fahrenheit";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	@Test
	public void testResultMessageOutputFromInput1() {
		double input = 1;
		String expected = "1 Celcius = 33.80 Fahrenheit";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	@Test
	public void testResultMessageOutputFromInput499() {
		double input = 499;
		String expected = "499 Celcius = 930.20 Fahrenheit";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	@Test
	public void testResultMessageOutputFromInput500() {
		double input = 500;
		String expected = "500 Celcius = 932.00 Fahrenheit";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	@Test
	public void testResultMessageOutputFromInput501() {
		double input = 501;
		String expected = "501 Celcius = 933.80 Fahrenheit";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	@Test
	public void testResultMessageOutputFromInput999() {
		double input = 999;
		String expected = "999 Celcius = 1830.20 Fahrenheit";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	@Test
	public void testResultMessageOutputFromInput1000() {
		double input = 1000;
		String expected = "1000 Celcius = 1832.00 Fahrenheit";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	@Test
	public void testResultMessageOutputFromInput1001() {
		double input = 1001;
		String expected = "1001 Celcius = 1833.80 Fahrenheit";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	@Test
	public void testResultMessageOutputFromInput1010() {
		double input = 1010;
		String expected = "1010 Celcius = 1850.00 Fahrenheit";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	@Test
	public void testResultMessageOutputFromInput2000() {
		double input = 2000;
		String expected = "2000 Celcius = 3632.00 Fahrenheit";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
}