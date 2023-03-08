package com.shinhan.day11;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.shinhan.day05.Account;

public class StringTest3 {

	public static void main(String[] args) throws IOException, URISyntaxException {
		f13();
	}

	private static void f13() {
		List<Student2> data = new ArrayList<>();
		data.add(new Student2("김길동", 90, "남"));
		data.add(new Student2("이길동", 85, "남"));
		data.add(new Student2("김길순", 100, "여"));
		data.add(new Student2("김아라", 90, "여"));
		data.add(new Student2("박길동", 100, "남"));
		
		//성별 group으로 점수평균집계를 하고 다시 group이 collection으로 만든다.
		Map<String, Double> map = data.stream().collect(
				Collectors.groupingBy(st->st.getGender(),
						Collectors.averagingDouble(st->st.getScore())));
		
		System.out.println(map);
	}

	private static void f12() {
		int[] arr = {};
		
		boolean result1 = Arrays.stream(arr).allMatch(su->su%2==0);
		System.out.println(result1);
		
		boolean result2 = Arrays.stream(arr).anyMatch(su->su%2==0);
		System.out.println(result2);
		
		//모든요소가 만족하지 않는가?
		boolean result3 = Arrays.stream(arr).noneMatch(su->su%2==0);
		System.out.println(result3);
		
		double d = Arrays.stream(arr).filter(su->su%2==0).average().orElse(0);
		System.out.println(d);
	}

	private static void f11() {
		List<Student> data = new ArrayList<>();
		data.add(new Student("김1", 100));
		data.add(new Student("양4", 90));
		data.add(new Student("김3", 70));
		data.add(new Student("정5", 60));
		data.add(new Student("김2", 80));
		
		data.stream().sorted().forEach(st->{System.out.println(st);});
		System.out.println("----sort----");
		data.stream().sorted((a,b)->a.getName().compareTo(b.getName())).forEach(st->{System.out.println(st);});;
	}

	private static void f10() {
		Integer[] arr = {100, 88, 99, 50, 60};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr, (a,b)->b-a);
		System.out.println(Arrays.toString(arr));
		
