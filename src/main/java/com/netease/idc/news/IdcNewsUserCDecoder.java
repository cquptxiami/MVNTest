package com.netease.idc.news;

import org.apache.hadoop.hive.ql.exec.UDF;
import sun.misc.BASE64Decoder;

import java.io.IOException;

public class IdcNewsUserCDecoder extends UDF {
    public String evalute(String s){
        BASE64Decoder decoder = new BASE64Decoder();
        try {
            byte[] b = decoder.decodeBuffer(s);
            return new String(b);
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static void main(String[] args) {
       IdcNewsUserCDecoder userC = new IdcNewsUserCDecoder();
        System.out.println("5pyA5paw5Yqo5oCB->"+userC.evalute("5pyA5paw5Yqo5oCB"));

    }
}
