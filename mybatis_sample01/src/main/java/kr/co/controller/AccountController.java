package kr.co.controller;

import java.util.List;

import kr.co.dao.AccountDAO;
import kr.co.view.AccountView;
import kr.co.vo.AccountVO;

public class AccountController {

	public void getAccountRequestList() {
		AccountDAO dao = new AccountDAO();
		AccountView view = new AccountView();
		
		List<AccountVO> data = dao.selectAccountRequest();
		view.show(data);
	}

	public void setAccountRequest(String nickname, String email) {
		AccountDAO dao = new AccountDAO();
		
		AccountVO vo = new AccountVO();
		vo.setNickname(nickname);
		vo.setEmail(email);
		
		AccountView view = new AccountView();
		boolean isDuplication = dao.duplicationCheck(vo);
		if(isDuplication) {
			view.message("닉네임 또는 이메일이 중복되었습니다. 다시 입력하세요.");
		} else {
			boolean result = dao.insertAccountRequest(vo);
			view.show(result);
		}
	}

	public void getAccountList() {
		AccountDAO dao = new AccountDAO();
		AccountView view = new AccountView();
	}

}
