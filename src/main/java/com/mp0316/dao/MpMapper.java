package com.mp0316.dao;

import java.util.List;

import com.mp0316.dto.CgradeDTO;
import com.mp0316.dto.McStatusDTO;

public interface MpMapper {
	public List<CgradeDTO> selectCgradeList();
	public List<McStatusDTO> selectMcStatusList();
}
