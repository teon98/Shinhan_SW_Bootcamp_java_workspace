package com.shinhan.day10.project;

import java.util.*;

//CRUD작업(Create, Read, Update, Delete)
//DAO(Data Access Object)
public class DeptDAO { //Database에 접속하여 DB작업을 처리하는 것

	private List<DeptVO> data = new ArrayList<DeptVO>();
	
	//모두조회
	List<DeptVO> selectALL() {
		//DB가서 data가져오기 code추가될 예정 select * from departments;
		return data;
	}
	
	public DeptVO selectById(int deptid){
		//부서의 번호를 찾아서 return
		
		for(DeptVO dept:data) {
			if(dept.getDepartment_id() == deptid) return dept;
		}
		return null;
	}
	
	public void insert(DeptVO dept) {
		data.add(dept);
	}
}
