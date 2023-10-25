package com.nowon;

import java.util.List;

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
//	@Test
	void 회원가입() {
		mem.save(MemberEntity.builder().username("amd").pass("3342").name("김딩당").build());
	}

	@Test
	void 게시글생성() {
		bo.save(BoardEntity.builder().content("테스트contnet")
				.title("테스트title").member( mem.findById(42L)
				.orElseThrow() )//존재하지않으면 NoSuchElementException 출력
				.build());
	}
	
	@Test
	void 게시글모두조회() {
		List<BoardEntity> result = bo.findAll();
		for(BoardEntity bo : result) {
			System.out.print(bo.getNo()+" : ");
			System.out.print(bo.getTitle()+" : ");
			System.out.print(bo.getContent()+" : ");
			System.out.print(bo.getReadCount()+" : ");	
			System.out.print(bo.getMember()+" : ");
			System.out.print(bo.getCreatedDate()+" : ");
			System.out.println(bo.getUpdateDate()+" : ");
		}
	}
}
