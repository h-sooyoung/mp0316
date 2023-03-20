package com.mp0316.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mp0316.dto.McardDTO;
import com.mp0316.service.MpService;

@Controller
@RequestMapping("/mp/*")
public class MpController {
	@Autowired
	private MpService service;
	
	@GetMapping("cardInsert")
	public String cardInsert(Model model) {
		return service.cardInsert(model);
	}
	
	@PostMapping("cardInsertPro")
	public String cardInsertPro(Model model, McardDTO mcardDTO) {
		return service.cardInsertPro(model, mcardDTO);
	}
}
