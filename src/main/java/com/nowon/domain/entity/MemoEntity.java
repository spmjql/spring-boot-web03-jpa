package com.nowon.domain.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@SequenceGenerator (name = "gen_seq_memo", sequenceName = "seq_memo"
					,initialValue = 100, allocationSize = 1)
@Getter
@Table (name = "memo")
@Entity
public class MemoEntity {

	@Id @GeneratedValue(generator = "gen_seq_memo", strategy = GenerationType.SEQUENCE)
	long no;
	@Column (columnDefinition = "clob not null")
	String content;
	@CreationTimestamp
	LocalDateTime createdDate;
	@UpdateTimestamp
	LocalDateTime updateDate;
}
