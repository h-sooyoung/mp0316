package com.mp0316.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.mp0316.dao.MpMapper;
import com.mp0316.dto.MemberDTO;
import com.mp0316.dto.MemberinfoDTO;

@Service
public class MpServiceImpl implements MpService{
	@Autowired
	MpMapper mapper;
	//���񽺴� ���۸� �ҷ��;���

	@Override
	public String logincheck(MemberDTO dto, HttpSession session) {
		if(mapper.logincheck(dto) != null) {
			session.setAttribute("id", dto.getId());
		}
		return "member/loginPro";
	}

	@Override
	public void logout(HttpSession session) {
		session.invalidate();//�����ʱ�ȭ
	}

	@Override
	public String login() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String memberinfo(HttpSession session, Model model) {
		String id = (String)session.getAttribute("id");
		model.addAttribute("info", mapper.memberinfo(id));
		return "member/memberinfo";
	}

	@Override
	public String memberupdate(MemberinfoDTO dto) {
		mapper.memberupdate(dto);
		return "member/memberupdate";
	}

	@Override
	public String memberinforead(Model model, int seq) {
		model.addAttribute("dto", mapper.memberinforead(seq));
		return "member/memberinforead";
	}
	
}
