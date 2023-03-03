package com.shinhan.day08;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//롬북사용
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(of = {"kind"})
@Getter
@Setter
public class Product <T,M>{
	//T와 M은 어떤 문자가 들어가도 상관 X
	//하지만 가급접 관례를 따르기
	T kind;
	M model;
}
