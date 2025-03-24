package com.edu.less06.homework;

/*
 * Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n.
 */
public class TaskCycles14 {

	public static void main(String[] args) {
		int n = 16;
		double result = 0;

		for (int i = 1; i <= n; i++) {
			result += 1.0 / i;
		}
		System.out.printf("При n = %d результат: %.1f%n", n, result);
	}

}
