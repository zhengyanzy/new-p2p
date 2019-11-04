package com.zy.p2p.business.domain;

import com.zy.p2p.base.domain.BaseAuditDomain;
import lombok.Getter;
import lombok.Setter;



/**
 * 借款审核历史对象
 * 
 * @author Administrator
 * 
 */
@Getter
@Setter
public class BidRequestAuditHistory extends BaseAuditDomain {

	public static final int PUBLISH_AUDIT = 0;// 发标前审核
	public static final int FULL_AUDIT_1 = 1;// 满标一审
	public static final int FULL_AUDIT_2 = 2;// 满标二审

	private Long bidRequestId;
	private int auditType; //审核类型

	public String getAuditTypeDisplay() {
		switch (this.auditType) {
		case PUBLISH_AUDIT:
			return "发标前审核";
		case FULL_AUDIT_1:
			return "满标一审";
		case FULL_AUDIT_2:
			return "满标二审";
		default:
			return "";
		}
	}
}
