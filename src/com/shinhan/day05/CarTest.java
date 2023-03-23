package com.shinhan.day05;

public class CarTest {

		
	//Tire 타입으로 받아야지 다양성을 이룰수 있음. 
	void go(Tire tire) {
		tire.roll();
		if (tire instanceof KumhoTire) {
			KumhoTire kum = (KumhoTire) tire; //오리지널 코드
			System.out.println(kum.info);
			kum.method1();
		} else if (tire instanceof HanKokTire han) {
			//HanKokTire han = (HanKokTire) tire; //매개변수에 변수 han 넣어주면 됨. 바뀜
			System.out.println(han.intro);
			han.method2();
		}
		
	}
	
	
}
