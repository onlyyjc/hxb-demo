package com.hxb.demo.test.manager;

import com.hxb.core.common.service.CrudService;
import com.hxb.demo.test.dao.LoanApplyDAO;
import com.hxb.demo.test.entity.LoanApply;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("loanApplyManager")
public class LoanApplyManager extends CrudService<LoanApplyDAO, LoanApply, String> {


	public List<LoanApply> getRejectLoanApplyByUserId(String userId){
		return dao.getRejectLoanApplyByUserId(userId);
	}
}
