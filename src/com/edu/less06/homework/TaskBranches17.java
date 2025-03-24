package com.edu.less06.homework;

/*
 * Даны целые числа m, n. Если числа не равны,
 * то заменить каждое из них одним и тем же числом,
 * равным большему из исходных, а если равны,
 * то заменить числа нулями.
 */
public class TaskBranches17 {

	public static void main(String[] args) {
		int m;
		int n;

		m = -99;
		n = 6;
		System.out.println("m = " + m + ", n = " + n);

		if (m != n) {
			m = n = Math.max(m, n);
		} else {
			m = n = 0;
		}
		System.out.println("m = " + m + ", n = " + n);
	}

}
