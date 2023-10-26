package com.nowon.domain.dto;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class MemoListDTO {

	private long no;
	private String content;
	private LocalDateTime createdDate;
}
