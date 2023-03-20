package com.mp0316.service;

import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;

import com.mp0316.dto.MemberDTO;

public interface MpService {
	public String login();
	public String logincheck(MemberDTO dto, HttpSession session);
	public void logout(HttpSession session);
	public String memberinfo(String id , Model model);
}
