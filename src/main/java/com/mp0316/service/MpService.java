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
	public String cardList(Model model);
	public String cardListTable(Model model);
	public String readUpdate(Model model, int mcard_seq);
	public String readUpdatePro(Model model, McardDTO mcardDTO);

}
