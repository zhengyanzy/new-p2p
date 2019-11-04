package com.zy.p2p.business.service;


import com.zy.p2p.business.domain.UserBankinfo;

/**
 * 用户绑定银行卡相关
 * 
 * @author Administrator
 * 
 */
public interface IUserBankinfoService {

	/**
	 * 得到当前用户绑定的银行卡信息
	 * 
	 * @param id
	 * @return
	 */
	UserBankinfo getByUser(Long id);

	/**
	 * 绑定银行卡
	 * 
	 * @param bankInfo
	 */
	void bind(UserBankinfo bankInfo);

}
