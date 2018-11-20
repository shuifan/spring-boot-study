package com.example.springboot_study.study;

import com.example.springboot_study.domain.Big;
import com.example.springboot_study.domain.Small;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Gson格式化示例
 */
public class GsonTest {
    private static final String json = "{     \n" +
            "   \"fullname\": \"Sean Kelly\",     \n" +
            "   \"org\": \"SK Consulting\",     \n" +
            "   \"emailaddrs\": [     \n" +
            "      {\"type\": \"work\", \"value\": \"kelly@seankelly.biz\"},     \n" +
            "      {\"type\": \"home\", \"pref\": 1, \"value\": \"kelly@seankelly.tv\"}     \n" +
            "   ],     \n" +
            "    \"telephones\": [     \n" +
            "      {\"type\": \"work\", \"pref\": 1, \"value\": \"+1 214 555 1212\"},     \n" +
            "      {\"type\": \"fax\", \"value\": \"+1 214 555 1213\"},     \n" +
            "      {\"type\": \"mobile\", \"value\": \"+1 214 555 1214\"}     \n" +
            "   ],     \n" +
            "   \"addresses\": [     \n" +
            "      {\"type\": \"work\", \"format\": \"us\",     \n" +
            "       \"value\": \"1234 Main StnSpringfield, TX 78080-1216\"},     \n" +
            "      {\"type\": \"home\", \"format\": \"us\",     \n" +
            "       \"value\": \"5678 Main StnSpringfield, TX 78080-1316\"}     \n" +
            "   ],     \n" +
            "    \"urls\": [     \n" +
            "      {\"type\": \"work\", \"value\": \"http://seankelly.biz/\"},     \n" +
            "      {\"type\": \"home\", \"value\": \"http://seankelly.tv/\"}     \n" +
            "   ]     \n" +
            "}    ";


    public static void  main(String[] args){
        Gson gson = new GsonBuilder().create();
        Big<Small> big = gson.fromJson(json,Big.class);
        System.out.println(big.getAddresses().get(0).getType());
    }
}
