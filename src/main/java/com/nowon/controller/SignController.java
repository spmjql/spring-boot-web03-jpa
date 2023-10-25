package com.nowon.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.nowon.domain.dto.MemberSaveDTO;
import com.nowon.domain.entity.MemberEntity;
import com.nowon.domain.entity.MemberRepository;
import com.nowon.service.SignService;
import com.nowon.service.impl.SignServiceProcess;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class SignController {
	


//	@Autowired
//	private MemberRepository mem;
	
//	@Autowired private SignService service;//필드 DI	
	private final SignService service;//생성자 DI
	//setter DI
	
	@GetMapping ("/signup")
	public String signup() {
		return "common/signup";
	}
	@PostMapping ("/signup")
	public String signupSave(MemberSaveDTO dto) {
//		mem.save(MemberEntity.builder().username(req.getParameter("username"))
//					.pass(req.getParameter("pass"))
//					.name(req.getParameter("name")).build());
		//회원가입 처리
		service.saveProcess(dto);
		
		return "common/signup";
	}
}
