package com.shinhan.day10;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode(of= {"subject", "writer"})
public class Board implements Comparable<Board>{
	int boardNo;
	private String subject;
	private String content;
	private String writer;
	
	@Override
	public int compareTo(Board board) {
		int result1 = subject.compareTo(board.subject);
		int result2 = writer.compareTo(board.writer);
		
		if(result1 == 0) {
			if(result2 == 0) {
				return boardNo - board.boardNo;
			}else {
				return result2;
			}
		}else {
			return result1;
		}
	}
}
