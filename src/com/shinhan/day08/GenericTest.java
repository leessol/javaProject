package com.shinhan.day08;

import java.util.ArrayList;

public class GenericTest {

	public static void main(String[] args) {
		//method1();
		//method2();
		//method3();
		
		wildCardTest3();
	}
	
	private static void wildCardTest4() {
		HappyBox<String> box = new HappyBox<String>("A", 400);
		//f1(box);
		
		HappyBox<Integer> box2 = new HappyBox<Integer>(50,100);
		//f2(box2);
		
		HappyBox<Integer> box3 = new HappyBox<Integer>(50,100);
		//f3(box3);
	}
	
	private static void f3(HappyBox<? super Number> param) {
		System.out.println("f3");
	}
	
	private static void f2(HappyBox<? extends Number> param) {
		System.out.println("f2");
	}
	
	private static void f1(HappyBox<?> param) {
		System.out.println("f1");
	}

	private static void wildCardTest3() {
		// ?, extend, super 연습
		//? --> 다 됨. 모두 다 등록이 된다. 
		Course.registerCourse3(new Applicant<Person>(new Person()));
		//Course.registerCourse3(new Applicant<Student>(new Student()));
		Course.registerCourse3(new Applicant<Worker>(new Worker()));
		//Course.registerCourse3(new Applicant<HighStudent>(new HighStudent()));
		//Course.registerCourse3(new Applicant<MiddleStudent>(new MiddleStudent()));
		
	}
	
