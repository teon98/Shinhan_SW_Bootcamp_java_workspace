package com.shinhan.day05;

//접근권한:public, protected, 생략, private 중 1개 선택
//활용방법:static, final 여러개 선택
public class Student extends Object{

	//1. field(data를 저장하기 위한 변수들을 정의): instance 변수, static 변수
	private String stdId; //private:Student class 내에서만 접근 가능
	public String name; //public: 모든 package에서 접근 가능
	String major; //생략: 같은 package에서 접근 가능
	protected int score; //protected: 같은 package에서 접근 가능, 다른 package이면 자식은 접근 가능
	public final String schoolName = "신한금융대학"; //final: 초기화 1회(선언할때, 생성할때)
	public static final String NATION = "대한민국"; //static final: 상수, class변수, 초기화가 1회 (선언할때)
	public static int count; //class변수
	
	//2. 생성자
	public Student(String stdId, String name) {
		//default 생성자는 컴파일시에 자동으로 .class에 추가된다. 재정의하면 생성안됨
		//super(); 2개의 부모를 부를 수 없다. (이미 this()로 부모를 부르는 중이기 때문에 super()로 또 부모를 부를 수 없다.)
		this(stdId, name, null, 0);
	}
	
	public Student(String stdId, String name, String major) {//생성자의 오버로딩, 매개변수의 개수가 달라야 한다.
		this(stdId, name, major, 0);
		
	}

	public Student(String stdId, String name, String major, int score) {
		super(); //부모를 부르는 중 (default로는 Object, 아니면 extends 다음에 붙는 class)
		this.stdId = stdId;
		this.name = name;
		this.major = major;
		this.score = score;
		count ++;
	}

	//3.일반메서드(getter/setter)
	public String getStdId() {
		return stdId;
	}

	public void setStdId(String stdId) {
		this.stdId = stdId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Student.count = count;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public static String getNation() {
		return NATION;
	}

	@Override
	public String toString() { //없으면 객체의 주소값을 헥사값으로 출력한다.
		return "Student정보 [stdId=" + stdId + ", name=" + name + ", major=" + major + ", score=" + score + ", schoolName="
				+ schoolName + "]";
	}
	
	
	
}
