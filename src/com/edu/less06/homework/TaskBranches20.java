package com.edu.less06.homework;

/*
 * Определить, делителем каких чисел а, b, с является число k.
 */
public class TaskBranches20 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int k;

		a = 36;
		b = 92;
		c = -60;
		k = 6;

		if (k == 0) {
			System.out.println("k=0. примите другое значение k");
			return;
		}
		int[] numbers = { a, b, c };
		for (int num : numbers) {
			if (num % k == 0) {
				System.out.printf("Число %d является делителем числа %d%n", k, num);
			} else {
				System.out.printf("Число %d не является делителем числа %d%n", k, num);
			}
		}

	}

}
