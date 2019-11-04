package com.zy.p2p.base.controller;

import com.zy.p2p.base.domain.Userinfo;
import com.zy.p2p.base.service.IUserinfoService;
import com.zy.p2p.base.utils.RequireLogin;
import com.zy.p2p.business.domain.UserBankinfo;
import com.zy.p2p.business.service.IUserBankinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 用户绑定银行卡
 */
@Controller
public class UserBankinfoController {

	@Autowired
	private IUserBankinfoService userBankinfoService;
	@Autowired
	private IUserinfoService userinfoService;
	/**
	 * 导向到绑定银行卡界面
	 */
	@RequireLogin
	@RequestMapping("bankInfo")
	public String bankInfo(Model model) {
		Userinfo current = userinfoService.getUserinfo();
		if (!current.getIsBindBank()) {
			// 没有绑定
			model.addAttribute("userinfo", current);
			return "bankInfo";
		} else {
			model.addAttribute("bankInfo", userBankinfoService.getByUser(current.getId()));
			return "bankInfo_result";
		}
	}

	/**
	 * 执行绑定
	 */
	@RequireLogin
	@RequestMapping("bankInfo_save")
	public String bankInfoSave(UserBankinfo bankInfo) {
		this.userBankinfoService.bind(bankInfo);
		return "redirect:/bankInfo.do";
	}
}
