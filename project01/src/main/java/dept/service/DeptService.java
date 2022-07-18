package dept.service;

import java.util.List;

import dept.model.DeptDAO;
import dept.model.DeptDTO;

public class DeptService {
	
	//dao사용해서 전체 부서 조회
	private DeptDAO dao;
	
	public DeptService() {
		dao = new DeptDAO();   // DAO객체 생성해서 기본 생성자~
	}
	public List<DeptDTO> getAll() { //한 개의 부서 정보가 list에 들어가야 함. dto
		List<DeptDTO> datas = dao.searchAll();
		return null;  //collection사용하여 여러개의 결과를 받자 List<>
	}
}
