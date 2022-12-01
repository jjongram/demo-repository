package kr.co.demo02.server;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	
	public static void main(String[] args) {

		/*
		 * TCP 서버
		 * 		1. 통신을 위한 Port 지정
		 * 		2. 지정한 Port로 서버소켓 객체 생성
		 * 		3. 서버소켓으로 들어오는 연결 요청 대기 후 승낙
		 * 		4. 연결 승낙 후 클라이언트와의 연결 소켓 생성
		 * 		5. 입출력스트림 생성
		 * 		6. 입출력스트림으로 통신 진행
		 */
		
		int port = 51000;
		
		ServerSocket serverSocket;
		try {
			serverSocket = new ServerSocket(port);
			
			Socket sock = serverSocket.accept();
			
			BufferedInputStream bis = new BufferedInputStream(sock.getInputStream());
			BufferedOutputStream bos = new BufferedOutputStream(sock.getOutputStream());
			
			while(true) {
				byte[] recv = new byte[4096];
				while(true) {
					int len = bis.read(recv);
					if(len == -1) {
						break;
					}
					System.out.println(new String(recv, 0, len));
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
