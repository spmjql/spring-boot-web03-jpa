package com.nowon.domain.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor (access = AccessLevel.PRIVATE)
@SequenceGenerator(name = "gen_seq_board", sequenceName = "seq_bo"
	, initialValue = 1, allocationSize = 1)
@Getter
@Table(name = "board")
@Entity//:테이블을 대신하는 객체:-DAO객체 -> repository
public class BoardEntity {

	@Id @GeneratedValue(generator = "gen_seq_board", strategy = GenerationType.SEQUENCE)
	private long no;
	@Column(nullable = false)
	private String title;
	@Column(columnDefinition = "clob not null")
	private String content;
	@Column
	private int readCount;
	@CreationTimestamp
	private LocalDateTime createdDate;
	@UpdateTimestamp
	private LocalDateTime updateDate;
	
	@JoinColumn(name = "writer")
	@ManyToOne //member_no
	MemberEntity member;
}
