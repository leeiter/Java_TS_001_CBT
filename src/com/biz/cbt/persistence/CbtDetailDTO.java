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
public class CbtDetailDTO {
	
	private long d_seq; 		//	number
	private long d_cd_seq; 		//	number
	private String d_answer; 	//	nvarchar2(1000 char)
	private String d_ok; 		//	varchar2(1 byte)

}