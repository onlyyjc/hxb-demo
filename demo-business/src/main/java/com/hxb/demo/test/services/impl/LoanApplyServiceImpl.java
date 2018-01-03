package com.hxb.demo.test.services.impl;

import com.hxb.core.common.service.BaseService;
import com.hxb.demo.apis.LoanApplyService;
import com.hxb.demo.test.manager.LoanApplyManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 产品信息Service接口实现类
 *
 * @author liubo
 * @version 2017-06-22
 */
@Service("loanApplyService")
public class LoanApplyServiceImpl extends BaseService implements LoanApplyService {

    @Autowired
    private LoanApplyManager loanApplyManager;

    @Override
    public List getRejectLoanApplyByUserId(String userId) {
        List list = loanApplyManager.getRejectLoanApplyByUserId(userId);

        return null;
    }
}
