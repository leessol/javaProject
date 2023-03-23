package aProject.view;

import java.util.List;

import aProject.vo.EmpVO;

public class EmpView {

	// 전체
	public static void print(List<EmpVO> empList) {
		System.out.println("=============직원들 정보===============");
		for (EmpVO emp : empList) {
			System.out.println(emp);
		}
	}

	// 한 row출력
	public static void print(EmpVO emp) {
		System.out.println("=============직원 상세===============");
		if (emp == null) {
			print("직원이 존재하지 않습니다. ");
		} else {
			System.out.println(emp);
		}
	}

	// 한 row출력
	public static void print(String message) {
		System.out.println("[알림]" + message);
	}
}
