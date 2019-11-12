package com.biz.cbt.service;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.biz.cbt.config.DBConnection;
import com.biz.cbt.dao.QuizDao;
import com.biz.cbt.persistence.CbtDetailDTO;
import com.biz.cbt.persistence.CbtQuizDTO;
import com.biz.cbt.persistence.QuizVO;

public class CbtServiceV1 {
	
	
	protected QuizDao quizDao;
	protected Scanner scanner;
	
	{
		quizDao = DBConnection.getSqlSessionFactory().openSession(true).getMapper(QuizDao.class);
		scanner = new Scanner(System.in);
	}
	
	public void quizDetailList() {
		
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
	
	public void insert() {
		
		System.out.println("=====================================");		
		
		String strQ;
		while(true) {
			System.out.println("문제를 입력하세요(-Q:quit)");
			System.out.print(">> ");
			strQ = scanner.nextLine();
			if(strQ.equals("-Q")) break;
		}
		
		
		String strAOne;
		while(true) {
			System.out.print("답안1번 입력 >> ");
			strAOne = scanner.nextLine();
			break;
		}
		
		String strATwo;
		while(true) {
			System.out.print("답안2번 입력 >> ");
			strATwo = scanner.nextLine();
			break;
		}
		
		String strAThree;
		while(true) {
			System.out.print("답안3번 입력 >> ");
			strAThree = scanner.nextLine();
			break;
		}
		
		String strAFour;
		while(true) {
			System.out.print("답안4번 입력 >> ");
			strAFour = scanner.nextLine();
			break;
		}

		String strOk;
		while(true) {
			System.out.println("정답 >> ");
			strOk = scanner.nextLine();
			break;
		}
		
		CbtQuizDTO cqDTO = CbtQuizDTO.builder()
				.cb_quiz(strAOne).build();
		
		System.out.printf("cb_seq : %d", cqDTO.getCb_seq());
		
		int ret = quizDao.insertQuiz(cqDTO);

		
	}
	
	
	

}