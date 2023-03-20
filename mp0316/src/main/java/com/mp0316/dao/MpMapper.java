package com.mp0316.dao;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;

import com.mp0316.dto.MemberDTO;

public interface MpMapper {
	public MemberDTO logincheck(MemberDTO dto);
	public HashMap memberinfo(String id);
}
