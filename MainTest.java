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
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class MainTest {

	@Test
	public void testObliczSume() {
		// Symulacja wejścia użytkownika
		String input = "5\n10\n3\n0\n"; // Użytkownik wpisuje 5, 10, 3, a następnie 0
		InputStream in = new ByteArrayInputStream(input.getBytes());
		Scanner scanner = new Scanner(in);

		int suma = Main.obliczSume(scanner);

		assertEquals(18, suma); // Oczekiwana suma to 5 + 10 + 3 = 18

		scanner.close();
	}
		@Test
		public void testObliczSumeZZeroNaPoczatku() {
			String input = "0\n"; // Użytkownik wpisuje 0 od razu
			InputStream in = new ByteArrayInputStream(input.getBytes());
			Scanner scanner = new Scanner(in);

			int suma = Main.obliczSume(scanner);

			assertEquals(0, suma); // Oczekiwana suma to 0

			scanner.close();
		}

		@Test
		public void testObliczSumeZNegatywnymiLiczbami() {
			String input = "-5\n-10\n-3\n0\n"; // Użytkownik wpisuje same liczby ujemne
			InputStream in = new ByteArrayInputStream(input.getBytes());
			Scanner scanner = new Scanner(in);

			int suma = Main.obliczSume(scanner);

			assertEquals(0, suma); // Oczekiwana suma to 0

			scanner.close();
		}

		@Test
		public void testObliczSumeZJednaDodatniaLiczba() {
			String input = "15\n0\n"; // Użytkownik wpisuje jedną liczbę dodatnią, a następnie 0
			InputStream in = new ByteArrayInputStream(input.getBytes());
			Scanner scanner = new Scanner(in);

			int suma = Main.obliczSume(scanner);

			assertEquals(15, suma); // Oczekiwana suma to 15

			scanner.close();
		}

		@Test
		public void testObliczSumeZWielomaDodatnimiLiczbami() {
			String input = "2\n4\n6\n8\n0\n"; // Użytkownik wpisuje kilka dodatnich liczb, a następnie 0
			InputStream in = new ByteArrayInputStream(input.getBytes());
			Scanner scanner = new Scanner(in);

			int suma = Main.obliczSume(scanner);

			assertEquals(20, suma); // Oczekiwana suma to 2 + 4 + 6 + 8 = 20

			scanner.close();
		}

		@Test
		public void testObliczSumeZBrakDodatnichLiczb() {
			String input = "-1\n-2\n-3\n-4\n0\n"; // Użytkownik wpisuje słowa, a następnie 0
			InputStream in = new ByteArrayInputStream(input.getBytes());
			Scanner scanner = new Scanner(in);

			int suma = Main.obliczSume(scanner);

			assertEquals(0, suma); // Oczekiwana suma to 0

			scanner.close();
		}
	@Test
	public void testObliczSumeZBrakDanych() {
		String input = "hello\nworld\n0\n"; // Użytkownik wpisuje tylko słowa, a następnie 0
		InputStream in = new ByteArrayInputStream(input.getBytes());
		Scanner scanner = new Scanner(in);

		int suma = Main.obliczSume(scanner);

		assertEquals(0, suma);

		scanner.close();
	}

	@Test
	public void testObliczSumeZMieszanymiDanymi() {
		String input = "10\nfoo\n20\nbar\n30\n0\n"; // Mieszane dane: liczby i słowa
		InputStream in = new ByteArrayInputStream(input.getBytes());
		Scanner scanner = new Scanner(in);

		int suma = Main.obliczSume(scanner);

		assertEquals(0, suma);

		scanner.close();
	}
}
