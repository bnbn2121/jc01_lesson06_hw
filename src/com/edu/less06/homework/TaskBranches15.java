package com.edu.less06.homework;

/*
 * Даны действительные числа х и у, не равные друг другу.
 * Меньшее из этих двух чисел заменить половиной их суммы,
 * а большее — их удвоенным произведением.
 */
public class TaskBranches15 {

	public static void main(String[] args) {
		double x;
		double y;
		double tempMin;
		double tempMax;
		String result;

		x = 39.7;
		y = -22.2;

		tempMin = (x + y) / 2;
		tempMax = (x * y) * 2;

		System.out.printf("Исходные числа: [%.1f] и [%.1f]%n", x, y);
		if (x == y) {
			result = "числа равны";
		} else {
			if (x > y) {
				x = tempMax;
				y = tempMin;
			} else {
				y = tempMax;
				x = tempMin;
			}
			result = String.format("Результат: [%.1f] и [%.1f]", x, y);
		}
		System.out.println(result);
	}

}