		Student[] arr2 = {new Student("김", 90),new Student("양", 90),new Student("김", 70),
				new Student("박", 80),new Student("정", 88),new Student("이", 100)};
		
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		
		Arrays.sort(arr2, (a,b)->a.getName().compareTo(b.getName()));
		System.out.println(Arrays.toString(arr2));
	}

	private static void f9() {
		//문장 스트림을 단어 스트림으로 변환
		List<String> list1 = new ArrayList<>();
		list1.add("this is java");
		list1.add("i am a best developer");
		list1.stream().flatMap(data -> Arrays.stream(data.split(" "))).forEach(word->System.out.println(word));
		
		System.out.println();
		
		//문자열 숫자 목록 스트림을 숫자 스트림으로 변환
		List<String> list2 = Arrays.asList("10, 20, 30", "40, 50");
		list2.stream().flatMapToInt(data->{
			String[] strArr = data.split(","); //"10,20,30" //"40,50" 일단 이렇게 분리 시킴.
			int[] intArr = new int[strArr.length]; //분리한걸 int 배열에 넣기 위해 int형 배열 생성
			for(int i=0; i<strArr.length; i++) {
				intArr[i] = Integer.parseInt(strArr[i].trim());//돌면서 넣어는데 trmi()은 공백 제거
			}
			return Arrays.stream(intArr);//Arrays.stream() 메소드는 주어진 int[]배열을 IntStream으로 만듦.
		}).forEach(number -> System.out.println(number));
	}

	private static void f8() {
		int[] arr = {10, 20, 70, 90};
		Arrays.stream(arr).asDoubleStream().forEach(d->{System.out.println(d);}); //타입을 바꿀 때 사용
		Arrays.stream(arr).boxed().forEach(d->{System.out.println(d.floatValue());}); //기본형을 boxed로 Integer로 바꿔 함수를 쓸 수 있도록 한다.
	}

	private static void f7() {
		List<Student> data = new ArrayList<>();
		data.add(new Student("김1", 100));
		data.add(new Student("양4", 90));
		data.add(new Student("김3", 70));
		data.add(new Student("정5", 60));
		data.add(new Student("김2", 80));
		
		//점수가 70초과인 사람
		data.stream().distinct().filter(s->s.getScore()>70).forEach(s->System.out.println(s));
		
		System.out.println();
		
		//성이 김씨인사람만
		data.stream().filter(s->(s.getName()).startsWith("김")).forEach(s->System.out.println(s));
		
		//이름이 김씨인 사람만 추출하여 점수의 평균을 구하는 것
		data.stream().filter(s->s.getName().startsWith("김")).mapToLong(a->a.getScore())
		.average().ifPresent(s->System.out.println(s));
	}

	private static void f6() {
		List<String> data = new ArrayList<>();
		data.add("홍길동");data.add("신용권");data.add("신용권");
		data.add("감자바");data.add("신민철");
		
		//중복 요소 제거
		data.stream().distinct().forEach(n->System.out.println(n));
		System.out.println();
		
		//신으로 시작하는 요소만 필터링
		data.stream().filter(n->n.startsWith("신")).forEach(n->System.out.println(n));
		System.out.println();
		
		//중복 요소를 제거하고, 신으로 시작하는 요소만 필터링
		data.stream().distinct().filter(n->n.startsWith("신")).forEach(n->System.out.println(n));
	}

	//스트림으로 파일을 읽는 방법
	private static void f5() throws URISyntaxException, IOException {
		//java.nio.file.Files의 lines() 메소드를 이용하면 텍스트 파일의 행 단위 스트림을 얻을 수 있다.
		//이는 텍스트 파일에서 한 행씩 읽고 처리할 때 유용하게 사용할 수 있다.
		Path path = Paths.get(StringTest3.class.getResource("data.txt").toURI()); //data.txt파일의 경로 객체 얻기
		Stream<String> stream = Files.lines(path, Charset.defaultCharset()); //Path로부터 파일을 열고 한 행씩 읽으며 문자열 스트림 생성
		stream.forEach(line->System.out.println(line));
		stream.close();
	}

	//일반적으로 파일을 읽을 때 쓰는 방법
	private static void f4() throws IOException {
		//현재 파일의 경로 읽기
		//FileInputStream은 1바이트씩 읽는다.
		//FileReader는 2바이트씩 읽는다. (이걸로 읽으면 한글이 안깨짐)
		FileReader fi = new FileReader("src/com/shinhan/day11/data.txt");
		int i;
		while((i=fi.read())!=-1) {
			System.out.println((char)i);
		}
	}

	private static void f3() {
		//1~9까지
		IntStream.range(1, 10).forEach(su->{
			System.out.println(su+"****");
		});
		//1~10까지 쓰고 싶으면 rangeClosed를 사용하면 된다.
		
		//외부 반복자
		for(int i=1; i<10; i++) {
			System.out.println("일반 for문:" + i);
		}
	}

	private static void f2() {
		List<Account> data = new ArrayList<>();
		data.add(new Account("123", "홍1", 1000));
		data.add(new Account("124", "홍3", 2000));
		data.add(new Account("125", "홍4", 3000));
		data.add(new Account("126", "홍2", 4000));
		data.add(new Account("127", "홍6", 5000));
		data.add(new Account("128", "홍5", 6000));
		//모든 계좌의 잔고의 합을 출력하기...외부반복자를 이용(속도가 더 느리다)
		//Stream을 이용하면 병렬처리 가능
		int total = 0;
		for(Account acc:data) {
			total += acc.getBalance();
		}
		//Stream을 이용하으로 내부반복자 이용
		long toatla2 = data.stream().mapToLong(acc->acc.getBalance()).sum();
		System.out.println("잔고의 합계1" +total);
		
		data.stream().map(acc->acc.getOwner()).count();
	
		System.out.println("건수는" + toatla2);
		

	}

	private static void f1() {
		//여러건 저장하기: 배열, Collection(List, Set, Map)
		List<Student> data = new ArrayList<>();
		data.add(new Student("강1", 100));
		data.add(new Student("강4", 90));
		data.add(new Student("강3", 70));
		data.add(new Student("강5", 60));
		data.add(new Student("강2", 80));
		//data를 stream으로 만들어서 중간처리, 최종처리
		data.stream().forEach((st)->{
			System.out.println(st.getName()+"-->"+st.getScore());
		});
		System.out.println("==================중간처리 test==================");
		data.stream()
		.mapToInt(st->st.getScore())//정수만 뽑는다(중간처리)
		.forEach(score->{
			System.out.println(score);
			System.out.println("----------------");
			});
		
		System.out.println("==================최종처리 test==================");
		/*double d = data.stream()
		.mapToInt(st->st.getScore())//정수만 뽑는다(중간처리)
		.average()
		.getAsDouble();
		System.out.println("average= " + d);*/
		
		System.out.println("==================Optional test1==================");
		OptionalDouble option = 
		data.stream()
		.mapToInt(st->st.getScore())//정수만 뽑는다(중간처리)
		.average();
		option.ifPresent(result -> System.out.println(result));
		
		
		System.out.println("==================Optional test2==================");
		data.stream()
		.mapToInt(st->st.getScore())
		.average().ifPresent(result->System.out.println(result));
	
		System.out.println("==================Optional test3==================");
		data.stream().mapToInt(st->st.getScore())
		.average()
		.ifPresentOrElse(d->{System.out.println(d);}, 
				()->{System.out.println("평균 계산 실패");});
		
	
	}
	

}
