package com.edu.less06.homework;

/*
 * Вычислить: 1+2+4+8+...+ 2 в 10 степени.
 */
public class TaskCycles15 {

	public static void main(String[] args) {
		int result = 0;
		for (int i = 0; i <= 10; i++) { 
			result += Math.pow(2, i);
		}
		System.out.println(result);

	}

}
