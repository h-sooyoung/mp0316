package com.mp0316.service;

import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;

import com.mp0316.dto.MemberDTO;
import com.mp0316.dto.MemberinfoDTO;

public interface MpService {
	public String login();
	public String logincheck(MemberDTO dto, HttpSession session);
	public void logout(HttpSession session);
	public String memberinfo(HttpSession session , Model model);
	public String memberupdate(MemberinfoDTO dto);
	public String memberinforead(Model model,int seq);
}
