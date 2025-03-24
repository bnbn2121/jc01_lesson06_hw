package com.edu.less06.homework;

/*
 * Подсчитать количество положительных среди чисел а, b, с.
 */
public class TaskBranches19 {

	public static void main(String[] args) {
		int a = 5;
		int b = -7;
		int c = -8;
		int countPositive = 0;

		int[] numbers = { a, b, c };
		for (int i : numbers) {
			if (i > 0) {
				countPositive++;
			}
		}
		
		System.out.println("Дано три числа: " + a + ", " + b + ", " + c);
		System.out.println("Среди них положительных: " + countPositive);

	}

}
