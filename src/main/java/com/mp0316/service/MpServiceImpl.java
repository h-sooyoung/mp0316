package com.mp0316.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.mp0316.dao.MpMapper;
import com.mp0316.dto.CompanyDTO;
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
		//임시 아이디 설정
		mcardDTO.setMember_seq(1);
		//insert mapper 호출
		mapper.insertMcard(mcardDTO);
		//alert 출력 메세지
		model.addAttribute("msg", "명함 등록이 완료되었습니다.");
		//이동할 location
		model.addAttribute("link", "/mp/cardInsert");
		return "mcard/totalPro";
	}

	@Override
	public CompanyDTO getAddrByCompany_seq(int company_seq) {
		return mapper.selectCompanyByCompany_seq(company_seq);
	}

	@Override
	public String companyInsert() {
		return "mcard/companyInsert";
	}

	@Override
	public String companyInsertPro(Model model, CompanyDTO companyDTO) {
		//임시 아이디 설정
		companyDTO.setMember_seq(1);
		//insert mapper 호풀
		mapper.insertCompany(companyDTO);
		//alert 출력 메세지
		model.addAttribute("msg", "회사 정보가 등록 되었습니다.");
		return "mcard/popUpPro";
	}
	public String cardList(Model model) {
		model.addAttribute("mcardList", mapper.selectMcardOpenList());
		return "mcard/cardList";
	}

	@Override
	public String cardListTable(Model model) {
		model.addAttribute("mcardList", mapper.selectMcardOpenList());
		return "mcard/cardListTable";
	}

	@Override
	public String readUpdate(Model model, int mcard_seq) {
		//해당 mcardDTO 한 줄 호출
		model.addAttribute("mcardDTO", mapper.selectMcardDTOBySeq(mcard_seq));
		//grade 테이블 cgrade 목록 조회
		model.addAttribute("cgradeList", mapper.selectCgradeList());
		//cname 테이블 company에서 user가 등록한 목록 조회
		model.addAttribute("companyList", mapper.selectCompanyByMember_seq(1));
		//status 테이블 mcstatus 목록 조회
		model.addAttribute("statusList", mapper.selectMcStatusList());
		return "mcard/readUpdate";
	}
}
