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

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int suma = obliczSume(scanner);
		System.out.println("Suma wczytanych liczb wynosi " + suma);
		scanner.close();
	}

	public static int obliczSume(Scanner scanner) {
		int suma = 0;
		int liczba;

		do {
			System.out.print("Podaj dodatnią liczbę całkowitą (wpisz 0 lub liczbę ujemną, by zakończyć): ");
			liczba = scanner.nextInt();
			if (liczba > 0) {
				suma += liczba;
			}
		} while (liczba > 0);

		return suma;
	}
}
