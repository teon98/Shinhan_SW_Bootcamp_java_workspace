package com.shinhan.day02;

public class LAB1_4 {

	public static void hokeyGraphics(char cell, int size, boolean isRect)
    {
        //특정 도형을 출력하는 메소드 구현
		for(int i=1; i<=size; i++) {
			for(int j=0; j<(isRect? size: i); j++) {
				System.out.print(cell);
			}
			System.out.println();
		}
		
    }

    public static void main(String args[])  {                 
        hokeyGraphics( '*', 3, true); 
    	//hokeyGraphics('&', 3, false);
    }


}

/*
<< 출력 결과 >>
● hokeyGraphics(‘*’, 3, true)
***
***
***
● hokeyGraphics(‘&’, 3, false)
&
&&
&&&
*/