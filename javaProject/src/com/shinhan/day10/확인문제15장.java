package com.shinhan.day10;

import java.util.*;
import java.util.Map.Entry;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class 확인문제15장 {

	public static void main(String[] args) {
		/*객과식 및 단답형
		 1) 4
		 2) 3
		 3) 4
		 4) 3
		 5) List<Board> 변수 = new ArrayList<Board>();
		 6) HashMap<String, Integer> 변수 = new HashMap<>();
		 11) 4
		 12) 3
		 13) 4
		 */
		//ListExample(); //15장 7번
		//HashSetExample(); //15장 8번
		//MapExample(); //15장 9번
		TreeSetExample(); //15장 10번
	}

	private static void TreeSetExample() {
		TreeSet<Student3> treeSet = new TreeSet<Student3>();
		treeSet.add(new Student3("blue", 96));
		treeSet.add(new Student3("hong", 86));
		treeSet.add(new Student3("white", 92));
		
		Student3 student = treeSet.last();
		System.out.println("최고 점수: " + student.score);
		System.out.println("최고 점수를 받은 아이디: " + student.id);
	}

	private static void MapExample() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null; //최고 점수를 받은 아이디를 저장하는 변수
		int maxScore = 0; //최고 점수를 저장하는 변수
		int totalScore = 0; //점수 합계를 저장하는 변수
		
		for(Entry<String, Integer> entry: map.entrySet()) {
			if(entry.getValue()>maxScore) {
				maxScore = entry.getValue();
				name = entry.getKey();
			}
			totalScore += entry.getValue();
		}
		
		//코드 구현
		System.out.print("평균 점수: " + (totalScore/map.size())+"\n");
		System.out.print("최고 점수: " + maxScore + "\n");
		System.out.println("최고 점수를 받은 아이디 " + name + "\n");
	}

	private static void HashSetExample() {
		Set<Student> set = new HashSet<Student>();
		
		set.add(new Student(1,"홍길동"));
		set.add(new Student(2,"신용권"));
		set.add(new Student(1,"조민우"));
		
		System.out.println("저장된 객체 수: " + set.size());
		for(Student s : set) {
			System.out.println(s.studentNum + ":" + s.name);
		}
	}

	private static void ListExample() {
		BoardDao dao = new BoardDao();
		List<Board2> list = dao.getBoardList();
		for(Board2 board : list) {
			System.out.println(board.getTitle() + "-" + board.getContent());
		}
	}

}

//확인문제 10번 클래스
class Student3 implements Comparable<Student3>{

	public String id;
	public int score;
	
	public Student3(String id, int score) {
		this.id = id;
		this.score = score;
	}
	
	@Override
	public int compareTo(Student3 obj) {
		return score - obj.score;
	}
	
}

//확인문제 8번 클래스
class Student{
	public int studentNum;
	public String name;
	
	public Student (int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(studentNum);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return studentNum == other.studentNum;
	}
	
	//코드 작성
	
}

//확인문제 7번 클래스
class Board2{
	private String title;
	private String content;
	
	public Board2(String title, String content) {
		this.title = title;
		this.content = content;
	}
	
	public String getTitle() {return title;}
	public String getContent() {return content;}
}


class BoardDao{
	List<Board2> board = new ArrayList<Board2>();
	
	public List<Board2> getBoardList() {
		board.add(new Board2("제목1", "내용1"));
		board.add(new Board2("제목2", "내용2"));
		board.add(new Board2("제목3", "내용3"));
		
		return board;
	}
}