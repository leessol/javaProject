package com.shinhan.oracle;


import java.sql.Connection;
//밑줄 가면, module-info.java에 포함되도록 해줌. module-info.java에 포함되었는지 확인O
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class OracleConnectTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//나는 이 문장을 실행하고 싶어. sql파일을 만들어 실행해 본 후 데려옴.
		// String sqr = "select * from EMPLOYEES where employee_id = 100";
		System.out.println("조회하고자 하는 이름: ");
		Scanner sc = new Scanner(System.in);
		String inputName = sc.nextLine();
		
		String sqr = "select first_name, salary, hire_date "
				+ "from employees "
				+ "where lower(first_name) = lower('"
				+ inputName
				+ "')";
		
		//1. driver load가 로드되고,
		//드라이버를 올려라
		//Class.forName("oracle.jdbc.driver.OracleDriver");
		//Class aa= Class.forName("com.shinhan.day12.Student");
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("1. driver load 성공");
		
		//2. Connection로 연결한 후
		//1521 : 포트번호, xe : 실행환경?
		//어떤 드라이버 쓸거야? jdbc:oracle:thin
//		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe"; //oracle
		String url = "jdbc:mysql://127.0.0.1/hr"; //mysql
		String userid = "hr", pass = "hr";
		Connection conn = DriverManager.getConnection(url, userid, pass);
		System.out.println("2. Connection 성공");
		
		
		//3. Statement를 통해서 SQL전송 : Statement 2개 있음, jdbc에 있는 것 import 하면 됨
		//statement란 java가 왔다갔다할 통로
		Statement st = conn.createStatement(); // 통로 만들기 완성
		ResultSet rs = st.executeQuery(sqr); // sql이 간다. //executeQuery를 통해 결과를 가져옴
		//ResultSet : 데이터가 여러건 받을 수 있도록? 표같이 생김? 무조건 resultSet 형태로 옴.
		while (rs.next()) { // 다음게 있니? boolean
			  // 첫번째 컬럼 읽어라 (직원 아이디 : int 타입 이므로)
			System.out.println(rs.getString(1)); // 두번째 컬럼 읽어라
			System.out.println(rs.getString(3)); // 세번째 컬럼 읽어라
			System.out.println(rs.getInt("salary")); // 컬럼의 이름으로 읽음
			System.out.println("======================");
		}
		
		
		//자원 반남
		rs.close();
		st.close();
		conn.close();
	}
}