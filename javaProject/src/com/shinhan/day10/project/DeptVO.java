package com.shinhan.day10.project;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@ToString
public class DeptVO {
	private int department_id;
	private String department_name;
	private int intmanager_id;
	private int location_id;
}
