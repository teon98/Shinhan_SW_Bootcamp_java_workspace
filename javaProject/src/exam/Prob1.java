package exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Prob1 {
	public static void main(String[] args) {
		String[] array={"황남기85점","조성호89점","한인성88점","독고정진77점"};
		printMaxScore(array);
	}	
	private static void printMaxScore(String[] array){
		
		Stream<String> strStream = Arrays.stream(array);
		
		String max_name = "";
		int max_score = 0;
		
		for(int i=0; i<array.length; i++) {
			String name = array[i].substring(0,array[i].length()-3);
			int score = Integer.parseInt(array[i].substring(array[i].length()-3, array[i].length()-1));
			
			if(score>max_score) {
				max_score = score;
				max_name = name;
			}
		}
		
		System.out.println("최고점수는 " + max_name +"님 " + max_score+"점 입니다.");
		 
	}	
}