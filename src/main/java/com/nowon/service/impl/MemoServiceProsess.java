package com.nowon.service.impl;


import java.time.LocalDate;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

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

	@Override
	public void memoFindAll(Model model) {
		model.addAttribute("list",memoR.findAll(Sort.by(Direction.DESC,"no")).stream().map(MemoEntity::toMemoListDTO).collect(Collectors.toList()));
		model.addAttribute("today",LocalDate.now());
	}

	@Override
	public void memoDel(long no) {
		memoR.delete(memoR.findById(no).orElseThrow());
//		memoR.deleteById(no);
	}


}
