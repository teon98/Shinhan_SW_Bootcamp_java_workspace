package com.shinhan.day12;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Date;

import com.shinhan.day05.Account;

public class IOTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		f11();
	}

	private static void f12() {
		// TODO Auto-generated method stub
		
	}

	private static void f11() {
		String fileName = "src/com/shinhan/day12/scoredata.txt";
		File f = new File(fileName);
		
		System.out.println(f.exists());
		System.out.println(f.lastModified());
		
		Date d = new Date(f.lastModified());
		System.out.println(d);
		
		System.out.println("파일사이즈: " + f.length());
		System.out.println(f.isDirectory());
		System.out.println(f.isFile());
	}

	private static void f10() throws IOException {
		FileOutputStream fw = new FileOutputStream("serialize.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fw);//자바에 더 가깝다.
		oos.writeObject(new Account("123", "김1"));
		oos.writeObject(new Account("333", "김2"));
		oos.writeObject(new Account("444", "김3"));
		oos.close();
		fw.close();
		FileInputStream fi = new FileInputStream("serialize.dat");
		ObjectInputStream ois = new ObjectInputStream(fi);
	}

	private static void f9() throws IOException, ClassNotFoundException {
		FileOutputStream fw = new FileOutputStream("serialize.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fw);//자바에 더 가깝다.
		
		oos.writeObject(new Student("김1", 100, 40));
		oos.writeObject(new Student("김2", 100, 99));
		oos.writeObject(new Student("김3", 100, 99));
		
		FileInputStream fi = new FileInputStream("serialize.dat");
		ObjectInputStream ois = new ObjectInputStream(fi);
		Student s1 = (Student)ois.readObject();
		Student s3 = (Student)ois.readObject();
		Student s2 = (Student)ois.readObject();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		fi.close();
		oos.close();
	}

	private static void f8() throws IOException {
		FileWriter fw = new FileWriter("print.txt");
		PrintWriter pw = new PrintWriter(fw);
		
		pw.print(false);
		pw.print("false");
		pw.write(12345);
		pw.write("false");
		pw.write("true");
		
		fw.close();
		pw.close();
	}

	private static void f7() throws IOException {
		OutputStream fw = new FileOutputStream("primitivedata.txt");
		//자바의 기본 타입을 저장하고 그대로 읽고자한다.
		DataOutputStream dos = new DataOutputStream(fw);
		dos.write(123);
		dos.write(200);
		dos.writeChar('a');
		dos.writeDouble(3.14);
		dos.writeBoolean(false);
		dos.close();
		fw.close();
		
		FileInputStream fr = new FileInputStream("primitivedata.txt");
		DataInputStream dr = new DataInputStream(fr);
		int a = dr.read();
		int b = dr.read();
		char c = dr.readChar();
		double d = dr.readDouble();
		boolean e = dr.readBoolean();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		fr.close();
		dr.close();
	}

	private static void f6() throws IOException {
		String fileName = "src/com/shinhan/day12/scoredata.txt";
		Path path = Paths.get(fileName);
		
		Files.lines(path).forEach(row->{
			System.out.print(row.replaceAll("/", "\t"));
			String[] arr = row.split("/");
			int total = 0;
			for(int i=1; i<arr.length; i++) {
				try {
					total += Integer.parseInt(arr[i]);
				}catch(NumberFormatException e) {
					
				}
			}
			System.out.println("\t" + total + "\t" + total/(arr.length-1));
		});
	}

	//보조 스트림 예제
	private static void f5() throws IOException {
		String path = "src/com/shinhan/day12/scoredata.txt";
		FileReader fr = new FileReader(path);
		BufferedReader br = new BufferedReader(fr);
		String row;
		String title = br.readLine();
		System.out.println(title.replace("/", "\t") + "\t총점\t평균");
		while((row=br.readLine())!=null) {
			System.out.print(row.replaceAll("/", "\t"));
			String[] arr = row.split("/");
			int total = 0;
			for(int i=1; i<arr.length; i++) {
				total += Integer.parseInt(arr[i]);
			}
			System.out.println("\t" + total + "\t" + total/(arr.length-1));
		}
		
		fr.close();
	}

	private static void f4() {
		//1.class기준
		//Path path = Paths.get(StreamTest3.class.getResource("data.txt").toURI());
		//2.절대경로 /로 시작한다.
		//Path path = Paths.get(StreamTest3.class.getResource("/com/shinhan/day11/data.txt").toURI());
		//3.상대경로는 현재위치를 기준으로한다.
		//다음은 현재의 절대경로를 얻는다.
		Path path = Paths.get(""); //1)
		//String absolute = System.getProperty("user.dir")+"/data.txt";//2)
		//Path path = Paths.get(absolute);
		String s = path.toAbsolutePath().toString();
		path =Paths.get(s+"/data.txt");
		System.out.println("현재 작업 경로: " + s);
		System.out.println(Charset.defaultCharset());
	}

	private static void f3() throws IOException {
		String path = "src/com/shinhan/day12/Student.java";
		FileReader fr = new FileReader(path);
		//파일 저장하기
		FileWriter fw = new FileWriter("Student.java");
		int i;
		
		while((i = fr.read())!=-1) {
			System.out.print((char)i);
			fw.write(i);
		}
		
		
		fw.close();
		fr.close();
		
	}

	private static void f2() throws IOException {
		String path = System.getProperty("user.dir");
		path += "\\src\\com\\shinhan\\day11\\data.txt";
		System.out.println(path);
		FileInputStream fi = new FileInputStream(path);
		//보조스트림: 중에 1) Stream => Reader
		InputStreamReader ir = new InputStreamReader(fi);
		int i; //-1은 EOF(End Of File)이다.
		while((i = fi.read()) != -1 ) {
			System.out.print((char)i);
		}
		ir.close();
		fi.close();
		System.out.println("f2 end");
	}

	private static void f1() throws IOException {
		//1바이트씩 처리: InputStream, OutputStream,
		//2바이트씩 처리: Reader, Writer
		//파일을 처리할때: FileInputStream, FileOutputStream, FileReader, FileWriter
		InputStream is = System.in; //표준입력: 키보드이다. 변경 가능
		byte[] arr = new byte[100];//100바이트를
		int i = is.read(arr); //한번에 읽고
		System.out.println(i);//저장된 수가 저장됨.
		System.out.println(Arrays.toString(arr));
		for(int a=0; a<i-2; a++) {//끝에서 2개는 엔터여서 필요 없음.
			System.out.print((char) arr[a]);//뺀것만큼 출력~
		}
	}

}
