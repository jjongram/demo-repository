package kr.co.exam03;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exam {

	public static void main(String[] args) {
		/*
		 * subject.list 파일에 작성된 과목명을 이용하여 subjects[] 을
		 * 생성하도록 하는 코드를 작성한다.
		 * 
		 * subject.list 파일에는 다음과 같은 형식으로 과목명이 나열되어 있다.
		 * 
		 * subject.list 파일
		 * 		국어,영어,수학,과학,사회,체육,미술
		 */
		
		StringBuilder datas = new StringBuilder();
		File f = new File("/Users/jonginhan/Desktop/KH정보교육원/subject2.list");
		
		try(FileReader fr = new FileReader(f)){
			char[] buffer = new char[8];
			
			while(true) {
				int count = fr.read(buffer);
				if(count == -1) {
					break;
				}
				datas.append(buffer, 0, count);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String strArr[] = datas.toString().split(",");
		Subject subjects[] = new Subject[strArr.length];
		
		for(int i = 0; i < strArr.length; i++) {
			String data[] = strArr[i].split(":");
			Subject s = new Subject(data[0], Double.parseDouble(data[1]));
			s.setScore(s.getScore()-5);
			subjects[i] = s;
		}
		
		datas = new StringBuilder();
		for(int i = 0; i < subjects.length; i++) {
			datas.append(subjects[i].getName() + ":" + subjects[i].getScore() + ",");
		}
		try(FileWriter fw = new FileWriter(f)) {
			fw.write(datas.toString(), 0, datas.toString().length() -1);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		System.out.println(Arrays.toString(subjects));
	}

}
