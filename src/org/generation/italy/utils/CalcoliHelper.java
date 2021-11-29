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

	// Getters and setters
	public static int getA() {
		return a;
	}

	public static void setA(int a) {
		CalcoliHelper.a = a;
	}

	public static int getB() {
		return b;
	}

	public static void setB(int b) {
		CalcoliHelper.b = b;
	}

	public static double getC() {
		return c;
	}

	public static void setC(double c) {
		CalcoliHelper.c = c;
	}

	public static double getD() {
		return d;
	}

	public static void setD(double d) {
		CalcoliHelper.d = d;
	}

	// Metodi

	// Somma tra due interi
	public static int sommaInt() {
		int sommaInt = a + b;
		return sommaInt;
	}

	// Somma tra due double
	public static double sommaDouble() {
		double sommaDouble = c + d;
		return sommaDouble;
	}

	// Differenza tra due numeri interi
	public static int differenzaInt() {
		int differenzaInt = a - b;
		return differenzaInt;
	}

	// Differenza tra due numeri double
	public static double differenzaDouble() {
		double differenzaDouble = c - d;
		return differenzaDouble;
	}

	// Moltiplicazione di due numeri interi
	public static int moltiplicazioneInt() {
		int moltiplicazioneInt = a * b;
		return moltiplicazioneInt;
	}

	// Moltiplicazione di due numeri double
	public static double moltiplicazioneDouble() {
		double moltiplicazioneDouble = c * d;
		return moltiplicazioneDouble;
	}

	// Valore assoluto di un numero intero
	public static int valoreAssolutoInt() {
		int valoreAssolutoInt = Math.abs(a);
		return valoreAssolutoInt;
	}

	// Valore assoluto di un numero double
	public static double valoreAssolutoDouble() {
		double valoreAssolutoDouble = Math.abs(c);
		return valoreAssolutoDouble;
	}

	// Minimo tra due numeri interi
	public static int minoreInt() {
		int minoreInt;
		if (a < b) {
			minoreInt = a;
		} else {
			minoreInt = b;
		}
		return minoreInt;
	}

	// Minimo tra due numeri double
	public static double minoreDouble() {
		double minoreDouble;
		if (c < d) {
			minoreDouble = c;
		} else {
			minoreDouble = d;
		}
		return minoreDouble;
	}

	// Massimo tra due numeri interi
	public static int maggioreInt() {
		int maggioreInt;
		if (a > b) {
			maggioreInt = a;
		} else {
			maggioreInt = b;
		}
		return maggioreInt;
	}

	// Massimo tra due numeri interi
	public static double maggioreDouble() {
		double maggioreDouble;
		if (c > d) {
			maggioreDouble = c;
		} else {
			maggioreDouble = d;
		}
		return maggioreDouble;
	}
	
	// Elevamento alla postenza di interi
	
	public static double potenza(int b, int pow) {
		int risultato = 1;
		double base1 = b;
		double esponente1 = pow;
		if(pow > 0) {
			for (int i = 0; i <= pow; i++) {
				risultato *= b;
			}
			} else if (pow < 0) {
				return -esponente1 / base1;
		}
		return risultato;
	}
	
//	public static int potenzaInteri() {
//		int potenzaInt = (int) Math.pow(a, b);
//		return potenzaInt;
//	}
//	
//	// Elevamento alla potenza di double
//	
//	public static double potenzaDouble() {
//		double potenzaDouble = Math.pow(c, d);
//		return potenzaDouble;
//	}
	
}
