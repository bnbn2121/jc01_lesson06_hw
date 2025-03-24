package com.edu.less06.homework;

/*
 * Вычислить значения функции на отрезке [а,b] c шагом h
 */
public class TaskCycles08 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double h;
		double x;
		double y;

		a = -4.8;
		b = 18.6;
		c = 1.9;
		h = 3.3;

		for (x = a; x <= b; x += h) {
			if (x == 15) {
				y = (x + c) * 2;
			} else {
				y = (x - c) + 6;
			}
			System.out.println("х = " + Math.round(10 * x) / 10.0 + ", y = " + Math.round(10 * y) / 10.0);
		}

	}

}
