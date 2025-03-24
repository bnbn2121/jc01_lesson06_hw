package com.edu.less06.homework;

/*
 * Подсчитать количество отрицательных среди чисел а, b, с.
 */
public class TaskBranches18 {

	public static void main(String[] args) {
		int a = 5;
		int b = -7;
		int c = -8;
		int countNegative = 0;

		int[] numbers = { a, b, c };
		for (int i : numbers) {
			if (i < 0) {
				countNegative++;
			}
		}
		
		System.out.println("Дано три числа: " + a + ", " + b + ", " + c);
		System.out.println("Количество отрицательных: " + countNegative);
	}

}
