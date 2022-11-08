package kr.co.self;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class test {

	public static void main(String[] args) {
		
		FileWriter fw = null;
		try {
			fw = new FileWriter("/Users/jonginhan/Desktop/KH정보교육원/test.txt");
			fw.write(97);
			fw.write(65);
			fw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
