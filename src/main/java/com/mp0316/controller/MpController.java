package com.mp0316.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mp0316.dto.CompanyDTO;
import com.mp0316.dto.McardDTO;
import com.mp0316.service.MpService;

@Controller
@RequestMapping("/mp/*")
public class MpController {
	@Autowired
	private MpService service;
	
	@GetMapping("cardInsert")
	public String cardInsert(Model model) {
		return service.cardInsert(model);
	}
	
	@PostMapping("cardInsertPro")
	public String cardInsertPro(Model model, McardDTO mcardDTO) {
		return service.cardInsertPro(model, mcardDTO);
	}
	
	@GetMapping("getAddrByCompany_seq")
	public @ResponseBody CompanyDTO getAddrByCompany_seq(int company_seq) {
		return service.getAddrByCompany_seq(company_seq);
	}
	
	@GetMapping("companyInsert")
	public String companyInsert() {
		return service.companyInsert();
	}
	
	@PostMapping("companyInsertPro")
	public String companyInsertPro(Model model, CompanyDTO companyDTO) {
		return service.companyInsertPro(model, companyDTO);
	}
	
	@GetMapping("cardList")
	public String cardList(Model model) {
		return service.cardList(model);
	}
	
	@GetMapping("cardListTable")
	public String cardListTable(Model model) {
		return service.cardListTable(model);
	}
}
