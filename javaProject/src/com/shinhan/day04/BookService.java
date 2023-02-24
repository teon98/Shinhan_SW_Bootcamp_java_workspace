package com.shinhan.day04;

//Service: Business logic구현 (업무로직이 들어가는 것을 서비스 라고 한다.)
public class BookService {
	//멤버변수
	BookVO[] booklist; //책 목록
	
	//생성자
	public BookService(BookVO[] booklist){
		this.booklist = booklist;
	}
	
	//일반함수
	public void printBookList() {
		System.out.println("=== 책 목록 ===");
		for(BookVO book: booklist) {
			//System.out.println(book.getTitle());
			System.out.println(book);
		}
	}
	
	public void printTotalPrice() {
		System.out.println("=== 책 가격의 총합 ===");
		int total_price = 0;
		for(BookVO book: booklist) {
			total_price += book.getPrice();
		}
		System.out.println("전체 책 가격의 합: " + total_price);
	}
	
	
	
	
}
