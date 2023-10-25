package com.nowon.domain.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor (access = AccessLevel.PRIVATE)
@SequenceGenerator(name = "gen_seq_mem", sequenceName = "seq_mem", 
	initialValue = 1, allocationSize = 1)
@Getter
@Table(name = "member")
@Entity
public class MemberEntity {

	@Id @GeneratedValue(generator = "gen_seq_mem", strategy = GenerationType.SEQUENCE)
	private long no;
	@Column (nullable = false, unique = true)
	private String username;
	@Column (nullable = false)
	private String pass;
	@Column (nullable = false)
	private String name;
	
//	@OneToMany
//	List<BoardEntity> board;
	
}
