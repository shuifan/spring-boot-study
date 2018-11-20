package com.example.springboot_study.utils;

import java.io.IOException;

/**
 * 64位编解码工具
 */

public class Base64Encrypt {

    //编码
    public static String encode(byte[] bstr){
        return new sun.misc.BASE64Encoder().encode(bstr);
    }

    //解码
    public static byte[] decode(String str){
        byte[] bytes = null;
        try {
            sun.misc.BASE64Decoder decoder = new sun.misc.BASE64Decoder();
            bytes = decoder.decodeBuffer(str);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return bytes;
    }


    //测试
    public static void main(String[] args){
        String str = "fandong233男";
        String str1 = encode(str.getBytes());
        System.out.println(str);
        System.out.println(new String(decode(str1)));
    }
}
