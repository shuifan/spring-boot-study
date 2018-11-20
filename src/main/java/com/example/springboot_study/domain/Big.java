package com.example.springboot_study.domain;

import com.google.gson.annotations.SerializedName;

import java.util.List;


/**
 * Gson格式化模型
 */

public class Big<T> {

    @SerializedName("fullname")
    private String fullname;

    @SerializedName("org")
    private String org;

    @SerializedName("emailaddrs")
    private List<T> emailaddrs;

    @SerializedName("telephones")
    private List<T> telephones;

    @SerializedName("addresses")
    private List<T> addresses;

    @SerializedName("urls")
    private List<T> urls;

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    public List<T> getEmailaddrs() {
        return emailaddrs;
    }

    public void setEmailaddrs(List<T> emailaddrs) {
        this.emailaddrs = emailaddrs;
    }

    public List<T> getTelephones() {
        return telephones;
    }

    public void setTelephones(List<T> telephones) {
        this.telephones = telephones;
    }

    public List<T> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<T> addresses) {
        this.addresses = addresses;
    }

    public List<T> getUrls() {
        return urls;
    }

    public void setUrls(List<T> urls) {
        this.urls = urls;
    }
}
