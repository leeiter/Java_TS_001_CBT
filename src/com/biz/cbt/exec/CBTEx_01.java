package com.biz.cbt.exec;

import com.biz.cbt.service.CbtServiceV1;

public class CBTEx_01 {

	public static void main(String[] args) {
		
		//CbtServiceV3 cs = new CbtServiceV3();
		//cs.startMenu();
		
		CbtServiceV1 cs = new CbtServiceV1();
		cs.quizDetailList();

	}

}