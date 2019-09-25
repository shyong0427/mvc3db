package kr.co.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class SangpumModel { // DB 처리, 비즈니스 로직 처리
	// 모델 영역의 클래스로, 컨트롤러 영역의 클래스와 연결
	private static SangpumModel model = new SangpumModel();
	
	public static SangpumModel instance() {
		return model;
	}
	
	private SqlSessionFactory factory = SqlMapConfig.getSqlSession();
	
	public List<ProductBean> selectDataAll() {
		List<ProductBean> list = null;
		
		SqlSession Sqlsession = factory.openSession();
		list = Sqlsession.selectList("selectDataAll");
		Sqlsession.close();
		
		return list;
	}
}