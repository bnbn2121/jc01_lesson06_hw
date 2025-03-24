package com.edu.less06.homework;

/*
 * На плоскости ХОY задана своими координатами точка А.
 * Указать, где она расположена (на какой оси
 * или в каком координатном угле).
 */
public class TaskBranches16 {

	public static void main(String[] args) {
		int x;
		int y;

		x = 2;
		y = 0;

		if (x > 0 && y > 0) {
			System.out.println("точка находится в I четверти");
		} else if (x < 0 && y > 0) {
			System.out.println("точка находится в II четверти");
		} else if (x < 0 && y < 0) {
			System.out.println("точка находится в III четверти");
		} else if (x > 0 && y < 0) {
			System.out.println("точка находится в IV четверти");
		} else if (x == 0 && y == 0) {
			System.out.println("точка находится на пересечении осей координат");
			return;
		}

		if (x > 0) {
			System.out.println("точка в области положительных значений по оси X");
		} else if (x < 0) {
			System.out.println("точка в области отрицательных значений по оси X");
		} else {
			System.out.println("точка лежит на оси X");
		}

		if (y > 0) {
			System.out.println("точка в области положительных значений по оси Y");
		} else if (y < 0) {
			System.out.println("точка в области отрицательных значений по оси Y");
		} else {
			System.out.println("точка лежит на оси Y");
		}

	}

}
