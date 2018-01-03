package com.hxb.demo.options;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

/**
 * Created by yangjiachang on 2017/12/27.
 */
public class TestDTO implements Serializable {


    @NotBlank(message = "E_1002", groups = {com.hxb.demo.apis.A.Test.class})
    private String id;

    @NotNull(message = "E_1002")
    private Integer num;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}
