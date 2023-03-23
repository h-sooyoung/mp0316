package com.mp0316.service;

import org.springframework.ui.Model;

import com.mp0316.dto.CompanyDTO;
import com.mp0316.dto.McardDTO;

public interface MpService {
	public String cardInsert(Model model);
	public String cardInsertPro(Model model, McardDTO mcardDTO);
	public CompanyDTO getAddrByCompany_seq(int company_seq);
	public String companyInsert();
	public String companyInsertPro(Model model, CompanyDTO companyDTO);
	public String cardList(Model model, int pageNum);
	public String cardListTable(Model model, int pageNum);
	public String readUpdate(Model model, int mcard_seq);
	public String readUpdatePro(Model model, McardDTO mcardDTO);
	public String cardSearchResult(Model model, String searchCol, String searchValue, int pageNum);
	public String companyList(Model model);
	public int delete1CompanyBySeq(int company_seq);
	public String companyListPro(Model model, int companyArr[]);
	public String companyUpdate(Model model, int company_seq);
	public String companyUpdatePro(Model model, CompanyDTO companyDTO);
}
