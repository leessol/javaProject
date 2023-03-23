package com.shinhan.day12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCalculator {
	
	public static void main(String[] args)  {
		try {
			new FileCalculator().addCalculateResult("data.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	void addCalculateResult(String inputFileName) throws IOException {
		FileReader fr = new FileReader(inputFileName); // stream이니깐 Stream으로 해야 한다.
		// 실패: DataOutputStream으로 저장 후 DataInputStream가능. 
		//DataInputStream dpw = new DataInputStream(fw); // 실패: 
		BufferedReader br = new BufferedReader(fr);
		String s;
		int sum=0, mul=1;
		while((s = br.readLine())!=null) {
			System.out.println(s);
			sum += Integer.parseInt(s);
			mul *= Integer.parseInt(s);
		}
		
		System.out.println(sum + "====" + mul);

		br.close();
		fr.close();
		
		
		//파일 출력 목적으로 열기 
		FileWriter fw = new FileWriter(inputFileName,true); //파일 끝에 결과값을 넣어야 하니깐 append 하면 끝에 들어가게 된다. 
		BufferedWriter bw = new BufferedWriter(fw);
		bw.newLine();
		bw.write(sum+"");
		bw.newLine();
		bw.write(mul+"");
		
		
		bw.close();
		fw.close();
	}
}















