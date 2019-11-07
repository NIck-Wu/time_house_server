package com.domain.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author NIck
 * @date 2019-11-06 15:34:31
 */
public class BannerEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID
	 */
	private Integer id;
	/**
	 * 轮播图编号
	 */
	private String bannerCode;
	/**
	 * 轮播图名称
	 */
	private String bannerName;
	/**
	 * 轮播图地址
	 */
	private String bannerUrl;
	/**
	 * 权重
	 */
	private Integer weight;
	/**
	 * 是否介绍图 1：否 2：是
	 */
	private String isMainPic;
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
	 * 设置：轮播图编号
	 */
	public void setBannerCode(String bannerCode) {
		this.bannerCode = bannerCode;
	}

	/**
	 * 获取：轮播图编号
	 */
	public String getBannerCode() {
		return bannerCode;
	}

	/**
	 * 设置：轮播图名称
	 */
	public void setBannerName(String bannerName) {
		this.bannerName = bannerName;
	}

	/**
	 * 获取：轮播图名称
	 */
	public String getBannerName() {
		return bannerName;
	}

	/**
	 * 获取：轮播图地址
	 */
	public String getBannerUrl() {
		return bannerUrl;
	}

	/**
	 * 设置：轮播图地址
	 */
	public void setBannerUrl(String bannerUrl) {
		this.bannerUrl = bannerUrl;
	}

	/**
	 * 设置：权重
	 */
	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	/**
	 * 获取：权重
	 */
	public Integer getWeight() {
		return weight;
	}

	/**
	 * 设置：是否介绍图 1：否 2：是
	 */
	public void setIsMainPic(String isMainPic) {
		this.isMainPic = isMainPic;
	}

	/**
	 * 获取：是否介绍图 1：否 2：是
	 */
	public String getIsMainPic() {
		return isMainPic;
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
