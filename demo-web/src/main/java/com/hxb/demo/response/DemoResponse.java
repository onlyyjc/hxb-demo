package com.hxb.demo.response;

import java.io.Serializable;

/**
 * Created by yangjiachang on 2017/12/25.
 */
public class DemoResponse implements Serializable {

    private String result = "success";

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
