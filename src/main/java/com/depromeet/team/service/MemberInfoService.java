package com.depromeet.team.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.depromeet.team.mapper.MemberInfoMapper;

@Service
public class MemberInfoService {
	@Autowired
	private MemberInfoMapper mapper;
}
