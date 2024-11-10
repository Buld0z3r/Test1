/*
 * Copyright 2015-2024 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculatorTest {

	private final Calculator calculator = new Calculator();

	@Test
	void testAdd() {
		assertEquals(5, calculator.add(2, 3));
		assertEquals(-1, calculator.add(2, -3));
	}

	@Test
	void testSubtract() {
		assertEquals(-1, calculator.subtract(2, 3));
		assertEquals(5, calculator.subtract(2, -3));
	}

	@Test
	void testMultiply() {
		assertEquals(6, calculator.multiply(2, 3));
		assertEquals(-6, calculator.multiply(2, -3));
	}

	@Test
	void testDivide() {
		assertEquals(2.0, calculator.divide(6, 3));
		assertEquals(-2.0, calculator.divide(6, -3));
	}

	@Test
	void testPower() {
		assertEquals(8.0, calculator.power(2, 3));
		assertEquals(1.0, calculator.power(2, 0));
		assertEquals(0.125, calculator.power(2, -3));
	}

	@Test
	void testSqrt() {
		assertEquals(3.0, calculator.sqrt(9));
		assertEquals(0.0, calculator.sqrt(0));
	}
}