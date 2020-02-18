package com.example.demo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class BaseInfo {

    @Id
    @GeneratedValue
    private Integer id;

    private String patientName;
    private String patientBirthday;
    private String gender;
    private String patientPhone;
    private String patientId;
    private String patientType;
    private String patientSeq;
    private String bingQuCode;
    private String bingQuName;
    private String bingFangName;
    private String bingChuangBianMa;
    private String deptCode;
    private String deptName;
    private String zhuZhiCode;
    private String zhuZhiName;
    private String kaiDanCode;
    private String kaiDanName;
    private String kaiDanTime;
    private String kaiDanKeShiCode1;
    private String kaiDanKeShiName1;
    private String kaiDanKeShiCode2;
    private String kaiDanKeShiName2;
    private String zhiXinKeShiCode;
    private String zhiXinKeShiName;
    private String chuFangBianHao;
    /**
     * 唯一编号
     */
    private String zhiXinBianHao;
    private String baoGaoShiJian;
    private String shenHeRenCode;
    private String shenHeRenName;
    private String jianYanRenCode;
    private String jianYanRenName;
    private String jianChaBuWeiName;
    private String jianChaBuWeiCode;
    private String jianChaFangShiName;
    private String jianChaSheBeiLeiXin;
    private String jianYanCode;
    private String jianYanName;
    private String zhenDuan;

    private String type;

    private String confirmName;
    private String confirmUserId;
    private String confirmRemark;
    private Date confirmTime;

    private Date createTime;
    private Date updateTime;

    /**
     * 单位 s
     */
    private Long processTime;

}
