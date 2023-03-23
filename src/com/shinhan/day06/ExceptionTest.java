package com.shinhan.day06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//Exception (예외): 프로그래머의 노력으로 프로그램이 중단되지 않고 계속 진행하도록 할 수 있다. 
public class ExceptionTest {
	
	//결국 메인 문까지 와서 JVM이 처리한다. 
	public static void main(String[] args) throws IOException{
		System.out.println("시작");
		try {
			f6();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(RuntimeException e) {
			e.printStackTrace();
		}
		System.out.println("끝");

	}
	
	private static void f6() throws ClassNotFoundException {
		Class cls = Class.forName("com.shinhan.day06.Book");
		//return  타입이 class이다. 
		System.out.println(cls.getSimpleName());
	}

	private static void f5() throws IOException {
		//2. 떠넘긴다. --> 이 함수를 호출한 곳에 떠넘긴다. ex) f5()가 오류나면 f5()를 호출한 곳에 떠 넘긴다. 
		FileReader fr=new FileReader("ㅌㅌㅌsrc/com/shinhan/day06/Book.java");
		int i;
		//FileNotFoundException이 더 하위버전이라 IOException 으로 변경한다. 
		while((i = fr.read())!=-1) {
			System.out.print((char)i);
		}
		
	}

	private static void f4() {
		
		//try() {}: try 종료 후 자원자동반납된다. 
		try(FileReader fr=new FileReader("src/com/shinhan/day06/Book.java")) {
			//FileReader 로 해야 한글 안꺠짐. 
			System.out.println("파일 존재한다..... 파일이 열림");
			int i;
			while((i = fr.read())!=-1) {
				System.out.print((char)i);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
		}
		
	}

	//일반 예외 (컴파일 시점 에러): 컴파일 시점에 반드시 처리해야 한다. 
	//1. 내가 한다. 2. 떠넘긴다. 
	private static void f3() {
		FileReader fr=null;
		
		//1. 내가 한다. -> try / catch (파일 존재 유무 소스코드는 한줄인데 예외처리 소스가 너무 길다. 
		try {
			fr = new FileReader("src/com/shinhan/day06/Book.java"); // 파일 안존재하면? 오류생김 
			//FileReader 로 해야 한글 안꺠짐. 
			System.out.println("파일 존재한다..... 파일이 열림");
			int i;
			while((i = fr.read())!=-1) {
				System.out.print((char)i);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

	//런타임 에러 (Runtime Exception)
	private static void f2() {
		try {
			//#1번 오류
//			int a = 10;
//			int b = 0;
//			System.out.println(a/b);
//			System.out.println("여기는 안옴");
			
			//#2번 오류
//			int[] arr = new int[5];
//			System.out.println(arr[0]);
//			System.out.println(arr[5]);
			
			//3. ClassCastException
			//Object obj = new String("자바"); //--> 오류안남
//			Object obj = new Object ();	// --> 	Object로 만든 객체를 String 으로 형변환 함. 오류남
//			System.out.println(obj.toString());
//			String s = (String) obj;
//			System.out.println(s.length());
			
			//4. numberFormat
			String su = "100점";
			int total = Integer.parseInt(su) + 200;
			System.out.println(total);
			
 			
		}catch(NumberFormatException ex) {
			//ex.printStackTrace(); // 오류과정 출력
			System.out.println(ex.getMessage());
		}catch(ClassCastException ex) {
			//ex.printStackTrace(); // 오류과정 출력
			System.out.println(ex.getMessage());
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException ex) { // | 는 OR를 의미한다. 
			//ex.printStackTrace(); // 오류과정 출력
			System.out.println(ex.getMessage());
		}catch(Exception ex) { // 위에서 안 걸러진 오류들은 전부 여기로 들어간다. // catch는 하위 먼저, 상위 나중에 작성한다.  
			//ex.printStackTrace(); // 오류과정 출력
			System.out.println(ex.getMessage());
		} finally {
			System.out.println("이 부분은 반드시 처리한다..... 자원반납코드를 쓴다. disconnect(디비 연결 해제) / fileClose(파일 닫기)");
			//에러가 안나도 수행된다. 
		}
		
	}

	private static void f1() {
		// 실행 예외: 컴파일 시에는 오류 없음. (실행 시 오류가 난다. )  
		int a = 10;
		int b = 20;
		System.out.println(a/b);
		// 기타 예외: 컴파일 시점부터 반드시 처리해야한다. 
		
		//3. ClassCastException
		Object obj = new String("자바"); //--> 오류안남
		//Object obj = new Object ();	// --> 	Object로 만든 객체를 String 으로 형변환 함. 오류남
		System.out.println(obj.toString());
		String s = (String) obj;
		System.out.println(s.length());
		
		//4. 
		String su = "100";
		int total = Integer.parseInt(su) + 200;
	}

}
