package com.shinhan.day07;

public class ProductTest {
	public static void main(String[] args) {
		ProductVO[] productList = { new ProductVO("마이쭈", 25000, "Samsong"),
				new ProductVO("꿈틀이", 32000, "Samsong"),
				new ProductVO("짱구", 17050, "Samsong"),
				new ProductVO("새우깡", 24500, "Samsong"),
				new ProductVO("고소미", 75000, "Daehoo") };
		productList = selectProduct(productList, 25000);
		for (int i = 0; i < productList.length; i++) {
			System.out.println(productList[i].toString());
		}
	}

	//Object 상속받아서 ProductVO를 만든 것이다.
	//자동형변환: 부모타입의 참조변수 = 자식객체
	private static ProductVO[] selectProduct(Object[] productList, int i) {
		// 구현하시오.
		
		int count = 0;
		for(Object obj : productList) {
			//강제형변환: 자식타입의 참조변수 = (자식타입)부모객체
			//전제조건은: 부모객체가 자식타입에서 자동형변환된 경우만 가능
			if(!(obj instanceof ProductVO product)) continue;
			if(product.getPrice()>=i) count ++;
		}
		
		//배열은 갯수를 알수없다면 생성불가
		ProductVO[] plist = new ProductVO[count];
		int index = 0;
		for(Object obj : productList) {
			//강제형변환: 자식타입의 참조변수 = (자식타입)부모객체
			//전제조건은: 부모객체가 자식타입에서 자동형변환된 경우만 가능
			if(!(obj instanceof ProductVO product)) continue;
			if(product.getPrice()>=i) {
				plist[index] = product;
				index++;
			}
		}
		
		
		return plist;
	}
}
