package com.shinhan.day11;

import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.shinhan.day05.Account;

public class StreamTest3 {

	public static void main(String[] args) throws IOException, URISyntaxException {
		f13();
	}

	

	private static void f13() {
		List<Student2> data = new ArrayList<>();
		data.add(new Student2("김길동",95,"남"));
		data.add(new Student2("이길동",85,"남"));
		data.add(new Student2("김길순",100,"여"));
		data.add(new Student2("김아라",90,"여"));
		data.add(new Student2("박길동",100,"남"));
		
		//collect: group으로 집계를 하고 다시 group이 collection으로 만든다. 
		Map<String,Double> map = data.stream().collect(
				Collectors.groupingBy(row->row.getGender(), //gender로 그룹으로 --> String (arg1)
				Collectors.averagingDouble(row->row.getScore()) //	평균을 집계하겠다. --> Double (arg2)
				)  
		);
		System.out.println(map);
		
	}



	private static void f12() {
		int [] arr = {1,2,3,4,5};
		
		boolean result1 = Arrays.stream(arr).allMatch(num->num%2==0);
		System.out.println(result1);
		
		result1 = Arrays.stream(arr).anyMatch(num->num%2==0);
		System.out.println(result1);
		
		//모든 요소가 만족하지 않는가?
		result1 = Arrays.stream(arr).noneMatch(num->num%2==0);
		System.out.println(result1);
		
		double avg = Arrays.stream(arr)
				.filter(num->num%2==0)
				.average()
				.orElse(0);//값이 없으면 0을 avg에 넣어라 
				
		System.out.println(avg);
		
	}

	private static void f11() {
		List<Student> data = new ArrayList<>();
		data.add(new Student("김1",100));
		data.add(new Student("김2",80));
		data.add(new Student("홍5",50));
		data.add(new Student("박3",90));
		data.add(new Student("김4",30));
		
		
		data.stream().sorted().forEach(row -> System.out.println(row));
		//data.sort();
		System.out.println("---------------------------");
		data.stream().sorted((a,b)->a.getName().compareTo(b.getName()))
			.forEach(row->System.out.println(row));
	}

	private static void f10() {
		Integer [] arr = {100,88,99,50,60};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr,(a,b)->b-a);		System.out.println(Arrays.toString(arr));
		
