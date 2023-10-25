package com.nowon.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nowon.domain.dto.MemberSaveDTO;
import com.nowon.domain.entity.MemberEntity;
import com.nowon.domain.entity.MemberRepository;
import com.nowon.service.SignService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service // container : Application Context
public class SignServiceProcess implements SignService {

	private final MemberRepository repo;
	
	@Override
	public void saveProcess(MemberSaveDTO dto) {
		//DB에 저장
		repo.save( dto.toMemberEntity() );
	}
	
}
