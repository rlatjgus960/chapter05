package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonApp {

	public static void main(String[] args) throws IOException {
		// 최종은 리스트로 출력
		// 안되면 한줄 읽어서 바로 출력..
		Scanner sc = new Scanner(System.in);
		Reader read = new FileReader("C:\\javaStudy\\file\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(read);

		List<Person> friend = new ArrayList<Person>();

		String fr = ""; // 이거 왜? --> 밖에서 쓸수도있어서
		while (true) {
			// 이렇게 바로 쓰면 안되나? String fr = br.readLine();
			fr = br.readLine();

			if (fr == null) {
				break;
			}

			// List<String> sList = new ArrayList<String>();

			// sList = Arrays.asList(fr.split(","));
			String[] pInfo = fr.split(","); // list로 받으면 안되는지? --> 굳이 복잡하게 안해도 된다 ㅋ
			/*
			 * p.setName(sList.get(0)); 
			 * p.setHp(sList.get(1)); 
			 * p.setCompany(sList.get(2));
			 */
			Person p = new Person(pInfo[0], pInfo[1], pInfo[2]); // 한번에쓰기
			// p.setName(pInfo[0]);
			// p.setHp(pInfo[1]);
			// p.setCompany(pInfo[2]);
			friend.add(p);

		}

		String myInfo = sc.nextLine();
		String[] pInfo = myInfo.split(",");
		Person p = new Person(pInfo[0], pInfo[1], pInfo[2]);
		friend.add(p);

		for (Person f : friend) {
			System.out.println("이름: " + f.getName());
			System.out.println("핸드폰: " + f.getHp());
			System.out.println("회사: " + f.getCompany());
			System.out.println("");
		}
		
		// 파일저장
		Writer wr = new FileWriter("C:\\javaStudy\\file\\PhoneDB_add.txt");
		BufferedWriter bw = new BufferedWriter(wr);

		for (Person s : friend) {

			bw.write(s.getName() + "," + s.getHp() + "," + s.getCompany());
			bw.newLine();
		}

		

		br.close();
		bw.close();
		sc.close();

	}

}
