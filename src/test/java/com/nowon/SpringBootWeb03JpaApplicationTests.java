package com.nowon;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.nowon.domain.entity.BoardEntity;
import com.nowon.domain.entity.BoardRepository;
import com.nowon.domain.entity.MemberEntity;
import com.nowon.domain.entity.MemberRepository;

@SpringBootTest
class SpringBootWeb03JpaApplicationTests {

	@Autowired
	MemberRepository mem;
	
	@Autowired
	BoardRepository bo;
	@Test
	void 회원가입() {
		mem.save(MemberEntity.builder().id("ppap").pass("123$").name("김종장").build());
	}

	@Test
	void 게시글생성() {
		bo.save(BoardEntity.builder().content("테스트contnet").title("테스트title").member(MemberEntity.builder().no(1).build()).build());
	}
}
