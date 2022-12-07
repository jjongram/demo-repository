package kr.co.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.co.main.OracleConnection;
import kr.co.vo.AccountVO;

public class AccountDAO {
	
	private SqlSession sess = OracleConnection.getSqlSession();

	public List<AccountVO> selectAccountRequest() {
		List<AccountVO> resultSet = sess.selectList("test.reqAccount");
		return resultSet;
	}

	public boolean insertAccountRequest(AccountVO vo) {
		int result = sess.insert("test.insertReqAccount", vo);
		if(result == 1) {
			sess.commit();
			return true;
		} else {
			sess.rollback();
			return false;
		}
	}

	public boolean duplicationCheck(AccountVO vo) {
		int result = sess.selectOne("test.dupReqAccountNickname", vo);
		if(result == 1) {
			return true; 
		}
		
		result = sess.selectOne("test.dupReqAccountEmail", vo);
		if(result == 1) {
			return true;
		}
		return false;
	}

}
