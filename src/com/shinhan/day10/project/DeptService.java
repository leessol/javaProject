package com.shinhan.day10.project;

import java.util.List;


//service: Controller가 요청한 정보를 DAO로 전달 / DAO에서 응답받은 내용을 Controller에게 전달
//DB 상관없는 Business logic 수행

//중간자
public class DeptService {
	
	private DeptDAO dao = new DeptDAO();
	
	public List<DeptVO> selectAll() {
		// DB가서 데이터 가져오는 코드 추가될 예정. select * from department;
		return dao.selectAll();
	}
	
	
	public DeptVO selectById(int deptid){
		//부서의 번호를 찾아서 return 하기 
		return dao.selectById(deptid);
	}
	
	public void insert(DeptVO dept) {
		dao.insert(dept);
	}
}
