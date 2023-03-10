package com.shinhan.day03;

import java.util.Arrays;

public class LAB5 {

	public static void main(String[] args) {
		//method1();
		
		int [][] arr1 = {{30,30,30,30}, {40,40,40,40}, {50,50,50,50}};
		int [][] arr2 = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
		int [][] arr3 = new int[3][4];
		//int [][] arr4 = sub(arr1, arr2, arr3);
		sub(arr1, arr2, arr3);
		prn(arr1);
		prn(arr2);
		prn(arr3);
		//prn(arr4);
	}
	
	public static int[][] sub(int[][] a, int[][] b, int[][] c){//static은 static만 부를 수 있다.
		for(int i=0; i<a.length; i++) {//3번
			for(int j=0; j<a[i].length; j++) {//3번
				c[i][j] = a[i][j] - b[i][j];
			}
		}
		return c;
	}
	
	public static void prn(int[][] c) {
		System.out.println("----------------------------------");
		for(int[] c_arr: c ) {
			for(int c_value: c_arr) {
				System.out.print(c_value + " ");
			}
			System.out.println();
		}
	}

	private static void method1() {
		int[] arr = {3, 24, 1, 55, 17, 43, 5};
		System.out.println(Arrays.toString(arr));
		//선택정렬
		for(int i=0; i<arr.length-1; i++) {//마지막의 다음은 비교대상이 아니다. (arr.length-1)
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					//바꾸기
					int temp = arr[i]; //피신
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Ascending Sort: " + Arrays.toString(arr));
		
	/*
		[배열의 내용]
		3, 24, 1, 55, 17, 43, 5
		[클래스 실행결과]
		1, 3, 5, 17, 24, 43, 55
	*/
		
	}

}
