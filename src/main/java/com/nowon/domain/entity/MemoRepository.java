package com.nowon.domain.entity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemoRepository extends JpaRepository<MemoEntity, Long> {
	
}
