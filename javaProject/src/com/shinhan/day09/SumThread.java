package com.shinhan.day09;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SumThread extends Thread{
	private long sum;
	private int start;
	private int end;

	public SumThread(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
//	@Override
//	public void run() {
//		for(int i=1; i<=100; i++) {
//			sum += i;
//		}
//	}
//	
	
	@Override
	public void run() {
		for(int i=start; i<=end; i++) {
			sum += i;
		}
	}
	
}
