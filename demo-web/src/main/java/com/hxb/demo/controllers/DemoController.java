package com.hxb.demo.controllers;

import com.alibaba.dubbo.rpc.RpcException;
import com.hxb.core.common.config.Global;
import com.hxb.core.ensure.Ensure;
import com.hxb.core.exceptions.HxbBusinessException;
import com.hxb.demo.apis.LoanApplyService;
import com.hxb.demo.options.TestDTO;
import com.hxb.demo.response.DemoResponse;
import com.hxb.demo.apis.A;
import com.hxb.test.apis.DemoService;
import com.hxb.test.options.TestOP;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by admin on 2017/12/25.
 */
@Controller
@RequestMapping(value = "demo")
public class DemoController {

    @Autowired
    private DemoService demoService;
    @Autowired
    private A a;
    @Autowired
    private LoanApplyService loanApplyService;


    @RequestMapping(value = "loanApplyService")
    public String loanApplyService(Model model) {
        loanApplyService.getRejectLoanApplyByUserId("abcdefghijklmnopqrstuvwxyz");
        return "modules/demo/test";

    }


    @RequestMapping(value = "list")
    public String list(Model model) {
        TestDTO dto1 = new TestDTO();
        dto1.setId("1");
        dto1.setNum(1);
        TestDTO dto2 = new TestDTO();
        dto2.setId("2");
        dto2.setNum(2);
        a.test(dto1, dto2);
        TestOP op = new TestOP();
        op.setId("1");
        op.setNum(333);
        String id = demoService.test(op,null);
        return "modules/demo/test";

    }

    @ResponseBody
    @RequestMapping(value = "test")
    public DemoResponse test(@RequestParam(value="contNo") String contNo) {
        System.out.println(contNo);
        Ensure.that(RandomUtils.nextInt(1,2)>1).isTrue("E_1001");
        return new DemoResponse();
    }

}
