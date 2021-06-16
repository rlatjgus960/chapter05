package com.javaex.ex01;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex03 {

	public static void main(String[] args) throws IOException {
		InputStream in = new FileInputStream("C:\\javastudy\\file\\img.jpg");
		BufferedInputStream bin = new BufferedInputStream(in);
		OutputStream bout = new FileOutputStream("C:\\javastudy\\file\\bufferedImg.jpg");
				
		int data;
		
		while(true) {
			data = bin.read();
			if(data==-1) {
				break;
			}
			bout.write(data);
			
			
		}
		bout.close();
		bin.close();
	}

}
