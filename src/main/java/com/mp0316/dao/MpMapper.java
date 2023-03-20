package com.mp0316.dao;

import java.util.List;

import com.mp0316.dto.CgradeDTO;
import com.mp0316.dto.CompanyDTO;
import com.mp0316.dto.GenDTO;
import com.mp0316.dto.McStatusDTO;

public interface MpMapper {
	public List<CgradeDTO> selectCgradeList();
	public List<McStatusDTO> selectMcStatusList();
	public List<GenDTO> selectGenList();
	public List<CompanyDTO> selectCompanyByMember_seq(int member_seq);
	public CompanyDTO selectCompanyByCompany_seq(int company_seq);
}
