package com.nowon.domain.dto;

import java.time.LocalDateTime;



public class BoardDTO{

	private long no;
	private String title;
	private String content;
	private String writer;
	private int readCount;
	private LocalDateTime createdDate;
	private LocalDateTime updateDate;
}
