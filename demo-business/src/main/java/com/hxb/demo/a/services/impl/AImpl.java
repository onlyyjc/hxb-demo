package com.hxb.demo.a.services.impl;

import com.hxb.demo.apis.A;
import com.hxb.demo.options.TestDTO;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;

/**
 * Created by yangjiachang on 2017/12/27.
 */
@Service("a")
public class AImpl implements A {


    public void test(TestDTO dto1, TestDTO dto2) {
        System.out.println("aaaaaaaaa");
    }
}
