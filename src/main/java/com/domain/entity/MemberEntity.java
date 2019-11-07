package com.domain.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author NIck
 * @date 2019-11-06 15:34:31
 */
public class MemberEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID
	 */
	private Integer id;
	/**
	 * 胶囊编号
	 */
	private String capsuleCode;
	/**
	 * 订单编号
	 */
	private String orderCode;
	/**
	 * 用户ID
	 */
	private Integer userID;
	/**
	 * 用户头像
	 */
	private String userHeadImg;
	/**
	 * 成员状态  1：无效 2：有效
	 */
	private String memberStatus;
	/**
	 * 创建时间
	 */
	private Date creatTime;
	/**
	 * 最后更新时间
	 */
	private Date lastUpdate;

	/**
	 * 设置：主键ID
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：主键ID
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：胶囊编号
	 */
	public void setCapsuleCode(String capsuleCode) {
		this.capsuleCode = capsuleCode;
	}
	/**
	 * 获取：胶囊编号
	 */
	public String getCapsuleCode() {
		return capsuleCode;
	}
	/**
	 * 设置：订单编号
	 */
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
	/**
	 * 获取：订单编号
	 */
	public String getOrderCode() {
		return orderCode;
	}
	/**
	 * 设置：用户ID
	 */
	public void setUserID(Integer userID) {
		this.userID = userID;
	}
	/**
	 * 获取：用户ID
	 */
	public Integer getUserID() {
		return userID;
	}
	/**
	 * 设置：用户头像
	 */
	public void setUserHeadImg(String userHeadImg) {
		this.userHeadImg = userHeadImg;
	}
	/**
	 * 获取：用户头像
	 */
	public String getUserHeadImg() {
		return userHeadImg;
	}
	/**
	 * 设置：成员状态  1：无效 2：有效
	 */
	public void setMemberStatus(String memberStatus) {
		this.memberStatus = memberStatus;
	}
	/**
	 * 获取：成员状态  1：无效 2：有效
	 */
	public String getMemberStatus() {
		return memberStatus;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreatTime(Date creatTime) {
		this.creatTime = creatTime;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCreatTime() {
		return creatTime;
	}
	/**
	 * 设置：最后更新时间
	 */
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	/**
	 * 获取：最后更新时间
	 */
	public Date getLastUpdate() {
		return lastUpdate;
	}
}
