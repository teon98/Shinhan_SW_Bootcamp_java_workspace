package com.shinhan.day07;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@ 어노테이션: 컴파일러가 해석하는 주석
//@NoArgsConstructor 
//@Getter
//@Setter
//@EqualsAndHashCode (exclude = {"maker"})
//@ToString
@Data //다 합쳐진거 (기본 생성자, Getter, Setter, hashCode(), equals(), toString() 다 있음)
@RequiredArgsConstructor
@AllArgsConstructor 
public class Computer {
	@NonNull 
	private String  model;
	private int price;
	private String maker;
}
