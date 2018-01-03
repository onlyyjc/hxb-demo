package com.hxb.demo.apis;


import java.util.List;

/**
 * 贷款申请Service接口
 * @author liubo
 * @version 2017-06-22
 */
public interface LoanApplyService {

	List getRejectLoanApplyByUserId(String userId);

}
