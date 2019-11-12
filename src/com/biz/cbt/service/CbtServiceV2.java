package com.biz.cbt.service;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.biz.cbt.config.DBConnection;
import com.biz.cbt.dao.QuizDao;
import com.biz.cbt.persistence.CbtDetailDTO;
import com.biz.cbt.persistence.CbtQuizDTO;
import com.biz.cbt.persistence.QuizVO;

public class CbtServiceV2 extends CbtServiceV1 {
	

	public void update() {
		System.out.println("문제를 수정하시겠습니까?");
		
		
	}
	
	
	public void delete() {
		System.out.println("문제를 삭제하시겠습니까?");
		
	}

	public void quizSol() {
		
		System.out.println("문제 풀이를 시작하겠습니까?");
		
		List<QuizVO> quizList = quizDao.selectAll();
		Collections.shuffle(quizList);
		
		int nQNum = 1;
		for(QuizVO qVO : quizList) {
			System.out.print(nQNum++ + " . ");
			System.out.println(qVO.getCb_quiz());
			
			List<CbtDetailDTO> deList = qVO.getCdList();
			if(deList != null) {
				Collections.shuffle(deList);
				int nNum = 1;
				for(CbtDetailDTO dDTO : deList) {
					System.out.printf("%d\t", nNum++);
					System.out.printf("%s\t", dDTO.getD_answer());
					System.out.printf("%s\n", dDTO.getD_ok());
				}
			}
		}
	}
	
	
}