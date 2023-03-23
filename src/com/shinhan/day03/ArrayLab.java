package com.shinhan.day03;

public class ArrayLab {

	public static void main(String[] args) {
		int [][] arr1 = {{30,30,30,30},{40,40,40,40},{50,50,50,50}};
		int [][] arr2 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		int [][] arr3 = new int[3][4];
		ArrayLab aa = new ArrayLab();
		arr3=aa.sub(arr1,arr2,arr3);
		aa.prn(arr3);
	}

	private static void method1() {
		int[] arr = {3, 24, 1, 55, 17, 43, 5};
		int temp = 0;
		for (int i = 0; i <arr.length-1;i++) {
			for (int j=i+1;j<arr.length;j++) {
				if (arr[i]<arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				} 
			}
		}
	}
	
	public int[][] sub(int[][] a, int[][] b, int[][] c){
		for(int i =0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				c[i][j] = a[i][j] - b[i][j];
			}
		}
		return c;
	}
	
	public void prn(int[][] c) {
		for(int i =0;i<c.length;i++) {
			for(int j=0;j<c[i].length;j++) {
				System.out.print(c[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
