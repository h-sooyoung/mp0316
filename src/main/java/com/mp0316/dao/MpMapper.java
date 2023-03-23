package com.mp0316.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mp0316.dto.CgradeDTO;
import com.mp0316.dto.CompanyDTO;
import com.mp0316.dto.GenDTO;
import com.mp0316.dto.McStatusDTO;
import com.mp0316.dto.McardDTO;

public interface MpMapper {
	public List<CgradeDTO> selectCgradeList();
	public List<McStatusDTO> selectMcStatusList();
	public List<GenDTO> selectGenList();
	public List<CompanyDTO> selectCompanyByMember_seq(int member_seq);
	public CompanyDTO selectCompanyByCompany_seq(int company_seq);
	public int insertMcard(McardDTO mcardDTO);
	public int insertCompany(CompanyDTO companyDTO);
	public List<McardDTO> selectMcardOpenList(@Param("startNum")int startNum, @Param("endNum")int endNum);
	public int countMcardOpenList();
	public McardDTO selectMcardDTOBySeq(int mcard_seq);
	public int updateMcard(McardDTO mcardDTO);
	public List<McardDTO> searchMcardList(@Param("searchCol")String searchCol,
										@Param("searchValue")String searchValue,
										@Param("startNum")int startNum, @Param("endNum")int endNum);
	public int countSearchMcardList(@Param("searchCol")String searchCol,
										@Param("searchValue")String searchValue);
	public int delete1CompanyBySeq(int company_seq);
}
