package com.edu.less06.homework;

/*
 * Последовательность аn строится так:
 * а1 = 1, an =6+ аn-1 , для каждого n >1.
 * Составьте программу нахождения произведения
 * первых 10 членов этой последовательности.
 */
public class TaskCycles12 {

	public static void main(String[] args) {
		int member = 0;
		long mult = 1;

		for (int n = 1; n <= 10; n++) {
			if (n == 1) {
				member = 1;
			} else {
				member = 6 + member;
			}
			mult *= member;
			System.out.printf("a%d = %d%n", n, member);
		}
		System.out.printf("Произведение всех элементов равно %d%n", mult);
	}

}
