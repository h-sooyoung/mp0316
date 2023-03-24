package com.mp0316.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mp0316.dto.CompanyDTO;
import com.mp0316.dto.McardDTO;
import com.mp0316.dto.MemberDTO;
import com.mp0316.dto.MemberinfoDTO;
import com.mp0316.service.MpService;

@Controller
@RequestMapping("/mp/*")
public class MpController {
	@Autowired
	private MpService service;
	
	@GetMapping("cardInsert")
	public String cardInsert(Model model, HttpSession session) {
		return service.cardInsert(model, session);
	}
	
	@PostMapping("cardInsertPro")
	public String cardInsertPro(Model model, HttpSession session, McardDTO mcardDTO) {
		return service.cardInsertPro(model, session, mcardDTO);
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
	public String cardList(Model model,
			@RequestParam(value = "pageNum" , required=false, defaultValue="1")int pageNum) {
		return service.cardList(model, pageNum);
	}
	
	@GetMapping("cardListTable")
	public String cardListTable(Model model,
			@RequestParam(value = "pageNum" , required=false, defaultValue="1")int pageNum) {
		return service.cardListTable(model, pageNum);
	}
	
	@GetMapping("readUpdate")
	public String readUpdate(Model model,
			@RequestParam(value = "mcard_seq" , required=true)int mcard_seq) {
		return service.readUpdate(model, mcard_seq);
	}
	
	@PostMapping("readUpdatePro")
	public String readUpdatePro(Model model, McardDTO mcardDTO) {
		return service.readUpdatePro(model, mcardDTO);
	}
	
	@GetMapping("cardSearchResult")
	public String cardSearchResult(Model model, 
			@RequestParam(value = "searchCol" , required=true)String searchCol,
			@RequestParam(value = "searchValue" , required=true)String searchValue,
			@RequestParam(value = "pageNum" , required=false, defaultValue="1")int pageNum) {
		return service.cardSearchResult(model, searchCol, searchValue, pageNum);
	}
	
	@GetMapping("companyList")
	public String companyList(Model model) {
		return service.companyList(model);
	}
	
	@GetMapping("delete1CompanyBySeq")
	public @ResponseBody void delete1CompanyBySeq(int company_seq) {
		service.delete1CompanyBySeq(company_seq);
	}
	
	@PostMapping("companyListPro")
	public String companyListPro(Model model, int companyArr[]) {
		return service.companyListPro(model, companyArr);
	}
	
	@GetMapping("companyUpdate")
	public String companyUpdate(Model model, int company_seq) {
		return service.companyUpdate(model, company_seq);
	}
	
	@PostMapping("companyUpdatePro")
	public String companyUpdatePro(Model model, CompanyDTO companyDTO) {
		return service.companyUpdatePro(model, companyDTO);
	}
	
	////////////////////////////////////////////////현태
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
	
	@GetMapping("logout")
	public String logout(Model model, HttpSession session) {
		return service.logout(model, session);
	}
}
