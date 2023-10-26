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

import com.nowon.domain.dto.MemoListDTO;

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
	private long no;
	@Column (columnDefinition = "clob not null")
	private String content;
	@CreationTimestamp
	private LocalDateTime createdDate;
	@UpdateTimestamp
	private LocalDateTime updateDate;
	
	public MemoListDTO toMemoListDTO() {
		return MemoListDTO.builder().
				no(no).content(content).createdDate(createdDate).build();
	}
}
