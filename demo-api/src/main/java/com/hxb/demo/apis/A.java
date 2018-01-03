package com.hxb.demo.apis;

import com.hxb.demo.options.TestDTO;

import javax.validation.constraints.NotNull;

/**
 * Created by yangjiachang on 2017/12/27.
 */
public interface A {

    @interface Test{}
    void test(@NotNull(message = "E_1002") TestDTO dto1, @NotNull(message = "E_1002") TestDTO dto2);
}
