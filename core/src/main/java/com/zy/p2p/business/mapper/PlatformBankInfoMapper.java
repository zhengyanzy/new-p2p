package com.zy.p2p.business.mapper;


import com.zy.p2p.business.domain.PlatformBankInfo;
import com.zy.p2p.business.query.PlatformBankInfoQueryObject;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface PlatformBankInfoMapper {
	int deleteByPrimaryKey(Long id);

	int insert(PlatformBankInfo record);

	PlatformBankInfo selectByPrimaryKey(Long id);

	List<PlatformBankInfo> selectAll();

	int updateByPrimaryKey(PlatformBankInfo record);

	int queryForCount(PlatformBankInfoQueryObject qo);

	List<PlatformBankInfo> query(PlatformBankInfoQueryObject qo);
}