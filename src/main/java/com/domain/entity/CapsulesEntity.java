package com.domain.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author NIck
 * @date 2019-11-06 15:34:31
 */
public class CapsulesEntity implements Serializable {
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
	 * 用户ID
	 */
	private Integer userID;
	/**
	 * 胶囊标题
	 */
	private String capsuleTitle;
	/**
	 * 过期时间
	 */
	private Date expireTime;
	/**
	 * 心情记录
	 */
	private String notes;
	/**
	 * 视频URL
	 */
	private String videoUrl;
	/**
	 * 胶囊状态  1：未生效  2：已生效 3：已过期
	 */
	private String capsuleStatus;
	/**
	 * 是否分享视频  1：否 2：是
	 */
	private String isShare;
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
	 * 设置：胶囊标题
	 */
	public void setCapsuleTitle(String capsuleTitle) {
		this.capsuleTitle = capsuleTitle;
	}
	/**
	 * 获取：胶囊标题
	 */
	public String getCapsuleTitle() {
		return capsuleTitle;
	}
	/**
	 * 设置：过期时间
	 */
	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}
	/**
	 * 获取：过期时间
	 */
	public Date getExpireTime() {
		return expireTime;
	}
	/**
	 * 设置：心情记录
	 */
	public void setNotes(String notes) {
		this.notes = notes;
	}
	/**
	 * 获取：心情记录
	 */
	public String getNotes() {
		return notes;
	}
	/**
	 * 设置：视频URL
	 */
	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}
	/**
	 * 获取：视频URL
	 */
	public String getVideoUrl() {
		return videoUrl;
	}
	/**
	 * 设置：胶囊状态  1：未生效  2：已生效 3：已过期
	 */
	public void setCapsuleStatus(String capsuleStatus) {
		this.capsuleStatus = capsuleStatus;
	}
	/**
	 * 获取：胶囊状态  1：未生效  2：已生效 3：已过期
	 */
	public String getCapsuleStatus() {
		return capsuleStatus;
	}
	/**
	 * 设置：是否分享视频  1：否 2：是
	 */
	public void setIsShare(String isShare) {
		this.isShare = isShare;
	}
	/**
	 * 获取：是否分享视频  1：否 2：是
	 */
	public String getIsShare() {
		return isShare;
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
