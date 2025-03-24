package com.edu.less06.homework;

/*
 * Составить программу нахождения произведения
 * квадратов первых двухсот чисел.
 */
public class TaskCycles10 {

	public static void main(String[] args) {
		double result = 1;
		int factor10 = 0;

		for (int i = 1; i <= 200; i++) { // двести чисел от 1 до 200
			result *= i * i;
			if (result > 1e100) {
				result /= 1e100;
				factor10 += 100;
			}
		}

		while (result > 10) {
			result /= 10;
			factor10++;
		}

		System.out.printf("Произведение квадратов первых двухсот чисел = %.1fE%d", result, factor10);
	}

}
