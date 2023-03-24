package com.mp0316.dto;

import java.util.Date;

import lombok.Data;

@Data
public class MemberlogDTO {
	private int memberlog_seq;
	private int member_seq;
	private String memo;
	private Date reg;
}
