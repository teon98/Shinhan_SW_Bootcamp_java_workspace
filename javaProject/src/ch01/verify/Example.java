package ch01.verify;

//public class이름과 .java이름은 같아야 한다.
public class Example {
	//변수, 함수 이름은 소문자 시작이 관례
	//class이름은 대문자 시작인 관례
	public static void displayJava() {}
	
	public static void main(String[] args) {
		System.out.println("개발자가 되기 위한 필수 개발 언어 Java");
		
		double doubleValue = 5.7;
		int var = (int)doubleValue;
		System.out.println(var);
		
		int tom = -1;
		char marry = '9';
		boolean john = false ;  //주의 
		String sarah = "Sarah Jang" ;
		System.out.println( "our friends..\n" 
		+ tom + ", " + marry + ", " + john + " and " + sarah);
	}
}
