package com.edu.less06.homework;

/*
 * Вычислить значения функции на отрезке [а,b] c шагом h
 */
public class TaskCycles07 {

	public static void main(String[] args) {
		double a;
		double b;
		double h;
		double x;
		double y;

		a = -4.2;
		b = 6.6;
		h = 1.8;

		for (x = a; x <= b; x += h) {
			if (x > 2) {
				y = x;
			} else {
				y = -x;
			}
			System.out.println("х = " + Math.round(10 * x) / 10.0 + ", y = " + Math.round(10 * y) / 10.0);
		}

	}

}
