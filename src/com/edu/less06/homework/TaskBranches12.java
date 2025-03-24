package com.edu.less06.homework;

/*
 * Даны три действительных числа. Возвести в квадрат те из них,
 * значения которых неотрицательны, и в четвертую степень — отрицательные.
 */
public class TaskBranches12 {

	public static void main(String[] args) {
		double number1 = 8.5;
		double number2 = 4;
		double number3 = -3.6;

		System.out.printf("Исходные данные:\t[%.1f]\t[%.1f]\t[%.1f]%n", number1, number2, number3);
		number1 = calc(number1);
		number2 = calc(number2);
		number3 = calc(number3);
		System.out.printf("Результат:\t\t[%.1f]\t[%.1f]\t[%.1f]%n", number1, number2, number3);
	}

	public static double calc(double num) {
		if (num < 0) {
			return Math.pow(num, 4);
		} else {
			return Math.pow(num, 2);
		}
	}

}
