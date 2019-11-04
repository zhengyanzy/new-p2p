package com.zy.p2p.business.query;

import com.zy.p2p.base.query.base.QueryObject;
import lombok.Getter;
import lombok.Setter;



/**
 * 查询借款
 * 
 * @author Administrator
 * 
 */
@Setter
@Getter
public class BidRequestQueryObject extends QueryObject {

	private int bidRequestState = -1;// 借款状态
	private int[] bidRequestStates;// 要查询的多个借款状态

	private String orderBy;// 按照哪个列排序
	private String orderType;// 按照什么顺序排序

}
