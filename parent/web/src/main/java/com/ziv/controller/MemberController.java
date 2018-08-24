package com.ziv.controller;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.ziv.dao.MemberRepo;
import com.ziv.entity.MemberEntity;

@Controller
public class MemberController {
	@Autowired
	MemberRepo memberRepo;
	@Autowired
	DataSource dataSource;

	@GetMapping("/addMemberPage")
	public String addMemberPage() {
		List<MemberEntity> memberJPABean = new ArrayList<MemberEntity>();
		memberJPABean = memberRepo.findAll();
		for (int i = 0; i < memberJPABean.size(); i++) {
			System.out.println(memberJPABean.get(i).getEmail());
		}
		return "addMemberPage";
	}

}
