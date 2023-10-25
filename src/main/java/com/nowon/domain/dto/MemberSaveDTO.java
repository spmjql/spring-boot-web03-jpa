package com.nowon.domain.dto;

import com.nowon.domain.entity.MemberEntity;

import lombok.Setter;

@Setter
public class MemberSaveDTO {

	private String username;
	private String pass;
	private String name;
	
	//편의메서드
	public MemberEntity toMemberEntity() {
		return MemberEntity.builder()
				.username(username)
				.pass(pass)
				.name(name).build();
	}
}