		Student[] arr2 = {
				new Student("김", 90),
				new Student("이", 77),
				new Student("박", 70),
				new Student("홍", 80),
				new Student("김", 88),
				new Student("양", 100),
		};
		//Stream 사용 안함 
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		
		Arrays.sort(arr2, (a,b)->a.getName().compareTo(b.getName()));
		System.out.println(Arrays.toString(arr2));
	}

	private static void f9() {
		List<String> data = new ArrayList<>();
		data.add("This is Java");
		data.add("I am a best developer");
		//String[] arr = data.get(0).split(" ");
		//Arrays.stream(arr);
		data.stream().flatMap(row->Arrays.stream(row.split(" "))) //배열을 다시 stream으로 만듦
				.forEach(word -> System.out.println(word));
		
		System.out.println("-------------------------");
		
		//위의 것이랑 결과가 같음
		for(String row:data) {
			String[]arr =row.split(" ");
			for(String s :arr) {
				System.out.println(s);
			}
		}
	}
	

	private static void f8() {
		int [] arr = {10,20,70,90};
		//asDoubleStream
		Arrays.stream(arr).asDoubleStream().forEach(row -> System.out.println(row)); //double로 변경
		//boxed
		Arrays.stream(arr).boxed().forEach(row->System.out.println(row.floatValue()));
		
		
		
	}

	private static void f7() {
		List<Student> data = new ArrayList<>();
		data.add(new Student("김1",100));
		data.add(new Student("김2",80));
		data.add(new Student("홍5",50));
		data.add(new Student("박3",90));
		data.add(new Student("김4",30));
		
		//점수가 70이상인 학생만 추출
		data.stream() //오리지널 스트림1
		.distinct() //중복제거해라 // 스트림2
		.filter(row->row.getScore()>70) //다시 필터링을 한다. 4로 끝나는 ()안에 들어갈 내용을 predicate 참이어야지 나옴 //스트림3
		.forEach(row->{ 
			System.out.println(row);
		});
		
		System.out.println("-----------------");
		//이름이 김씨인 사람만 추출
		data.stream() //오리지널 스트림1
		.filter(row->row.getName().startsWith("김")) //다시 필터링을 한다. 김으로 시작하는 ()안에 들어갈 내용을 predicate 참이어야지 나옴 //스트림3
		.forEach(row->{ 
			System.out.println(row);
		});
		
		
		System.out.println("--------이름이 김씨인 사람만 추출 점수 평균---------");
		//이름이 김씨인 사람만 추출하고 그사람들의 평균 점수
		data.stream() //오리지널 스트림1
		.filter(row->row.getName().startsWith("김")) //중간처리
		.mapToInt(row2->row2.getScore()) //중간처리
		.average() //최종처리
		.ifPresent(row3->System.out.println("평균: " + row3));
		
		
	}

	private static void f6() {
		List<String> data = new ArrayList<>();
		data.add("홍길동1");
		data.add("홍길동3");
		data.add("홍길동4");
		data.add("홍길동8");
		data.add("홍길동6");
		data.add("홍길동24");
		data.add("홍길동2");
		data.add("홍길동5");
		
		data.stream()
			.distinct() //중복제거해라
			.filter(row->row.endsWith("4")) //다시 필터링을 한다. 4로 끝나는 ()안에 들어갈 내용을 predicate 참이어야지 나옴
			.forEach(row->{
				System.out.println(row);
			});
		

	}

	private static void f5() throws URISyntaxException, IOException {
		Path path = Paths.get(StreamTest3.class.getResource("data.txt").toURI());
		System.out.println(path); //
		Stream<String> streamData= Files.lines(path, Charset.defaultCharset());//files에 있는 내용을 한 줄씩 .Lines 사용
		streamData.forEach(line -> {
			System.out.println(line);
		});
	}

	private static void f4() throws IOException {
		//파일을 찾아서 열어라 -->FileInputStream 한바이트씩 읽음 (한글은 2바이트라 깨진다)
//		FileInputStream fi = new FileInputStream("src/com/shinhan/day11/data.txt"); 
		FileReader fi = new FileReader("src/com/shinhan/day11/data.txt");  //FileReader: 2바이트씩 읽어서 한글 안깨짐
		int i;
		while((i=fi.read())!=-1) {
			System.out.println((char)i);
		}
	}

	private static void f3() {
		//내부 반복자(더 효율적)
		//1~9까지 : range
		//1~10까지 : rangeClosed
		IntStream.rangeClosed(1, 10).forEach(num->{
			System.out.println(num);
		});
		
		//외부 반복자
		for(int i = 1;i<=10;i++) {
			System.out.println("일반 for문: " + i);
		}
		
	}

	private static void f2() {
		List<Account> data = new LinkedList<>();
		data.add(new Account("123", "hong1", 1000));
		data.add(new Account("222", "hong5", 2000));
		data.add(new Account("333", "hong2", 3000));
		data.add(new Account("444", "hong3", 4000));
		data.add(new Account("555", "hong4", 5000));
		
		//모든계좌의 잔고의 합을 출력하기
		//stream 없이--> 외부 반복자 이용 (속도가 더 느리다. )
		int total = 0;
		for(Account acc:data) {
			total += acc.getBalance();
		}
		//Stream 이용--> 내부 반복자 이용 (속도 더 빠르고 병렬로 처리 가능하다. )
//		data.stream().forEach((st)->{
//			System.out.println(st.getBalance());
//		});
		long result = data.stream().mapToLong(acc->acc.getBalance()).sum(); //잔고가 long타입
		System.out.println("Account balance 합계: "+result);
		//						중간처리				최종처리
		data.stream().map(acc -> acc.getOwner()).count();
		System.out.println("건수는: " + result);
		
		data.stream().map(acc->acc.getOwner())
		.forEach(owner->System.out.println(owner + "예금주님"));
	}

	private static void f1() {
		//여러건 저장하기: 배열, Collection(List, Set, Map)
		List<Student> data = new ArrayList<>();
		data.add(new Student("김1",100));
		data.add(new Student("김2",80));
		data.add(new Student("김5",50));
		data.add(new Student("김3",90));
		data.add(new Student("김4",30));
		
		//data가 흘러가게 하고 싶음 -> data를 stream으로 만들어서 중간처리, 최종처리를 하고 싶음. 
		data.stream().forEach((st)->{
			System.out.println(st.getName() + "==>" + st.getScore());
		});
		
		System.out.println("===========중간처리 test==========");
		data.stream()
			.mapToInt(st->st.getScore())
			.forEach(score->{
				System.out.println(score);
				System.out.println("-----------------");
			}); //점수만 뺀것. -> 중간처리 한것
		
		System.out.println("===========최종처리 test==========");
		double d = data.stream()
			.mapToInt(st->st.getScore())
			.average()
			.getAsDouble(); //데이터 없으면 오류남
		System.out.println("average = " + d);
		
		System.out.println("===========Optional test==========");
		OptionalDouble option = data.stream()
			.mapToInt(st->st.getScore())
			.average();
		//consumer이다 ifPresent (받아서 쓰기만 하면됨)
		option.ifPresent(result -> System.out.println(result));
		
		System.out.println("===========Optional test2==========");
		data.stream()
			.mapToInt(st->st.getScore())
			.average()
			.ifPresent(result -> System.out.println(result));
		
		
		System.out.println("===========Optional test3==========");
		data.stream()
			.mapToInt(st->st.getScore())
			.average()
			.ifPresentOrElse(d1->{System.out.println(d1);}, ()->{System.out.println("평균을 구할 수 없다. ");});
		
		
		
	}
}
