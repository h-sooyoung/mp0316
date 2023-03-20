package com.mp0316.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.mp0316.dao.MpMapper;
import com.mp0316.dto.McardDTO;

@Service
public class MpServiceImpl implements MpService{
	@Autowired
	MpMapper mapper;

	@Override
	public String cardInsert(Model model) {
		//gender 테이블 gen 목록 조회
		model.addAttribute("genderList", mapper.selectGenList());
		//grade 테이블 cgrade 목록 조회
		model.addAttribute("cgradeList", mapper.selectCgradeList());
		//cname 테이블 company에서 user가 등록한 목록 조회
		model.addAttribute("companyList", mapper.selectCompanyByMember_seq(1));
		//status 테이블 mcstatus 목록 조회
		model.addAttribute("statusList", mapper.selectMcStatusList());
		return "mcard/cardInsert";
	}

	@Override
	public String cardInsertPro(Model model, McardDTO mcardDTO) {
		//
		
		//alert 출력 메세지
		model.addAttribute("msg", "명함 등록이 완료되었습니다.");
		//이동할 location
		model.addAttribute("link", "/mp/cardInsert");
		return "mcard/totalPro";
	}
}
