package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex03 {
	
	public static void main(String[] args) throws IOException {
		
		InputStream in = new FileInputStream("C:\\javastudy\\file\\MS949.txt");
		InputStreamReader isr = new InputStreamReader(in, "MS949");  //여기에 UTF-8 넣으면 깨짐
		BufferedReader br = new BufferedReader(isr);
		
		String line="";
		
		while(true) {
			line = br.readLine();	
			if(line == null) {
				break;
			}
			System.out.println(line);
			
		}
		
		br.close();
		
		
	}

}