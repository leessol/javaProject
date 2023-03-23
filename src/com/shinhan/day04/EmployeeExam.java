package com.shinhan.day04;

public class EmployeeExam {

	public static void main(String[] args) {
		Employee [] arr = new Employee[4]; 
		arr[0]=new Employee("이부장씨", "부장", 1500000);
		arr[1] = new Employee("김과장씨", "과장", 1495000);
		arr[2] = new Employee("이대리씨", "대리", 1260000);
		arr[3] = new Employee("박사원씨", "사원", 1050000);
		
		for (Employee person:arr) {
			person.print();
		}
	}

}
