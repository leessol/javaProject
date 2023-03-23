package com.shinhan.day03;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class HW03 {

	public static void main(String[] args) {
		//f1();
		//f2();
		f3();
	}

	private static void f3() {
		int [][] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		int count = 0;
		int total = 0;
		
		for (int i = 0; i<array.length;i++) {
			for (int j = 0; j<array[i].length;j++) {
				count++;
				total += array[i][j];
			}
		}
		
		System.out.println("합: " + total + "," + "평균: " + (total/count));
		
	}

	private static void f2() {
		int[] array = {1,5,3,8,2};
		int max = Array.getInt(array, 0);
		for (int i = 1; i<array.length;i++) {
			if (max<Array.getInt(array, i)) {
				max = Array.getInt(array, i);
			}
		}
		System.out.println(max);
		
	}

	private static void f1() {
		int[][] array = { 
			{95, 86},
			{83,92,96},
			{78,83,93,87,88}
		};	
		System.out.println(array.length);
		System.out.println(array[2].length);
	}

}
