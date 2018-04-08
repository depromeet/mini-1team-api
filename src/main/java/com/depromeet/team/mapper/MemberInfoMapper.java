package com.depromeet.team.mapper;

import com.depromeet.team.domain.MemberInfoVO;

public interface MemberInfoMapper {
	void regist(MemberInfoVO vo);
	MemberInfoVO showInfo(long uid);
	void modify(MemberInfoVO vo);
	void remove(long uid);
}
