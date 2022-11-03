package kr.co.exam02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

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
		
		File f = new File("/Users/jonginhan/Desktop/KH정보교육원/subject.list");
		try(FileReader fr = new FileReader(f)) {
			StringBuilder datas = new StringBuilder();
			char[] buffer = new char[8];
			
			while(true) {
				int count = fr.read(buffer);
				if(count == -1) {
					break;
				}
				datas.append(buffer, 0, count);
			}
			
			String strArr[] = datas.toString().split(",");
			Subject subjects[] = new Subject[strArr.length];
			
			for(int i = 0; i < strArr.length; i++) {
				Subject s = new Subject(strArr[i]);
				subjects[i] = s;
			}
			
			System.out.println(Arrays.toString(subjects));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
