package com.biz.cbt.dao;

import java.util.List;

import com.biz.cbt.persistence.CbtDetailDTO;
import com.biz.cbt.persistence.CbtQuizDTO;
import com.biz.cbt.persistence.QuizVO;

public interface QuizDao {

	public List<QuizVO> selectAll();
	
	public CbtQuizDTO findById(String cb_seq);
	
	public int insertQuiz(CbtQuizDTO cbtQuizDTO);
	public int insertDetail(CbtDetailDTO cbtDetailDTO);
	
	public int updateQuiz(CbtQuizDTO cbtQuizDTO);
	public int updateDetail(CbtDetailDTO cbtDetailDTO);
	
	public int deleteQuiz(String cb_seq);
	public int deleteDetail(String d_cd_seq);
	
}