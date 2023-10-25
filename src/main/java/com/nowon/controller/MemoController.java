package com.nowon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.nowon.domain.entity.MemoEntity;
import com.nowon.domain.entity.MemoRepository;
import com.nowon.service.MemoService;
import com.nowon.service.impl.MemoServiceProsess;

@Controller
public class MemoController {
	
	
	@Autowired
	MemoService service;

	@GetMapping ("/memo")
	public String memo() {
		return "common/memo.html";
	}
	@PostMapping ("/memo")
	public String memoSave(String memoContent) {
		service.memoSave(memoContent);
		return "common/memo.html";
	}
}
