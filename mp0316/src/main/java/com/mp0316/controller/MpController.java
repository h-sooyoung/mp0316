package com.mp0316.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mp0316.dto.MemberDTO;
import com.mp0316.service.MpService;

@Controller
@RequestMapping("/mp/*")
public class MpController {
	//컨트롤러는 서비스를 불러와야함
	@Autowired
	private MpService service;
	
	@GetMapping("login")
	public String login() {
		return "member/login";
	}
	
	@PostMapping("loginPro")
	public String logincheck(MemberDTO dto, HttpSession session) {
		System.out.println("으아");
		return service.logincheck(dto, session);
	}
	@GetMapping("memberinfo")
	public String memberinfo(HttpSession session,Model model) {
		String id =(String)session.getAttribute("id");
		return service.memberinfo(id, model);
	}
}
