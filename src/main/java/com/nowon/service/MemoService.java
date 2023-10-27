package com.nowon.service;


import org.springframework.ui.Model;


public interface MemoService {

	void memoSave(String memoContent);

	void memoFindAll(Model model);

	void memoDel(long no);

}
