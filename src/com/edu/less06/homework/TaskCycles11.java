package com.edu.less06.homework;

/*
 * Составить программу нахождения разности кубов первых двухсот чисел
 */
public class TaskCycles11 {

	public static void main(String[] args) {
		int diff = 0;

		for (int i = 0; i < 200; i++) { // двести чисел от 0 до 199
			diff -= i * i * i;
		}
		System.out.println("Разность кубов первых двухсот чисел = " + diff);

	}

}
