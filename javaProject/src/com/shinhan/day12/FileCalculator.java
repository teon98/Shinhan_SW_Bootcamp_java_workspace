package com.shinhan.day12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;

public class FileCalculator {
	void addCalculateResult(String inputFileName) throws Exception {
		FileReader fr = new FileReader(inputFileName);
		BufferedReader br = new BufferedReader(fr);
		String row;
		int sum = 0;
		int mul = 1;
		while((row=br.readLine())!=null){
			System.out.println(row);
			sum += Integer.parseInt(row);
			mul *= Integer.parseInt(row);
		}
		
		System.out.println(sum);
		System.out.println(mul);
		
		br.close();
		fr.close();
		
		//파일을 출력목적으로 열기
		FileWriter fw = new FileWriter(inputFileName,true);//append 여부
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.newLine();
		bw.write(sum+"");
		bw.newLine();
		bw.write(mul+"");
	
		bw.close();
		fw.close();
	}
	
	public static void main(String[] args) {
		String fileName = "src/com/shinhan/day12/data.txt";
		FileCalculator fc = new FileCalculator();
		try {
			fc.addCalculateResult(fileName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
