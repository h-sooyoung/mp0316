package com.mp0316.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mp0316.dto.MemberDTO;
import com.mp0316.dto.MemberinfoDTO;
import com.mp0316.service.MpService;

@Controller
@RequestMapping("/mp/*")
public class MpController {
	//��Ʈ�ѷ��� ���񽺸� �ҷ��;���
	@Autowired
	private MpService service;
	
	@GetMapping("login")
	public String login() {
		return "member/login";
	}
	
	@PostMapping("loginPro")
	public String logincheck(MemberDTO dto, HttpSession session) {
		return service.logincheck(dto, session);
	}
	@GetMapping("memberinfo")
	public String memberinfo(HttpSession session,Model model ) {
		return service.memberinfo(session, model);
	}
	
	@PostMapping("memberupdate")
	public String memberupdate(MemberinfoDTO dto) {
		return service.memberupdate(dto);
	}
	@GetMapping("memberinforead")
	public String memberinforead(Model model,@RequestParam(value="seq",required=false, defaultValue="")int seq) {
		return service.memberinforead(model,seq);
	}
}
