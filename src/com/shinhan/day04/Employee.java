package com.shinhan.day04;

import java.util.Objects;

public class Employee implements Comparable<Employee> {
	private String name;
	private String title;
	private int baseSalary;
	private int totalSalary;
	
	public Employee(String name, String title, int baseSalary) {
		this.name = name;
		this.title = title+"님";
		this.baseSalary = baseSalary;
		getTotalSalary();
	}
	
	private void getTotalSalary() {
		//== 이건 주소가 같냐고 물어본것임. 문자열을 비교할 때는 반드시 equals() 함수를 사용해야 한다. 
		if (title.equals("부장님")) {
			totalSalary = (int) (baseSalary + baseSalary*0.25);
		} else if (title.equals("과장님")) {
			totalSalary = (int) (baseSalary + baseSalary*0.15);
		} else {
			totalSalary = (int) (baseSalary + baseSalary*0.05);
		}
	
	}
	
	public void print() {
		System.out.println(title + " 직급의 " + name + "씨의 본봉은 " + baseSalary + " 원이고 총 급여는 " + totalSalary + " 원입니다");
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", title=" + title + ", baseSalary=" + baseSalary + ", totalSalary="
				+ totalSalary + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(name, other.name) && Objects.equals(title, other.title);
	}

	
	@Override
	public int compareTo(Employee emp) {
		//return name.compareTo(emp.name);
		int result = name.compareTo(emp.name)*-1;
		int result2 = baseSalary-emp.baseSalary;
		if(result2 == 0) return title.compareTo(emp.title);
		if(result == 0) return result2;
		return result;
	}

	
	
	
}



























