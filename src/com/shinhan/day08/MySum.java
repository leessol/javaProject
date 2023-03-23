package com.shinhan.day08;

import java.util.Objects;

public class MySum {
    int first;
    int second;
    
    MySum (int first, int second){
        this.first = first;
        this.second = second;
    }

    //조건1: Object의 toString 은 주소를 문자로 return
	@Override
	public String toString() {
		//return "MySum [first=" + first + ", second=" + second + "]" + (first+second);
		return String.valueOf(first+second);
	}

//	//조건2: Object의 equals는 주소비교
//	@Override
//	public boolean equals(Object obj) {
//		// TODO Auto-generated method stub
//		if(!(obj instanceof MySum)) return false; //string이면 오류남 그래서 mysum 타입 아니면 바로 return 한다. 
//		MySum my = (MySum) obj;
//		//return first+second == (my.first+my.second); 방법 1
//		return toString().equals(my.toString()); //방법 2
//	 	return this.equals(my); //무한 루프 : 자기 자신이 계속 자기를 호출
//		
//	}
//   
	
	@Override
	public int hashCode() {
		return Objects.hash(first, second);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MySum other = (MySum) obj;
		return first + second == other.first+ other.second;
	}

 
	
    

}
