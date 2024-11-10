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

public class Calculator {

	public int add(int a, int b) {
		return a + b;
	}

	public int subtract(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public double divide(int a, int b) {
		if (b == 0) {
			throw new IllegalArgumentException("Cannot divide by zero.");
		}
		return (double) a / b;
	}

	public double power(int base, int exponent) {
		return Math.pow(base, exponent);
	}

	public double sqrt(int a) {
		if (a < 0) {
			throw new IllegalArgumentException("Cannot take square root of a negative number.");
		}
		return Math.sqrt(a);
	}
}
