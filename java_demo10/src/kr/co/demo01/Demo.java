package kr.co.demo01;

import java.io.File;
import java.io.IOException;

public class Demo {

	public static void main(String[] args) {
		/*
		 * 입출력
		 * 		- 컴퓨터 내부/외부 장치간에 데이터를 교환하기 위해 사용
		 * 		- 프로그램을 기준으로 내부/외부 장치에서 데이터가 현재 동작하는
		 * 		  프로그램으로 들어오면 입력, 반대로 현재 동작하는 프로그램에서
		 * 		  내부/외부 장치로 내보내면 출력 이라고 한다.
		 * 		  (하드디스크의 파일을 프로그램 내에서 사용할 수 있도록 불러올 때는 입력
		 * 		  반대로 프로그램에서 생성한 데이터 하드디스크의 파일로 내보낼 때에는 출력)
		 * 		- 입출력은 입력스트림, 출력스트림이 개별로 존재하며 입력스트림으로는 입력만
		 * 		  출력스트림으로는 출력만 수행할 수 있다.
		 * 
		 * 스트림(Stream)
		 * 		- 두 장치간에 데이터를 교환하기 위해 생성한 데이터 통로
		 * 		- 스트림은 입력/출력 스트림으로 나누어져 있고 또한 그 안에서 바이트기반스트림과
		 * 		  문자기반스트림으로 나누어져 있다.
		 * 		- 바이트기반스트림의 경우 이미지, 영상, 실행파일 등의 바이트기반으로 생성된 데이터를
		 * 		  입출력할 때 사용한다.
		 * 		- 문자기반스트림의 경우 텍스트 문서 등의 문자기반으로 생성된 데이터를 입출력할 때
		 * 		  사용한다.
		 */
		
		File f = new File("D:\\temp");
//		/Users/jonginhan/untitled folder
		if(!f.exists()) {
			f.mkdir();
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
