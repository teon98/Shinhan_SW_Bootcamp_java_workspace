package com.shinhan.day03;

import java.util.Arrays;

//cmd>java com/shinhan/day03/ArrayTest 100 200
//명령형 매개변수
//eclispe에서 명령형 매개변수 넣는 법
//run configuration > Arguments> program arguments
public class ArrayTest {

	public static void main(String[] args) {
		System.out.println(args.length);
		
		if(args.length>2) {
			//main 빠지기
			//return;
			//프로그램 종료
			System.exit(0); //0 정상종료, -1 비성장종료
		}
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println("더하기: = " +  (a+b));
		System.out.println("빼기: = " +  (a-b));
		System.out.println("곱하기: = " +  (a*b));
		System.out.println("나누기(몫): = " +  (a/b));
		
		f6();
	}

	private static void f6() {
		int[] arr1 = new int[] {100, 90, 50, 88};
		int[] arr2 = new int[10];
		int[] arr3 = new int[10];
		for(int i=0; i<arr1.length; i++) {//일일이 복사하는 방법
			arr2[i] = arr1[i];
		}
		
		System.arraycopy(arr1, 0, arr3, 0, arr1.length); //한번에 복사
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
	}

	private static void f5() {
		//선언+생성...자동초기화
		int[] arr = new int[5];
		//선언+생성+초기화(길이는 반드시 생략)
		int[] arr2 = new int[] {100,90,88,100};
		int[] arr3 = {100,90,88,100};
		int[] arr4;
		arr4 = new int[]{100,90,88,100};//따로 만들고 싶을 땐, new int[]를 생략하면 안된다.
		
		int[][] arr5 = new int[][] {{100,90,88,100},{100,90,88}};
		int[][] arr6;
		arr6 = new int[][] {{100,90,88,100},{100,90,88},{50,50,50,50}};//new int[] 생략하면 안된다.
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		System.out.println("-------------------------");
		for(int aa[]: arr6) {
			System.out.println(Arrays.toString(aa));
		}
	}

	private static void f4() {
		int[] arr2[];
		arr2 = new int[3][];
		arr2[0] = new int[3];
		arr2[1] = new int[4];
		arr2[2] = new int[2];
		
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				System.out.printf("%d행 %d열 = %d\t", i,j,arr2[i][j]);
			}
			System.out.print("\n");
		}
	}

	private static void f3() {
		//2차원배열: 배열의 배열
		//1.배열변수선언
		int [][] arr1;
		int [] arr2[];
		int arr3 [][];
		//2. 배열생성...배열 길이 필수
		arr1 = new int[3][4];
		arr2 = new int[3][];
		arr3 = new int[3][]; //비어있을 순 없음.
		//3. 배열사용
		System.out.println(arr1[0][0]);
		System.out.println(arr2[0]);
		
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				System.out.printf("%d행 %d열 = %d\n", i,j,arr1[i][j]);
			}
		}
		
		for(int[] aa:arr1) {
			for(int su:aa) { //몇행 몇열인지 모름
				System.out.print(su + "\t");
			}
			System.out.println();
		}
	}

	private static void f2() {
		//1. 배열변수 선언
		int[] scores;
		//2. 배열생성...배열의 개수는 필수이다. 생성시 자동초기화된다.
		//(정수:0, 실수:0.0, boolean:false, 객체:null)
		scores = new int[26];
		System.out.println(scores.length);
		String str = "자바";
		System.out.println(str.length());
		//3. 배열사용
		scores[0] = 100;
		scores[1] = 90;
		scores[2] = 80;
		int total = 0;
		System.out.println(scores.length);
		//일반for
		for(int index=0;index < scores.length;index++) {
			System.out.print(scores[index] + " ");
			total += scores[index];
		}
		System.out.println();
		System.out.println("총점은: " + total);
		
		int total2 = 0;
		//향상 for, 확장 for
		for(int score:scores) {
			total2 += score;
		}
		System.out.println("총점은2: " + total2);
	}

	private static void f1() {
		//배열: 하나의 이름으로 같은타입의 Heap에 연속공간을 만드는 자료구조
		//1. 배열변수 선언
		int[] arr1 = null;
		int arr2[];
		double[] arr3; 
		boolean[] arr4;
		String[] arr5;
		//2. 배열생성... 배열의 개수 필수이다. 생성시 자동초기화된다.
		//(정수:0, 실수:0.0, boolean:false, 객체:null)
		arr1 = new int[5];
		arr3 = new double[6];
		arr4 = new boolean[7];
		arr5 = new String[6];
		//3. 배열사용
		System.out.println(arr1[0]);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		System.out.println(Arrays.toString(arr5));
	}

}
