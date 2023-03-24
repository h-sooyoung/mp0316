package com.mp0316.dto;

import java.util.Date;

import lombok.Data;

@Data
public class MemberjoinDTO {
	private int member_seq;
	private String id;
	private String pw;
	private String name;
	private String email;
	private Date birth;
	private int gen;
	private String tel;
	private String addr1;
	private String addr2;
}
