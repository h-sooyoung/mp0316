package com.mp0316.service;

import org.springframework.ui.Model;

import com.mp0316.dto.CompanyDTO;
import com.mp0316.dto.McardDTO;

public interface MpService {
	public String cardInsert(Model model);
	public String cardInsertPro(Model model, McardDTO mcardDTO);
	public CompanyDTO getAddrByCompany_seq(int company_seq);

}
