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
@TableName("model_dept")
public class ModelDept extends Model<ModelDept> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	@TableField("dept_code")
	private String deptCode;
	@TableField("dept_name")
	private String deptName;
	@TableField("branch_code")
	private String branchCode;
	@TableField("branch_name")
	private String branchName;
    /**
     * 科室类型
     */
	private String type;
	@TableField("created_date")
	private Date createdDate;
	private String extra;
    /**
     * 简介
     */
	private String intro;
	@TableField("parent_dept_code")
	private String parentDeptCode;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public String getParentDeptCode() {
		return parentDeptCode;
	}

	public void setParentDeptCode(String parentDeptCode) {
		this.parentDeptCode = parentDeptCode;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "ModelDept{" +
			"id=" + id +
			", deptCode=" + deptCode +
			", deptName=" + deptName +
			", branchCode=" + branchCode +
			", branchName=" + branchName +
			", type=" + type +
			", createdDate=" + createdDate +
			", extra=" + extra +
			", intro=" + intro +
			", parentDeptCode=" + parentDeptCode +
			"}";
	}
}
