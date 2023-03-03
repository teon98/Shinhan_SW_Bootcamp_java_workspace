package com.shinhan.day08;

import java.util.Arrays;
public class Median {
	public static void main(String[] args) {
		Median median = new Median();
		int[] values1 = { 10, 4, 53, 63, 17, 37, 52, 16, 33, 65 };
		System.out.println("input : "+Arrays.toString(values1));
		System.out.println("median : "+median.findMedian(values1));
		System.out.println("===============================");
		
		int[] values2 = { 32, 53, 52, 76, 15, 98, 76, 65, 36, 10 };
		System.out.println("input : "+Arrays.toString(values2));
		System.out.println("median : "+median.findMedian(values2));
	}

	public int findMedian(int[] values) {
		/*
		-	중간 값이란 평균값에 제일 가까운 값을 말합니다.
		-	중간 값이 여러 개 일 경우, 작은 수를 리턴 합니다.
		*/
		
		int sum = 0;
		for(int v:values) {
			sum += v;
		}
		
		//중간 값
		int mid = sum/values.length;
		
		int[] result = new int[values.length];
		for(int i=0; i<values.length; i++) {
			if(values[i]-mid <0) {
				result[i] = mid-values[i];
			}else {
				result[i] = values[i]-mid;				
			}
		}
		
		//가장 작은 값 찾기
		int min = result[0];
		//가장 작은 값의 index 찾기
		int index = 0;
		
		for(int i=0; i<result.length; i++) {
			if(result[i]<min) {
				min = result[i];
				index = i;
			}else if(result[i] == min) {
				if(values[i]<values[index]) {
					min = result[i];
					index = i;
				}
			}
		}
		
		
		System.out.println(Arrays.toString(result));
		return values[index];
		
	}
}

