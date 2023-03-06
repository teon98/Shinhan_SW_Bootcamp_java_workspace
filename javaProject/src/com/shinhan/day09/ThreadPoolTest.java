package com.shinhan.day09;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {

	public static void main(String[] args) {
		//f1();
		f2();
	}

	//Callable 인터페이스 구현하여 thread 사용 ...return 있음
	private static void f2() {


		String[][] mails = new String[1000][3];
		for(int i=0; i<mails.length; i++) {
			mails[i][0] = "admin@my.com"; //from
			mails[i][1] = "member" + i + "@my.com"; //to
			mails[i][2] = "신상품입고......";
		}
		
		ExecutorService service = Executors.newFixedThreadPool(5);
//		
//		for(int i=0; i<100; i++) {//내부에서 사용하면 final 특성을 가지게 됨.
//			int index = i;
//			
//			 Future<Integer> future = service.submit(new Callable<Integer>() {
//				
//				public Integer call() throws Exception{
//					int sum = 0;
//					for(int j=1; j<=index; j++) {
//						sum += j;
//					}
//					return sum;
//				}
//			});
//			 
//			
//		}
//	
		
	}

	//Runnable 인터페이스 구현하여 thread에서 사용 ...return 없음
	private static void f1() {

		String[][] mails = new String[1000][3];
		for(int i=0; i<mails.length; i++) {
			mails[i][0] = "admin@my.com"; //from
			mails[i][1] = "member" + i + "@my.com"; //to
			mails[i][2] = "신상품입고......";
		}
		
		ExecutorService service = Executors.newFixedThreadPool(5);
		for(int i=0; i<1000; i++) {
			int index = i;
			service.execute(new Runnable() {
				@Override
				public void run() {
					String tname = Thread.currentThread().getName();
					System.out.println(tname + 
							" from " + mails[index][0] +
							" to " + mails[index][1] + 
							"content :" + mails[index][2]);
				}
			});
		}
	
	}

}
