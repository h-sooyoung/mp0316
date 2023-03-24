package com.mp0316.dao;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.ui.Model;

import com.mp0316.dto.MemberDTO;
import com.mp0316.dto.MemberinfoDTO;

public interface MpMapper {
	public MemberDTO logincheck(MemberDTO dto);
	public HashMap memberinfo(String id);
	public void memberupdate(MemberinfoDTO dto);
	public MemberinfoDTO memberinforead(@Param("seq")int seq);
}
