package com.shinhan.day10.project;

import java.util.ArrayList;
import java.util.List;

//CRUD작업 
//DAO: Data Access Object
public class DeptDAO {
	private List<DeptVO> data = new ArrayList<>();
	
	//모두 조회: 
	public List<DeptVO> selectAll() {
		//DB가서 데이터 가져오는 코드 추가될 예정. select * from department;
		return data;
	}
	
	public DeptVO selectById(int deptid){
		//부서의 번호를 찾아서 return 하기 
		
		for(DeptVO dept:data) {
			if(dept.getDepartment_id() == deptid) return dept;
		}
		return null;
	}
	
	public void insert(DeptVO dept) {
		data.add(dept);
	}
	
	
}
