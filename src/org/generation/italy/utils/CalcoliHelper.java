package org.generation.italy.utils;

class CalcoliHelper {

	// Costruttori
	private CalcoliHelper() {
	}

	// Metodi

	// Somma tra due interi
	public static int somma(int a, int b) {
		return a + b;
	}

	// Somma tra due double
	public static double somma(double c, double d) {
		return c + d;
	}

	// Differenza tra due numeri interi
	public static int differenza(int a, int b) {
		return a - b;
	}

	// Differenza tra due numeri double
	public static double differenza(double c, double d) {
		return c - d;
	}

	// Moltiplicazione di due numeri interi
	public static int moltiplicazione(int a, int b) {
		return a * b;
	}

	// Moltiplicazione di due numeri double
	public static double moltiplicazione(double c, double d) {
		return c * d;
	}

	// Valore assoluto di un numero intero
	public static int valoreAssoluto(int a) {
		if (a < 0) {
			return a *= -1;
		} else {
			return a;
		}
	}

	// Valore assoluto di un numero double
	public static double valoreAssoluto(double c) {
		if (c < 0) {
			return c *= -1;
		} else {
			return c;
		}
	}

	// Minimo tra due numeri interi
	public static int minore(int a, int b) {
		if (a < b) {
			return a;
		} else {
			return b;
		}
	}

	// Minimo tra due numeri double
	public static double minore(double c, double d) {
		if (c < d) {
			return c;
		} else {
			return d;
		}
	}

	// Massimo tra due numeri interi
	public static int maggiore(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	// Massimo tra due numeri interi
	public static double maggiore(double c, double d) {
		if (c > d) {
			return c;
		} else {
			return d;
		}
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
