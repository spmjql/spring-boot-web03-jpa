package com.nowon.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nowon.domain.entity.MemoEntity;
import com.nowon.domain.entity.MemoRepository;
import com.nowon.service.MemoService;

@Service
public class MemoServiceProsess implements MemoService {

	@Autowired
	MemoRepository memoR;
	
	@Override
	public void memoSave(String memoContent) {
		memoR.save( MemoEntity.builder().content(memoContent).build() );
		
	}

}
