package com.example.springboot_study.domain;

import com.google.gson.annotations.SerializedName;

/**
 * Gson格式化模型
 */

public class Small {
    @SerializedName("type")
    private String type;

    @SerializedName("value")
    private String value;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
