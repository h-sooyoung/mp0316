package com.mp0316.dto;

import java.util.Date;

import lombok.Data;

@Data
public class MemberinfoDTO {
	private int memberinfo_seq;
	private int member_seq;
	private String name;
	private Date birth;
	private int gen;
	private String email;
	private String tel;
	private String addr1;
	private String addr2;
	private Date reg;
	private String memid;
}
