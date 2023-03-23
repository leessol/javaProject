package com.shinhan.day11;

public class LambdaTest1 {

	public static void main(String[] args) {
		f5();
	}

	private static void f5() {
		//람다
		Calculable2 f = (a,b) -> a+b;
		Calculable2 f3 = (a,b) -> {
			System.out.println("여러문장이면 {}필요");
			System.out.println("반드시 return 문 필요");
			return a+b;
		};
		//익명
		Calculable2 f2 = new Calculable2() {
			
			@Override
			public int calculate(int x, int y) {
				
				return x+y;
			}
		};
		
		int result1 = f.calculate(1, 2);
		int result2 = f2.calculate(1, 2);
		int result3 = f3.calculate(1, 2);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}

	private static void f4() {
		Person p1 = new Person();
		p1.action(new Workable() {

			@Override
			public void work(String name, String job) {
				System.out.println("이름은 : " + name);
				System.out.println("직업은 : " + job);
				System.out.println("---------------");

			}
		});

		p1.action((a,b) -> System.out.println(a + "---" + b));
		
		//여러문장 {}안에 넣어준다. 
		p1.action((a,b) -> {
			System.out.println("이름은 : " + a);
			System.out.println("직업은 : " + b);
			}
		);
		
		//변수로 넣어놓고 싶다면...
		Workable f = (a,b) -> {
				System.out.println("이름은 : " + a);
				System.out.println("직업은 : " + b);
			};
		p1.action(f);
		
		//인자가 한개이면 굳이 ()안에 넣을 필요 없다. 
		//p1.action2(s->System.out.println(s+"말하기")); --> 추상 메소드에 return 값이 생기면,,?
		Speakable f2 =s-> s+"!!!!!";
		p1.action2(f2);
		
	}

	private static void work(Runnable r) {
		Thread t1 = new Thread(r);
		t1.start();
	}

	private static void f3() {
		// Runnable r =
		// thread 4개 생성됨
		work(() -> {
			System.out.println("A");
		});
		work(() -> {
			System.out.println("B");
		});
		work(() -> {
			System.out.println("C");
		});
		work(() -> {
			System.out.println("D");
		});

	}

	private static void action(Calculable func) {
		func.calculate(3, 9);
	}

	private static void f2() {
		// 1. 구현 class
		// 2. 익명 class
		/*
		 * Calculable a = new Calculable() {
		 * 
		 * @Override public void calculate(int x, int y) {
		 * System.out.println("==== 익명 구현 클래스 이용===="); System.out.println(x+y); } };
		 * 
		 * a.calculate(3,9);
		 */
		Calculable f = new Calculable() {

			@Override
			public void calculate(int x, int y) {
				System.out.println("==== 익명 구현 클래스 이용====");
				System.out.println(x + y);
			}
		};

		Calculable f2 = new Calculable() {

			@Override
			public void calculate(int x, int y) {
				System.out.println("==== 익명 구현 클래스 이용====");
				System.out.println(x - y);
			}
		};

		action(f);
		action(f2);

		// 3. 람다식
		Calculable f3 = (a, b) -> {
			System.out.println("==== 익명 구현 클래스 이용====");
			System.out.println(a * b);
		};

		action(f3);
	}

	private static void f1() {
		// 1. 구현 class
		MyInterface mi = new MyClassImplement();
		mi.print();

		// 2. 익명 구현 class
		MyInterface b = new MyInterface() {

			@Override
			public void print() {
				System.out.println("익명 구현 class에서 구현한다.....");

			}
		};
		b.print();

		// 3. 람다식 이용 (JS에서는 화살표 함수) --> 처리해야할 함수가 하나만 있을떄 (인터페이스가 단 하나의 추상 메소드를 가지는 것)
		MyInterface c = () -> System.out.println("람다식에서 구현한다.....");
		c.print();

	}

}
