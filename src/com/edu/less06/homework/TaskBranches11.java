package com.edu.less06.homework;

/*
 * Составить программу, которая определит площадь какого треугольника больше.
 */
public class TaskBranches11 {

	public static void main(String[] args) {
		Triangle triangle1 = new Triangle(3, 12, 14);
		Triangle triangle2 = new Triangle(5, 7, 6);
		
		if (!triangle1.isValid || !triangle2.isValid) {
			System.out.println("Введите корректные данные");
			return;
		}

		triangle1.calcArea();
		triangle2.calcArea();
		
		double area1 = triangle1.area;
		double area2 = triangle2.area;
		
		System.out.printf("Стороны треугольника 1: %d, %d, %d. Площадь: %.1f%n", triangle1.side1, triangle1.side2,
				triangle1.side3, area1);
		System.out.printf("Стороны треугольника 2: %d, %d, %d. Площадь: %.1f%n", triangle2.side1, triangle2.side2,
				triangle2.side3, area2);
		
		if (area1 > area2) {
			System.out.println("Площадь треугольника №1 больше");
		} else if (area1 < area2) {
			System.out.println("Площадь треугольника №2 больше");
		} else {
			System.out.println("Площади треугольников равны");
		}
	}

	public static class Triangle {
		int side1;
		int side2;
		int side3;
		double area;
		boolean isValid;

		public Triangle(int side1, int side2, int side3) {
			if ((side1 <= 0 || side2 <= 0 || side3 <= 0)) {
				System.out.println("Все стороны треугольника должны быть >0");
			} else if ((side1 >= side2 + side3) || (side2 >= side1 + side3) || (side3 >= side1 + side2)) {
				System.out.println("Треугольник с такими сторонами не может существовать");
			} else {
				this.side1 = side1;
				this.side2 = side2;
				this.side3 = side3;
				isValid = true;
			}
		}

		public void calcArea() {
			double semiperimeter;
			semiperimeter = 1.0 * (side1 + side2 + side3) / 2;
			area = Math
					.sqrt(semiperimeter * (semiperimeter - side1) * (semiperimeter - side2) * (semiperimeter - side3));
		}
	}

}
