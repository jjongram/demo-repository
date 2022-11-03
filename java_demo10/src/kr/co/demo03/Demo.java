package kr.co.demo03;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo {

	public static void main(String[] args) {
		/*
		 * FileReader
		 * 		- 문자기반입력스트림으로 문자 단위로 파일을 읽는다.
		 */
		File f = new File("");
		
		try(FileReader fr = new FileReader(f)){
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
