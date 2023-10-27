package com.nowon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.nowon.service.MemoService;

@Controller
public class MemoController {
	
	
	@Autowired
	MemoService service;

	/**
	 * 
	 * @param model Model 객체는 컨트롤러 메서드에서 뷰에 데이터를 전달하기 위해
	 * 사용되는 일반적인 객체이며, Spring은 이를 자동으로 생성하고 주입해준다.
	 * http요청을 처리하기위해 호출되고, 개발자가 model 객체 생성하거나 관리할 필요가 없다.
	 * @return
	 */
	@GetMapping ("/memo")
	public String memo(Model model) {
		service.memoFindAll(model);
		return "common/memo";
	}
	@PostMapping ("/memo")
	public String memoSave(String memoContent) {
		service.memoSave(memoContent);
		return "redirect:/memo";
	}
	@DeleteMapping("/memo/{no}")
	public String memoDelete(@PathVariable long no) {
		service.memoDel(no);
		return "redirect:/memo";
	}
}
