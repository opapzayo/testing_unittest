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
	
}
	
	
	
	
