package com.shinhan.day12;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Date;

import com.shinhan.day05.Account;

public class IOTest {

	public static void main(String[] args) throws IOException, URISyntaxException, ClassNotFoundException {
		f11();
	}

	private static void f11() {
		String path = "src/com/shinhan/day12/scoredata.txt";
		File f = new File(path);
		
		System.out.println(f.exists());
		System.out.println(f.lastModified());
		Date d = new Date(f.lastModified());
		System.out.println(d);
		System.out.println("파일사이즈: " + f.length());
		System.out.println("디렉토리냐? --> " + f.isDirectory());
		
	}

	private static void f10() throws IOException, ClassNotFoundException {
		// output
		FileOutputStream fw = new FileOutputStream("serialize.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fw);

		oos.writeObject(new Account("1234", "김1")); // object를 넣을 수 있다.
		oos.writeObject(new Account("2222", "김2")); // object를 넣을 수 있다.
		oos.writeObject(new Account("3333", "김3")); // object를 넣을 수 있다.

		// Input
		FileInputStream fi = new FileInputStream("serialize.dat");
		ObjectInputStream ois = new ObjectInputStream(fi);
		Student s1 = (Student) ois.readObject(); // 형변환 필요함.

		System.out.println(fi);
		System.out.println(ois);
		System.out.println(s1);

		oos.close();
		fw.close();

	}

	private static void f9() throws IOException, ClassNotFoundException {
		// output
		FileOutputStream fw = new FileOutputStream("serialize.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fw);

		oos.writeObject(new Student("김", 100, 99)); // object를 넣을 수 있다.
		oos.writeObject(new Student("이", 100, 99)); // object를 넣을 수 있다.
		oos.writeObject(new Student("최", 100, 99)); // object를 넣을 수 있다.

		// Input
		FileInputStream fi = new FileInputStream("serialize.dat");
		ObjectInputStream ois = new ObjectInputStream(fi);
		Student s1 = (Student) ois.readObject(); // 형변환 필요함.

		System.out.println(fi);
		System.out.println(ois);
		System.out.println(s1);

		oos.close();
		fw.close();

	}

	private static void f8() throws IOException {
		FileWriter fw = new FileWriter("print.txt");
		PrintWriter pw = new PrintWriter(fw);

		pw.print(false);
		pw.print("false");
		pw.write(10);
		pw.write("true");

		pw.close();
		fw.close();

	}

	// 18.8 기본 타입 스트립: p.805
	private static void f7() throws IOException {
		OutputStream fw = new FileOutputStream("primitiveData.txt"); // stream이니깐 Stream으로 해야 한다.
		// 자바의 기본타입을 저장하고 그대로 읽고자 한다. DataInputStream 장착
		DataOutputStream dpw = new DataOutputStream(fw); // fw를 끼운다.
		dpw.writeInt(1234);
		dpw.writeInt(200);
		dpw.writeDouble(3.14);
		dpw.writeChar('A');
		dpw.close();
		fw.close();

		FileInputStream fr = new FileInputStream("primitiveData.txt"); // 얘도 스트림으로 바꾸어야 한다.
		DataInputStream dis = new DataInputStream(fr);
		int a = dis.readInt();
		int b = dis.readInt();
		double c = dis.readDouble();
		char d = dis.readChar();
		System.out.println(a + 1);
		System.out.println(b - 1);
		System.out.println(c + 1);
		System.out.println(Character.toLowerCase(d));

		dis.close();
		fr.close();
	}

	private static void f6() throws IOException {
		Path path = Paths.get("src/com/shinhan/day12/scoredata.txt");
		// 내부 반복자 이용
		Files.lines(path).forEach(row -> {
			System.out.print(row.replaceAll("/", "\t"));
			String[] arr = row.split("/");
			int total = 0;
			for (int i = 0; i < arr.length; i++) {
				try {
					total += Integer.parseInt(arr[i]); // 숫자가 아니면 하지말고 그냥 계속 진행해~ (예외처리)
				} catch (NumberFormatException e) {

				}

			}

			System.out.println("\t" + total + "\t" + (total / (arr.length - 1)));
		});

	}

	private static void f5() throws IOException {
		String path = "src/com/shinhan/day12/scoredata.txt";
		FileReader fr = new FileReader(path);
		BufferedReader br = new BufferedReader(fr);

		String row;
		String title = br.readLine(); // 타이틀이니깐 따로 분리
		System.out.println(title.replaceAll("/", "\t") + "\t총점\t평균");
		while ((row = br.readLine()) != null) {
			System.out.print(row.replaceAll("/", "\t")); // 한줄 씩 이렇어와야 한다. --> bufferedReader 이용
			String[] arr = row.split("/");
			int total = 0;
			for (int i = 1; i < arr.length; i++) {
				total += Integer.parseInt(arr[i]);
			}
			System.out.println("\t" + total + "\t" + (total / (arr.length - 1)));
		}
		br.close();
		fr.close();

	}

	private static void f4() throws URISyntaxException {
		// 1.class기준
		// Path path = Paths.get(StreamTest3.class.getResource("data.txt").toURI());
		// 2.절대경로 /로 시작한다.
		// Path path =
		// Paths.get(StreamTest3.class.getResource("/com/shinhan/day11/data.txt").toURI());
		// 3.상대경로는 현재위치를 기준으로한다.
		// 다음은 현재의 절대경로를 얻는다.
//		Path path = Paths.get(IOTest.class.getResource("Example.class").toURI()); //1)
//		System.out.println(path);

//		Path path = Paths.get(""); //1)
//		System.out.println(path.toAbsolutePath());

		String path = System.getProperty("user.dir");
		System.out.println(path);
		// String absolute = System.getProperty("user.dir")+"/data.txt";//2)
		// Path path = Paths.get(absolute);
//		String s = path.toAbsolutePath().toString();
//		path =Paths.get(s+"/data.txt");
//		System.out.println("현재 작업 경로: " + s);
//		System.out.println(Charset.defaultCharset());

	}

	private static void f3() throws IOException {
		// 상대경로
		String path = "src/com/shinhan/day12/Student.java"; // 현재가 javaProjet이다.
		FileReader fr = new FileReader(path); // 열어라
		FileWriter fw = new FileWriter("Student.java"); // 저장해라
		int i;

		while ((i = fr.read()) != -1) {
			System.out.print((char) i);
			fw.write(i);
		}
		;

		fw.close(); // 쓰려고 만든거라 어떤걸 먼저 닫아도 상관없음.
		fr.close();

	}

	private static void f2() throws IOException {
		// FileInputStream fi = new FileInputStream("data.txt");
		String path = System.getProperty("user.dir"); // 절대경로 (맨앞에 /가 있음)
		path += "/src/com/shinhan/day11/data.txt";
		FileInputStream fi = new FileInputStream(path);
		InputStreamReader ir = new InputStreamReader(fi); // 보조스트림: 1)stream을 Reader로 바꾸어준다.

		int i;
		while ((i = ir.read()) != -1) { // -1은 EOF(End of File)
			System.out.print((char) i);
		}

		System.out.println(path);
		System.out.println("f2 end");

		ir.close(); // ir먼저 닫아줘야 한다. fileInputStream이 먼저 있었으니깐
		fi.close();

	}

	private static void f1() throws IOException {
		// InputStream(1byte), OutputStream(1byte), Reader(2byte), Writer(2byte)
		// FileInputStream, FileOutputStream / FileReader, FileWriter--> 파일에서 입출력하는것
		InputStream is = System.in; // 표준입력: 키보드이다. 변경가능
		// System.set --> 다른것으로 변경가능하다.
		byte[] arr = new byte[100]; // 한번에 입력받고 싶다.
		int i = is.read(arr); // 값이 들어있는 길이가 i에 담긴다. 마지막에 13(엔터) / 10(다음줄)
		System.out.println(i);
		System.out.println(Arrays.toString(arr));
		for (int j = 0; j < i - 2; j++) {
			System.out.println((char) arr[j]);
		}
	}

}
