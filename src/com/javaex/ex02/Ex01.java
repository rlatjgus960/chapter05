package com.javaex.ex02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex01 {

	public static void main(String[] args) throws IOException {

		Writer fw = new FileWriter("C:\\javastudy\\file\\song.txt");

		BufferedWriter bw = new BufferedWriter(fw);

		bw.write("학교종이 땡땡땡"); // \n 이 줄바꿈 기호 운영체제마다 조금씩 다름
		bw.newLine(); // 여기저기서 알아서 줄바꿈해주는 메소드
		bw.write("어서모이자");
		bw.newLine();
		bw.write("선생님이 우리를");
		bw.newLine();
		bw.write("기다리신다");

		bw.close();

		/*
		Writer fw = new FileWriter("C:\\javastudy\\file\\song.txt");
		String str = "학교종이 땡땡땡 어서 모이자 선생님이 우리를 기다리신다";
		fw.write(str);
		fw.close();
		*/
	}

}
