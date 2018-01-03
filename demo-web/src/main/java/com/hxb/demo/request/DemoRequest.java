package com.hxb.demo.request;

import java.io.File;
import java.io.Serializable;

/**
 * Created by yangjiachang on 2017/12/25.
 */
public class DemoRequest implements Serializable {

    private String a;
    private String b;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public static void main(String[] args) {
        File file = new File("D:\\gitrepo\\hxb-demo\\demo-web\\src\\main\\resources");
        File[] files = file.listFiles();
        if (files != null && files.length > 0){
            for (File f : files){
                if (f.getName().endsWith(".properties")){
                    System.out.println(f.getName());
                }
            }
        }
        System.out.println(file);

    }
}
