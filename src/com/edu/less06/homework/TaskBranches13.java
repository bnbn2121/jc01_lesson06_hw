package com.edu.less06.homework;

/*
 * Даны две точки А(х1, у1) и В(х2, у2).
 * Составить алгоритм, определяющий, которая
 * из точек находится ближе к началу координат.
 */
public class TaskBranches13 {

	public static void main(String[] args) {
		int x1 = 6;
		int y1 = -8;
		int x2 = -2;
		int y2 = -10;

		double distance1 = Math.sqrt(x1 * x1 + y1 * y1);
		double distance2 = Math.sqrt(x2 * x2 + y2 * y2);

		if (distance1 == distance2) {
			System.out.println("расстояния до начала координат равны");
		} else if (distance1 < distance2) {
			System.out.println("точка 1 ближе к началу координат");
		} else {
			System.out.println("точка 2 ближе к началу координат");
		}

	}

}