	private static void wildCardTest2() {
		// ?, extend, super 연습
		//extend -> student 의 하위 클래스들만 된다.  
		//Course.registerCourse2(new Applicant<Person>(new Person()));
		Course.registerCourse2(new Applicant<Student>(new Student()));
		//Course.registerCourse2(new Applicant<Worker>(new Worker()));
		Course.registerCourse2(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));
		
	}
	
	private static void wildCardTest() {
		// ?, extend, super 연습
		//? --> 다 됨. 모두 다 등록이 된다. 
		Course.registerCourse(new Applicant<Person>(new Person()));
		Course.registerCourse(new Applicant<Student>(new Student()));
		Course.registerCourse(new Applicant<Worker>(new Worker()));
		Course.registerCourse(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse(new Applicant<MiddleStudent>(new MiddleStudent()));
		
	}

	//generic extend
	private static void method3() {
		
		genericExtendMethod(new ChildA());
		genericExtendMethod(new ChildB());
		
		//method4(new HappyBox<>("사과",0));
		//method5(new HappyBox<>(600,0));
		//method6(new HappyBox<>(new ChildA(),0));
	}
	
	private static <T> void genericExtendMethod4(HappyBox<?> param) { //?: 아무나 다 올 수 있다. 
		System.out.println("? super Number:  Number의 자신과 상위만 가능. ");
	}
	
	private static <T> void genericExtendMethod3(HappyBox<? extends Number> param) { //?: 아무나 다 올 수 있다. 
		System.out.println("? extends Number:  Number의 자식만 가능");
	}
	
	//제네릭타입 제한(extend, super, ?)
	private static <T> void genericExtendMethod2(HappyBox<?> param) { //?: 아무나 다 올 수 있다. 
		System.out.println("?는 제한이 없다. ");
	}


	private static <T extends Parent> void genericExtendMethod(T param) {
		System.out.println("genericExtendMethod,,,,,");
	}

	private static void method2() {
		int a =10;
		int b = 20;
		boolean result = compare(a,b); //나는 int형을 썼지만 들어갈때는 integer로 박싱이 된다. 자동으로 
		System.out.println(result);
		
		String s1 = "자바";
		String s2 = "자바";
		result = compare(s1,s2); //주소가 같음
		//result = compare1(s1,s2); // //오류남 String클래스는 Number클래스에 자식 클래스가 아니니깐
		
		System.out.println(result);
	}

	
	private static void method1() {
		HappyBox<String> box1 = Boxing("과일박스"); //사용하는 쪽에서 타입을 정한다. 
		HappyBox<Integer> box2 = Boxing(500);
		HappyBox<Money> box3 = Boxing(new Money(200));
		
		System.out.println(box1);
		System.out.println(box2);
		System.out.println(box3);
		
	}

	//타입에 제한걸기: extends Number 는 Number를 상속받은 하위 class만 가능하다는 의미
	public static <T extends Number> boolean compare1(T a,T b) {
		return a.equals(b);
	}
	
	public static <T> boolean compare(T a,T b) { //사용하는 쪽에서 T를 정할거야~ 지금은 몰라~ (매개변수는 무조건 객체형으로 적어야 한다)
		return a==b; //사용할 때는 언박싱이 되어서 다시 int형으로 돌아온다. 그래서 ==을 사용하면됨. 기본형이니깐 
		//return a.equals(b);하면 일단은 object것이 뜸 왜냐면 T로 가변으로 정해놨기 때문에. 사용할 때 타입이 정해지면 그떄 각 타입의 오버라이딩 된것으로 출력이 된다. 
	}

	private static <T> HappyBox<T> Boxing(T kind) { //맨앞에 <T>를 언급하는 것은, 제네릭 타입을 쓸거야~ 아직 안정해졌어 라는 의미로 적어주는 것이다. HappyBox<T>만 있는 타입은 없다. 앞에 제네릭이라는 것을 언급해줘야함. 
		//위에 메인문에서 하나의 타입만 받은게 아니라 여러가지 타입을 받은것이므로 T를 매개변수로 하여 받는다 
		return new HappyBox<T> (kind,1000);
	}
	
	private static <T,A,B> int Boxing2(T kind,A a,B b,String s) { //T,A,B 는 자바의 타입이 아니고 사용할때 정할거야~
		return 100;
	}

	private static void f5() {
		Product<String,Integer> p1 = new Product<>("책", 1234); //정보은닉, 안에 model kind 변수명 알 수 없
		//<> 안에는 객체만 된다. 기본형인 int형 안됨. Integer 적어야 함. 
		System.out.println(p1);
		Product<String,Integer> p2 = new Product<>("책1", 2500); //정보은닉, 안에 model kind 변수명 알 수 없
		//System.out.println(p1 == p2);
		System.out.println(p1.equals(p2)); //kind만 같으면 같다고 만들려면 @EqualsAndHashCode에서 (of = {"kind"})를 적어주면 된다. 
		
	}

	private static void f4() {
			ArrayList<Money> data = new ArrayList<>();
			data.add(new Money(1));
			data.add(new Money(2));
			data.add(new Money(3));
			data.add(new Money(4));
			for(Money s : data) {
				System.out.println(s);
			}
		}
	

	private static void f3() {
		ArrayList<String> data = new ArrayList<>();
		data.add("월요일");
		data.add("화요일");
		data.add("수요일");
		data.add("목요일");
		for(String s : data) {
			System.out.println(s);
		}
		
		
	}

	private static void f2() {
		HappyBox<String> b1 = new HappyBox<String>("바나나", 100);
		HappyBox<String> b2 = new HappyBox<String>("사과", 100);
		HappyBox<String> b3 = new HappyBox<String>("수박", 100);

		//형변환 할 필요가 없다. 
		String s1 = b1.kind;
		String s2 = b2.kind;
		String s3 = b3.kind;
		
		HappyBox<Money> b4 = new HappyBox<Money>(new Money(10), 100);
		HappyBox<Money> b5 = new HappyBox<Money>(new Money(20), 100);
		HappyBox<Money> b6 = new HappyBox<Money>(new Money(30), 100);

		//타입이 제한됨
		Money m1 = b4.kind;
		Money m2 = b5.kind;
		Money m3 = b6.kind;
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m1.equals(m3));
		
	}

	private static void f1() {
		Box b1 = new Box("바나나",100);
		Box b2 = new Box(500,100);
		Box b3 = new Box(new Money(300),100);
		
		String s1 = (String)b1.kind;
		int s2 = (Integer)b2.kind;
		Money m = (Money)b3.kind;
		//String m1 = (String)b3.kind;
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(m);
	}

}
