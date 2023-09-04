package com.daeatdak.admin.dao;



import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.daeatdak.admin.dto.AdminDTO;
import com.daeatdak.admin.vo.GoodsInfoListVO;
import com.mybatis.config.MyBatisConfig;

public class AdminDAO  {

	private SqlSession sqlSession;
	
	public AdminDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public void goodsRegist(AdminDTO adminDTO) {
		sqlSession.insert("admin.GoodsRegist", adminDTO);
	}
	public int getSequence() {
		return sqlSession.selectOne("admin.getSequence");
	}
	
	public List<GoodsInfoListVO> goodsInfoList() {
		
		return sqlSession.selectList("admin.GoodsInfoList");
		
	}
	
	
	  public void goodsDelete(int goodsNum) {
	  sqlSession.delete("admin.goodsListDelete", goodsNum); 
	  
	  }
	  
		
		  public void goodsInfoRegist(int goodsNum) { 
			   sqlSession.selectList("admin.GoodsRegistInfo", goodsNum); }
//		  
//		  public void goodsInfoUpdate(AdminDTO adminDTO) {
//		  sqlSession.update("admin.goodsInfoUpdate", adminDTO); }
//		 
}
