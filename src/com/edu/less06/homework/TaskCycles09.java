package com.edu.less06.homework;

/*
 * Найти сумму квадратов первых ста чисел.
 */
public class TaskCycles09 {

	public static void main(String[] args) {
		int sum = 0;

		for (int i = 0; i < 100; i++) { // сто чисел от 0 до 99
			sum += i * i;
		}
		System.out.println("Сумма квадратов первых ста чисел = " + sum);

	}

}
