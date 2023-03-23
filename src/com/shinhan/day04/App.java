package com.shinhan.day04;

public class App {

	public static void main(String[] args) {
		
		//Integer a  = new Integer(200);
		
		
		//f1();
		sum(1,2);
		sum(1,2,3);
		sum(1.5,2.5);
	}
	
	//파라미터의 갯수가 가변일 때 ...을 사용한다. 
	static void sum(int ... arr) { //int [] arr 와 같다. 
		int total = 0;
		for (int num : arr) {
			total += num;
		}
		
		if(total == 0 ) return; // return: 함수 중단하고 호출한 곳으로 돌아간다. 
		System.out.println("가변길이의 매개변수 수는 : " + total);
	}
	
	static void sum(int i, int j, int k) {
		System.out.println("합계2: " + (i+j+k));
		
	}

	//메서도 overloading 메서드 이름은 같고 매개변수 사양이 다르다. 
	// 파라미터 자동 형변환이 일어난다. 
	static void sum(double a, double b) {
		// TODO Auto-generated method stub
		System.out.println("합계: " + (a+b));
	}

	private static void f1() {
		Calculator [] arr = new Calculator[4];
		Calculator.powerOn(); // 아래의 cal.powerOn하면 좀 어색함 static 클래스 변수라서 원래는 이렇게 쓰는게 맞다
		arr[0] =new Calculator("red");
		arr[0].setModel("A모델");
		//print(v1);
		arr[1] =new Calculator("black");
		//print(v2);
		arr[2] =new Calculator("B모델","blue");
		//print(v3);
		arr[3] =new Calculator("B모델","blue",3000);
		//print(v4);
		for (Calculator cc:arr) {
			print (cc);
		}
	}

	private static void print(Calculator cal) {
		// TODO Auto-generated method stub
		System.out.println(cal.getModel());
		System.out.println(cal.getColor());
		System.out.println(cal.getPrice());
		
		cal.powerOn();
		cal.powerOff();
		System.out.println(cal.add(1, 2));
		System.out.println(cal.sub(1, 2));
	}
	

	

}
