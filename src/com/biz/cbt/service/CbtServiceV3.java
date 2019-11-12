package com.biz.cbt.service;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.biz.cbt.config.DBConnection;
import com.biz.cbt.dao.QuizDao;
import com.biz.cbt.persistence.CbtDetailDTO;
import com.biz.cbt.persistence.CbtQuizDTO;
import com.biz.cbt.persistence.QuizVO;

public class CbtServiceV3 extends CbtServiceV2 {
	
	public void startMenu() {
		
		while(true) {
			System.out.println("=========================================");
			System.out.println("CBT 문제 은행");
			System.out.println("=========================================");
			System.out.println("1.문제입력 2.문제풀이 0.종료");
			System.out.println("-----------------------------------------");
			System.out.print("선택 >> ");
			String strMenu = scanner.nextLine();
			
			int intMenu = 0;
			try {
				intMenu = Integer.valueOf(strMenu);
			} catch (Exception e) {
				System.out.println("숫자로 입력 부탁드립니다.");
				continue;
			}
			
			if(intMenu == 0) {
				return;
			} else if(intMenu == 1) {
				this.mainMenu();
			} else if(intMenu == 2) {

			} else {
				System.out.println("0 또는 1 ~ 2까지 입력해주세요.");
				continue;
			}
			
		}

	}
	
	public void mainMenu() {
		
		while(true) {
			System.out.println("=========================================");
			System.out.println("CBT 문제 은행");
			System.out.println("=========================================");
			System.out.println("1.문제등록 2.문제수정 3.문제삭제 0.종료");
			System.out.println("-----------------------------------------");
			System.out.print("선택 >> ");
			String strMenu = scanner.nextLine();
			
			int intMenu = 0;
			try {
				intMenu = Integer.valueOf(strMenu);
			} catch (Exception e) {
				System.out.println("숫자로 입력 부탁드립니다.");
				continue;
			}
			
			if(intMenu == 0) {
				return;
			} else if(intMenu == 1) {

			} else if(intMenu == 2) {

			} else if(intMenu == 3) {

			} else {
				System.out.println("0 또는 1 ~ 3까지 입력해주세요.");
				continue;
			}
			
		}

	}


}