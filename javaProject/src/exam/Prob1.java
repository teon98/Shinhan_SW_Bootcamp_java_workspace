package exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Prob1 {
	public static void main(String[] args) {
		String[] array={"황남기85점","조성호89점","한인성아우디아라비아스100점","독고정진77점"};
		printMaxScore(array);
	}	
	private static void printMaxScore(String[] array){
		
		Stream<String> strStream = Arrays.stream(array);
		
		String name = "";
		String score = "";
		
		int max_score = 0;
		String max_name = "";
		
		for(String s:array) {
			for(int i=0; i<s.length(); i++) {
				char c = s.charAt(i);
				if(Character.isDigit(c)==true) {
					score += c;
				}else if(c=='점') {
					continue;
				}
				else {
					name += c;
				}
				
			}
				if(Integer.parseInt(score)>max_score) {
					max_score = Integer.parseInt(score);
					max_name = name;
				}
				
				name = "";
				score = "";
		}
		
		System.out.println("최고점수는 " + max_name +"님 " + max_score+"점 입니다.");
		 
	}	
}