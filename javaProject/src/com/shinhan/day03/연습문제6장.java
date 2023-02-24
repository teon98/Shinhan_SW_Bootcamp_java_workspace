package com.shinhan.day03;

public class 연습문제6장 {

	public static void main(String[] args) {
		//method13();
		//method14();
		//method15();
		//method16();
		//method17();
		//method18();
		//method19();
		method20();
	}

	
	private static void method20() {
		while(true) {
			
		}
		
	}


	private static void method19() {
		PRCAccount account = new PRCAccount();
		
		account.setBalance(10000);
		System.out.println("현재 잔고: "+account.getBalance());
		
		account.setBalance(-100);
		System.out.println("현재 잔고: "+account.getBalance());
		
		account.setBalance(2000000);
		System.out.println("현재 잔고: "+account.getBalance());
		
		account.setBalance(300000);
		System.out.println("현재 잔고: "+account.getBalance());
		/*
		 public class PRCAccount {
			int balance; //잔고
			
			final int MIN_BALANCE = 0;
			final int MAX_BALANCE = 1000000;
			
			public int getBalance() {
				return balance;
			}
			
			public void setBalance(int balance) {
			
				if(balance>MIN_BALANCE && balance<MAX_BALANCE) {
					this.balance = balance;
				}else {
					this.balance += 0;
				}
				
			}
		 */
	}


	private static void method18() {
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 ShopService 객체입니다.");
		}else {
			System.out.println("다른 ShopService 객체입니다.");
		}
		
		/*
		public class ShopService {
			private static ShopService shopservice;
			
			private ShopService() {
				
			}
			
			public static ShopService getInstance() {
				if(shopservice == null) {
					shopservice = new ShopService();
				}
				return shopservice;
			}
		}

		*/
	}


	private static void method17() {
		Printer.println(10);
		Printer.println(true);
		Printer.println(5.7);
		Printer.println("홍길동");
		/*
		 public class Printer {
	
	
			public Printer() {
				
			}
			
			static public void println(int value) {
				System.out.println(value);
			}
			
			static public void println(boolean value) {
				System.out.println(value);
			}
			
			static public void println(double value) {
				System.out.println(value);
			}
			
			static public void println(String value) {
				System.out.println(value);
			}
		}

		 */
	}


	private static void method16() {
		Printer printer = new Printer();
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");
		/*
		 public class Printer {
	
			public Printer() {
				
			}
			
			public void println(int value) {
				System.out.println(value);
			}
			
			public void println(boolean value) {
				System.out.println(value);
			}
			
			public void println(double value) {
				System.out.println(value);
			}
			
			public void println(String value) {
				System.out.println(value);
			}
		}

		 */
	}


	private static void method15() {
		MemberService memberService = new MemberService();
		
		boolean result = memberService.login("hong", "12345");
		if(result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("hong");
		}else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
		/*
		 public class MemberService {

			String id;
			String password;
			
			MemberService(){
			}
			
			public boolean login(String id, String password) {
				if(id.equals("hong") & password.equals("12345")) {
					return true;
				}else {
					return false;
				}
			}
			
			public void logout(String id) {
				System.out.println(id + "님이 로그아웃 되었습니다.");
			}
		}
		 */
	}


	private static void method14() {
		Member member = new Member("홍길동", "hong");
		/*
		 public class Member {
			//멤버 변수
			String name;
			String id;
			String password;
			int age;
			
			//생성자
			Member(String name, String id){
				this.name = name;
				this.id = id;
			}
		}
		*/
	}

	private static void method13() {
		/*
		public class Member {
			//멤버 변수
			String name;
			String id;
			String password;
			int age;
		}
		*/
	}
	
	
	
	

}
