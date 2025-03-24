package com.edu.less06.homework;

/*
 * Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли он
прямоугольным.
 */
public class TaskBranches14 {

	public static void main(String[] args) {
		int angle1;
		int angle2;
		int angle3;

		angle1 = 90;
		angle2 = 34;

		angle3 = 180 - angle1 - angle2;
		if (angle1 > 0 && angle2 > 0 && angle3 > 0) {
			System.out.printf("Треугольник с углами %d и %d градуса - существует, третий угол равен %d%n", 
					angle1,	angle2, angle3);
			if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
				System.out.println("Треугольник прямоугольный");
			} else {
				System.out.println("Треугольник не прямоугольный");
			}
		} else {
			System.out.printf("Треугольникa с углами %d и %d градуса не существует%n", angle1, angle2);
		}
	}

}
