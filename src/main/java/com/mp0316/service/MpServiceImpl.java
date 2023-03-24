package com.mp0316.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.mp0316.dao.MpMapper;
import com.mp0316.dto.CompanyDTO;
import com.mp0316.dto.McardDTO;
import com.mp0316.dto.MemberDTO;
import com.mp0316.dto.MemberinfoDTO;

@Service
public class MpServiceImpl implements MpService{
	@Autowired
	MpMapper mapper;

	@Override
	public String cardInsert(Model model, HttpSession session) {
		//세션에서 아이디 가져오기
		String id = (String)session.getAttribute("id");
		//아이디로 멤버 시퀀스 가져오기
		int member_seq = mapper.selectMember_seqByID(id);
		//gender 테이블 gen 목록 조회
		model.addAttribute("genderList", mapper.selectGenList());
		//grade 테이블 cgrade 목록 조회
		model.addAttribute("cgradeList", mapper.selectCgradeList());
		//cname 테이블 company에서 user가 등록한 목록 조회
		model.addAttribute("companyList", mapper.selectCompanyByMember_seq(member_seq));
		//status 테이블 mcstatus 목록 조회
		model.addAttribute("statusList", mapper.selectMcStatusList());
		return "mcard/cardInsert";
	}

	@Override
	public String cardInsertPro(Model model, HttpSession session, McardDTO mcardDTO) {
		//세션에서 아이디 가져오기
		String id = (String)session.getAttribute("id");
		//아이디로 멤버 시퀀스 가져오기
		int member_seq = mapper.selectMember_seqByID(id);
		//사용자 시퀀스 DTO에 세팅
		mcardDTO.setMember_seq(member_seq);
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
	public String cardList(Model model, int pageNum) {
		//한 페이지에 출력할 데이터 양
		int pageSize = 9;
		//불러올 데이터 범위 계산
		int startNum = (pageNum-1) * pageSize + 1;
		int endNum = pageNum * pageSize;
		//총 페이지 갯수 계산
		int countRow = mapper.countMcardOpenList();
		int countPage = countRow/pageSize;
		if(countRow%pageSize > 0) {
			countPage++;
		};
		model.addAttribute("mcardList", mapper.selectMcardOpenList(startNum, endNum));
		model.addAttribute("countPage", countPage);
		return "mcard/cardList";
	}

	@Override
	public String cardListTable(Model model, int pageNum) {
		//한 페이지에 출력할 데이터 양
		int pageSize = 5;
		//불러올 데이터 범위 계산
		int startNum = (pageNum-1) * pageSize + 1;
		int endNum = pageNum * pageSize;
		//총 페이지 갯수 계산
		int countRow = mapper.countMcardOpenList();
		int countPage = countRow/pageSize;
		if(countRow%pageSize > 0) {
			countPage++;
		};
		model.addAttribute("mcardList", mapper.selectMcardOpenList(startNum, endNum));
		model.addAttribute("countPage", countPage);
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

	@Override
	public String readUpdatePro(Model model, McardDTO mcardDTO) {
		//update 맵퍼 호출
		mapper.updateMcard(mcardDTO);
		//alert 출력 메세지
		model.addAttribute("msg", "명함 수정이 완료되었습니다.");
		//이동할 location
		model.addAttribute("link", "/mp/readUpdate?mcard_seq="+mcardDTO.getMcard_seq());
		return "mcard/totalPro";
	}

	@Override
	public String cardSearchResult(Model model, String searchCol, String searchValue, int pageNum) {
		//한 페이지에 출력할 데이터 양
		int pageSize = 5;
		//불러올 데이터 범위 계산
		int startNum = (pageNum-1) * pageSize + 1;
		int endNum = pageNum * pageSize;
		//총 페이지 갯수 계산
		int countRow = mapper.countSearchMcardList(searchCol, searchValue);
		int countPage = countRow/pageSize;
		if(countRow%pageSize > 0) {
			countPage++;
		};
		model.addAttribute("mcardList", mapper.searchMcardList(searchCol, searchValue, startNum, endNum));
		model.addAttribute("countPage", countPage);
		model.addAttribute("searchCol", searchCol);
		model.addAttribute("searchValue", searchValue);
		return "mcard/cardSearchResult";
	}

	@Override
	public String companyList(Model model) {
		//임의 멤버 시퀀스 부여
		int member_seq = 1;
		model.addAttribute("companyList", mapper.selectCompanyByMember_seq(member_seq));
		return "mcard/companyList";
	}

	@Override
	public int delete1CompanyBySeq(int company_seq) {
		return mapper.delete1CompanyBySeq(company_seq);
	}

	@Override
	public String companyListPro(Model model, int[] companyArr) {
		for(int company_seq : companyArr) {
			mapper.delete1CompanyBySeq(company_seq);
		}
		//alert 출력 메세지
		model.addAttribute("msg", "삭제가 완료되었습니다.");
		//이동할 location
		model.addAttribute("link", "/mp/companyList");
		return "mcard/totalPro";
	}

	@Override
	public String companyUpdate(Model model, int company_seq) {
		model.addAttribute("companyDTO", mapper.selectCompanyByCompany_seq(company_seq));
		return "mcard/companyUpdate";
	}

	@Override
	public String companyUpdatePro(Model model, CompanyDTO companyDTO) {
		// 업데이트 맵퍼 호출
		mapper.updateCompany(companyDTO);
		//alert 출력 메세지
				model.addAttribute("msg", "회사 정보가 수정 되었습니다.");
		return "mcard/popUpPro";
	}
	
	///////////////////////////////////////////////////현태
	@Override
	public String logincheck(MemberDTO dto, HttpSession session) {
		if(mapper.logincheck(dto) != null) {
			session.setAttribute("id", dto.getId());
		}
		return "member/loginPro";
	}

	@Override
	public String logout(Model model, HttpSession session) {
		session.invalidate();//�����ʱ�ȭ
		//alert 출력 메세지
		model.addAttribute("msg", "로그아웃 되었습니다");
		//이동할 location
		model.addAttribute("link", "/mp/login");
		return "mcard/totalPro";
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
