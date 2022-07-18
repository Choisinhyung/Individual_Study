package dept.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import conn.db.DBConn;

public class DeptDAO {
	// mybatis connection을 이용하여 실질적인 조회 수행
	SqlSession session = null;
	
	public DeptDAO() {
		session = DBConn.getSqlSession();
	}
	
	
	public List<DeptDTO> searchAll() { // 검색하면 목록~ collection
		List<DeptDTO> datas = session.selectList("deptMapper.deptSelectAll");
		System.out.println("DeptDAO.searchAll" + datas);
		return null;
	}
}
