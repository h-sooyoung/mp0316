package com.mp0316.dto;

import java.util.Date;

import lombok.Data;

@Data
public class McardDTO {
	private int mcard_seq;
	private int member_seq;
	private String name;
	private String phone;
	private String tel;
	private String fax;
	private String email;
	private int grade;
	private String addr1;
	private String addr2;
	private int gender;
	private int cname;
	private Date reg;
	private int status;
	//추가변수
	private String sgender;
	private String sgrade;
	private String scname;
	private String sstatus;
}
