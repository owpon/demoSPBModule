package com.ziv.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ziv.entity.MemberEntity;

public interface MemberRepo extends JpaRepository<MemberEntity, Long> {
	List<MemberEntity> findAll();
}
