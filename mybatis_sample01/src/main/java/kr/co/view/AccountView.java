package kr.co.view;

import java.util.List;

import kr.co.vo.AccountVO;

public class AccountView {

	public void show(List<AccountVO> data) {
		for(AccountVO vo: data) {
			System.out.println(vo);
		}
	}

	public void show(boolean result) {
		if(result) {
			System.out.println("데이터가 데이터베이스에 반영되었습니다.");
		} else {
			System.out.println("데이터가 데이터베이스에 반영되지 않았습니다.");
		}
	}

	public void message(String msg) {
		System.out.println(msg);
	}

}
