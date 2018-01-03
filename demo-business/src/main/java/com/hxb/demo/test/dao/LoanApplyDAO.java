package com.hxb.demo.test.dao;

import com.hxb.core.common.persistence.BaseDao;
import com.hxb.core.common.persistence.annotation.MyBatisDao;
import com.hxb.demo.test.entity.LoanApply;
import java.util.List;

/**
 * 贷款申请DAO接口
 * @author liubo
 * @version 2017-06-22
 */
@MyBatisDao
public interface LoanApplyDAO extends BaseDao<LoanApply, String> {

	/**
	 * 根据用户基本信息查询贷款申请
	 * @param userId
	 * @return
	 */
	List<LoanApply> getRejectLoanApplyByUserId(String userId);
	

}
