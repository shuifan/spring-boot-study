package com.example.springboot_study.dao.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author fd
 * @since 2017-09-14
 */
@TableName("model_doctor")
public class ModelDoctor extends Model<ModelDoctor> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
    /**
     * 一般为工号。长度不定 
     */
	@TableField("doctor_code")
	private String doctorCode;
	@TableField("doctor_name")
	private String doctorName;
	@TableField("dept_code")
	private String deptCode;
    /**
     * 科室名
     */
	@TableField("dept_name")
	private String deptName;
    /**
     * 0 - false  1 - true
     */
	@TableField("is_expert")
	private Integer isExpert;
    /**
     * 头像
     */
	private String avatar;
    /**
     * 医院职称
     */
	private String title;
    /**
     * 简介
     */
	private String intro;
    /**
     * 创建时间
     */
	@TableField("created_date")
	private Date createdDate;
    /**
     * 扩展字段
     */
	private String extra;
	private String specialty;
    /**
     * 教学职称
     */
	@TableField("teach_title")
	private String teachTitle;
    /**
     * 专家出诊时间
     */
	@TableField("expert_visit_time")
	private String expertVisitTime;
	@TableField("dept_order")
	private Integer deptOrder;
	@TableField("hospital_order")
	private Integer hospitalOrder;
	@TableField("branch_code")
	private String branchCode;
	@TableField("branch_name")
	private String branchName;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDoctorCode() {
		return doctorCode;
	}

	public void setDoctorCode(String doctorCode) {
		this.doctorCode = doctorCode;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Integer getIsExpert() {
		return isExpert;
	}

	public void setIsExpert(Integer isExpert) {
		this.isExpert = isExpert;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getExtra() {
		return extra;
	}

	public void setExtra(String extra) {
		this.extra = extra;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public String getTeachTitle() {
		return teachTitle;
	}

	public void setTeachTitle(String teachTitle) {
		this.teachTitle = teachTitle;
	}

	public String getExpertVisitTime() {
		return expertVisitTime;
	}

	public void setExpertVisitTime(String expertVisitTime) {
		this.expertVisitTime = expertVisitTime;
	}

	public Integer getDeptOrder() {
		return deptOrder;
	}

	public void setDeptOrder(Integer deptOrder) {
		this.deptOrder = deptOrder;
	}

	public Integer getHospitalOrder() {
		return hospitalOrder;
	}

	public void setHospitalOrder(Integer hospitalOrder) {
		this.hospitalOrder = hospitalOrder;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "ModelDoctor{" +
			"id=" + id +
			", doctorCode=" + doctorCode +
			", doctorName=" + doctorName +
			", deptCode=" + deptCode +
			", deptName=" + deptName +
			", isExpert=" + isExpert +
			", avatar=" + avatar +
			", title=" + title +
			", intro=" + intro +
			", createdDate=" + createdDate +
			", extra=" + extra +
			", specialty=" + specialty +
			", teachTitle=" + teachTitle +
			", expertVisitTime=" + expertVisitTime +
			", deptOrder=" + deptOrder +
			", hospitalOrder=" + hospitalOrder +
			", branchCode=" + branchCode +
			", branchName=" + branchName +
			"}";
	}
}
