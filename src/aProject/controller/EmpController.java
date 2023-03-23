package aProject.controller;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import aProject.model.EmpService;
import aProject.view.EmpView;
import aProject.vo.EmpVO;

//프로그램이 시작되어야 하니깐 이 파일에만 main문이 존재한다. 
public class EmpController {

	public static void main(String[] args) {
		

		EmpService eService = new EmpService();
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("1. selectAll");
			System.out.println("2. selectRow");
			System.out.println("3. selectByCondition");
			System.out.println("4. selectByConditions");
			System.out.println("5. 부서의 평균급여 이하");
			System.out.println("6. 신규등록");
			System.out.println("7. 수정");
			System.out.println("8. 삭제");
			System.out.println("9. 삭제");
			System.out.println("e. EXIT");
			System.out.println();
			System.out.print("작업을 선택해주세요>>>>>>>>");
			
			String option = sc.next();
			if(option.equals("e")) break;
				
			switch(option) {
			case "1":
				EmpView.print(eService.selectAll());
				break;
			case "2":
			{
				System.out.print("조회할 직원번호 입력해주세요 >>>");
				int empid = sc.nextInt();
				EmpView.print(eService.selectById(empid));
				break;
			}
			case "3":
				{
					System.out.print("조회할 부서번호 입력해주세요 >>>");
					int deptid = sc.nextInt();
					EmpView.print(eService.selectByDept(deptid));
					break;
				}
			case "4":
				{
					//nextLine(1줄 enter 포함) / 공백 분리한 단어 = nextInt(), next() --> 단어만 읽는다. 
					System.out.print("조회할 부서번호 입력해주세요 >>>");
					int deptid = sc.nextInt();
					System.out.print("조회할 직무번호 입력해주세요 >>>");
					String jobid = sc.next();
					System.out.print("조회할 급여 입력해주세요 >>>");
					double salary = sc.nextDouble();
					EmpView.print(eService.selectByCondition(deptid,jobid,salary));
					break;
				}
			case "5":
				{
				//nextLine(1줄 enter 포함) / 공백 분리한 단어 = nextInt(), next() --> 단어만 읽는다. 
					
				List<EmpVO> empList = eService.selectLAB();
				System.out.print("[Controller] 5번 작업: "+empList.size());
				EmpView.print(empList);
				break;
				}
			case "6":
				{
				EmpVO emp = makeEmp(sc);
				EmpView.print(eService.empInsert(emp));
				break;
				}
			case "7":
				{	
				System.out.print("수정할 직원 ID>>>");
				int empid = sc.nextInt();
				//수정할 정보 한번 보여줌
				EmpView.print(eService.selectById(empid)); 
				
				//수정시작
				EmpVO emp = makeEmp2(sc,empid);
				EmpView.print(eService.empUpdate(emp));
				break;
				}
			case "8":
				{
				System.out.print("삭제할 직원 ID>>>");
				int empid = sc.nextInt();
				//삭제할 정보 한번 보여줌
				EmpView.print(eService.selectById(empid)); 
				
				//삭제시작
				EmpView.print(eService.empDelete(empid));
				break;
				}
			case "9":
				{
				System.out.print("조회할 직원번호 입력해주세요 >>>");
				int empid = sc.nextInt();
				EmpView.print("급여는 " + eService.getSalary(empid));
				break;
				}
			}
			
		}
		System.out.println("Bye Bye~~~~");

	}
	
	private static EmpVO makeEmp(Scanner sc) {
		//nextLine(1줄 enter 포함) / 공백 분리한 단어 = nextInt(), next() --> 단어만 읽는다. 
		System.out.print("1. 신규직원의 First_name 입력>>>");
		String firstName = sc.next();
		System.out.print("2. 신규직원의 Last_name 입력>>>");
		String lastName = sc.next();
		System.out.print("3. 신규직원의 getEmail 입력>>>");
		String email = sc.next();
		System.out.print("4. 신규직원의 Job_id 입력>>>");
		String jobid = sc.next();
		System.out.print("5. 신규직원의 Phone_number 입력>>>");
		String phone = sc.next();
		System.out.print("6. 신규직원의 Manager 입력>>>");
		int manager = sc.nextInt();
		System.out.print("7. 신규직원의 Department 입력>>>");
		int dept = sc.nextInt();
		System.out.print("8. 신규직원의 Commission_pct 입력>>>");
		Double commission = sc.nextDouble();			
		System.out.print("9. 신규직원의 Salary 입력>>>");
		Double salary = sc.nextDouble();			
		System.out.print("10. 신규직원의 Hire_date 입력>>>");
		String sdate = sc.next();
		//String->Date //문자를 날짜로 바꿔라
		Date hire_date = DateUtil.convertodate(sdate);
		
		//--------------------
		//3개의 정보를 다시 통합
		EmpVO emp = new EmpVO();
		emp.setFirst_name(firstName);
		emp.setLast_name(lastName);
		emp.setEmail(email);
		emp.setJob_id(jobid);
		emp.setPhone_number(phone);
		emp.setManager_id(manager);
		emp.setDepartment_id(dept);
		emp.setCommission_pct(commission);
		emp.setSalary(salary);
		emp.setHire_date(hire_date);
		//-----------------------
		return emp;
			
	}
	
	
	private static EmpVO makeEmp2(Scanner sc, int empid) {
		//nextLine(1줄 enter 포함) / 공백 분리한 단어 = nextInt(), next() --> 단어만 읽는다. 
		
		
		
		System.out.print("1. 신규직원의 getEmail 입력>>>");
		String email = sc.next();
		System.out.print("2. 신규직원의 Job_id 입력>>>");
		String jobid = sc.next();
		System.out.print("3. 신규직원의 Department 입력>>>");
		int dept = sc.nextInt();	
		System.out.print("4. 신규직원의 Salary 입력>>>");
		Double salary = sc.nextDouble();			
		
		//--------------------
		//3개의 정보를 다시 통합
		EmpVO emp = new EmpVO();
		emp.setEmployee_id(empid);
		emp.setEmail(email);
		emp.setJob_id(jobid);
		emp.setDepartment_id(dept);
		emp.setSalary(salary);
		
		//-----------------------
		return emp;
		
	}

}
