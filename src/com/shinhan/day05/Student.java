package com.shinhan.day05;


// 접근권한: public, protected, 생략, private 중에서 하나만 선택 
// 활용방법: static, final 여러개 선택 가능
public class Student {
	//1.field (data를 저장하기 위한 변수들의 정의): instance 변수, static  변수
	private String stdId; // private: Student class 내에서만 접근 가능
	public String name; // public: 모든 package에서 접근 가능. 
	String major; // 생략: 같은 패키지 내에서만 접근 가능. 
	protected int score; // protected: 같은 package 에서 접근 가능, 다른 package이면 자식은 접근 가능. 
	public final String schoolName = "신한금융대학";; //final: 초기화가 1회 (선언 시, 생성 시) 
	static final String nation="대한민국"; //static final: 상수, class변수,  초기화가 1회(선언 시) 클래스 변수라서 생성과는 무관
	static int count; //class변수 
	
	
	//생성자 rule: super()와 this()는 항상 맨 윗줄에서 사용해야 한다. 
	//생성자 1
	public Student(String stdId, String name) {
		//default 생성자는 컴파일 시에 자동으로 .class에 추가된다. 
		//다만, 재정의 하면 생성 안됨.
		this(stdId,name,null,0); 
	}
	
	//생성자 2
	public Student (String stdId, String name, String major) {
		this(stdId, name, major, 0);
	}
	
	// 생성자 3
	public Student(String stdId, String name, String major, int score) {
		super(); //super는 딱한번만 클래스 내 모든 생성자들 중에서 딱 한번만 부른다. 
		this.stdId = stdId;
		this.name = name;
		this.major = major;
		this.score = score;
		count ++;
	}

	
	//GETTER / SETTER
	//외우자: getter / setter는 접근이 제한된 상황에서 값을 수정하고 가져오기 위해서 사용하는 것이다. 가독성의 이유라기보다는
	//예를 들면, private같은 접근 제한자가 붙었을 경우
	public String getStdId() {
		return stdId;
	}

	public void setStdId(String stdId) {
		this.stdId = stdId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Student.count = count;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public static String getNation() {
		return nation;
	}

	@Override
	public String toString() {
		return "Student 정보 [stdId=" + stdId + ", name=" + name + ", major=" + major + ", score=" + score + ", schoolName="
				+ schoolName + "]";
	}
	
	
	
}
