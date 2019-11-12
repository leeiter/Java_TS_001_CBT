package com.biz.cbt.persistence;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class CbtQuizDTO {
	
	private long cb_seq; 		//	number
	private String cb_quiz; 	//	nvarchar2(1000 char)

}