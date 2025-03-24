package com.edu.less06.homework;

/*
 * Составить таблицу значений функции y = 5 - x^2/2
 * на отрезке [-5; 5] с шагом 0.5.
 */
public class TaskCycles13 {

	public static void main(String[] args) {
		double x;
		double y;

		for (x = -5; x <= 5; x += 0.5) {
			y = 5 - x * x / 2;
			System.out.printf("|  X = %4.1f  |  Y = %4.1f  |%n", x, y);
		}

	}

}
