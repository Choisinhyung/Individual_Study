package conn.db;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DBConn {
	
	public static SqlSession getSqlSession() {
		SqlSession sess = null;
		
		//config.xml파일 경로 설정
		String config = "resources/mybatis-config.xml";
		try {
			//session factory builder
			InputStream is = Resources.getResourceAsStream(config);
			SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(is, "development");
			//ssf를 사용해서 sqlSession openSession생성
			sess = ssf.openSession(true); // 자동커밋
		} catch (IOException e) {

			e.printStackTrace();
		}
		return sess;
	}
}