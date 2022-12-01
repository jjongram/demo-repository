package kr.co.controller;

import java.util.ArrayList;

import kr.co.dao.JobDAO;
import kr.co.view.JobView;
import kr.co.vo.JobVO;

public class JobController {

	private JobDAO jobDao = new JobDAO();
	private JobView view = new JobView();
	
	public void getAll() {
		ArrayList<JobVO> datas = jobDao.selectAll();
		view.print(datas);
	}

}
