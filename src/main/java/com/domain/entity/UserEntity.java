package com.domain.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author NIck
 * @date 2019-11-06 15:34:31
 */
public class UserEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID
	 */
	private Integer id;
	/**
	 * 用户昵称
	 */
	private String nickName;
	/**
	 * 手机号码
	 */
	private String phoneNumber;
	/**
	 * 用户openID
	 */
	private String openId;
	/**
	 * 用户状态 1：无效 2：有效 
	 */
	private String userStatus;
	/**
	 * 用户头像url
	 */
	private String headImgUrl;
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
	 * 设置：用户昵称
	 */
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	/**
	 * 获取：用户昵称
	 */
	public String getNickName() {
		return nickName;
	}
	/**
	 * 设置：手机号码
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/**
	 * 获取：手机号码
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * 设置：用户openID
	 */
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	/**
	 * 获取：用户openID
	 */
	public String getOpenId() {
		return openId;
	}
	/**
	 * 设置：用户状态 1：无效 2：有效 
	 */
	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}
	/**
	 * 获取：用户状态 1：无效 2：有效 
	 */
	public String getUserStatus() {
		return userStatus;
	}
	/**
	 * 设置：用户头像url
	 */
	public void setHeadImgUrl(String headImgUrl) {
		this.headImgUrl = headImgUrl;
	}
	/**
	 * 获取：用户头像url
	 */
	public String getHeadImgUrl() {
		return headImgUrl;
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
