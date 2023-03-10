package com.shinhan.day03;

public class EnumTest {

	//상수: 고정값
	static final double PI = 3.141592; //static final, final static 모두 가능 / 이름은 대문자로
	
	static final int MONDAY = 1;
	static final int SUNDAY = 2;
	static final int SUCCESS = 2;
	//전혀 다른 유형의 상수 값이 혼동될 우려가 있다.
	
	public static void main(String[] args) {
		System.out.println(f5(WeekEnum.TUESDAY));
	}

	private static void f3() {
		WeekEnum[] weeks = WeekEnum.values();
		for(WeekEnum week: weeks) {
			System.out.println(week.ordinal() + "=>" + week.name());
			String weekName = f4(week);
			System.out.println(weekName);
			System.out.println("**********************************");
		}
		
	}

	//enum: 한정적인 값들의 묶음, 관련있는 상수들의 묶음.
	private static String f5(WeekEnum week) {
		String result = null;
		switch (week) {
			case MONDAY -> result = "월요일"; 
			case TUESDAY -> result = "화요일";
			case WEDNESDAY-> result = "수요일";
			case THURSDAY -> result = "목요일";
			case FRIDAY -> result = "금요일";
			case SATURDAY-> result = "토요일";
			case SUNDAY -> result = "일요일";
			default -> result ="잘못입력하였습니다.";
		}
		return result;
	}
	
	private static String f4(WeekEnum week) {
		String result = null;
		if(week == WeekEnum.MONDAY) {
			result = "월요일";
		}else if(week == WeekEnum.TUESDAY) {
			result = "화요일";
		}else if(week == WeekEnum.WEDNESDAY) {
			result = "수요일";
		}else if(week == WeekEnum.THURSDAY) {
			result = "목요일";
		}else if(week == WeekEnum.FRIDAY) {
			result = "금요일";
		}else if(week == WeekEnum.SATURDAY) {
			result = "토요일";
		}else if(week == WeekEnum.SUNDAY) {
			result = "일요일";
		}
		return result;
	}

	private static void f2(LoginEnum login) {
		System.out.println(login == LoginEnum.SUCCESS);
		System.out.println(login == LoginEnum.FAIL);
		
		LoginEnum [] arr = LoginEnum.values();
		for(LoginEnum aa: arr) {
			System.out.println(aa.ordinal() + "," + aa.name());
		}
	}

	private static void f1() {
		System.out.println(PI);
		//PI = 3.14; 변경불가능
		int input = 2;
		System.out.println(input == SUNDAY);
	}

}
