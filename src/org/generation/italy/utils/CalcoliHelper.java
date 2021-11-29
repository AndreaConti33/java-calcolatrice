package org.generation.italy.utils;

import java.lang.Math;

class CalcoliHelper {

	// Attributi
	private static int a;
	private static int b;
	private static double c;
	private static double d;

	// Costruttori
	private CalcoliHelper() {

	}

	// Metodi

	// Somma tra due interi
	public static int somma(int somma) {
		return a + b;
	}

	// Somma tra due double
	public static double somma(double somma) {
		return c + d;
	}

	// Differenza tra due numeri interi
	public static int differenza(int differenza) {
		return a - b;
	}

	// Differenza tra due numeri double
	public static double differenza(double differenza) {
		return c - d;
	}

	// Moltiplicazione di due numeri interi
	public static int moltiplicazione(int moltiplicazione) {
		return a * b;
	}

	// Moltiplicazione di due numeri double
	public static double moltiplicazione(double moltiplicazione) {
		return c * d;
	}

	// Valore assoluto di un numero intero
	public static int valoreAssoluto(int valoreAssoluto) {
		if (a < 0) {
			valoreAssoluto = a *= -1;
		} else {
			valoreAssoluto = a;
		}
		return valoreAssoluto;
	}

	// Valore assoluto di un numero double
	public static double valoreAssoluto(double valoreAssoluto) {
		if (c < 0) {
			valoreAssoluto = c *= -1;
		} else {
			valoreAssoluto = c;
		}
		return valoreAssoluto;
	}

	// Minimo tra due numeri interi
	public static int minore(int minore) {
		if (a < b) {
			minore = a;
		} else {
			minore = b;
		}
		return minore;
	}

	// Minimo tra due numeri double
	public static double minore(double minore) {
		if (c < d) {
			minore = c;
		} else {
			minore = d;
		}
		return minore;
	}

	// Massimo tra due numeri interi
	public static int maggiore(int maggiore) {
		if (a > b) {
			maggiore = a;
		} else {
			maggiore = b;
		}
		return maggiore;
	}

	// Massimo tra due numeri interi
	public static double maggiore(double maggiore) {
		if (c > d) {
			maggiore = c;
		} else {
			maggiore = d;
		}
		return maggiore;
	}

	// Elevamento alla postenza di interi

	public static double potenza(double base, double esponente) {
		double potenza = 1;
		if (esponente == 0) {
			potenza = 1;
		}
		if (esponente < 0) {
			base = 1 / base;
			potenza = base * -esponente;
		}
		for (double i = 1; i <= esponente; ++i) {
			potenza = potenza * base;
		}
		return potenza;
	}

}
