package kr.co.controller;

import java.util.ArrayList;

import kr.co.dao.DepartmentDAO;
import kr.co.view.DepartmentView;
import kr.co.vo.DepartmentVO;

public class DepartmentController {

	private DepartmentDAO deptDao = new DepartmentDAO();
	private DepartmentView view = new DepartmentView();
	
	public void getAll() {
		ArrayList<DepartmentVO> datas = deptDao.selectAll();
		view.print(datas);
	}

}
