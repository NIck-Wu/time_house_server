package com.domain.entity;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author NIck
 * @date 2019-11-06 15:34:31
 */
public class OrdersEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID
	 */
	private Integer id;
	/**
	 * 订单编号
	 */
	private String orderCode;
	/**
	 * 胶囊编号
	 */
	private String capsuleCode;
	/**
	 * 用户ID
	 */
	private Integer userID;
	/**
	 * 订单状态
	 */
	private String orderStatus;
	/**
	 * 支付状态  1：未支付 2：已支付 3：支付超时 4：用户取消 5：订单异常
	 */
	private String payStatus;
	/**
	 * 订单金额
	 */
	private BigDecimal orderAmount;
	/**
	 * 优惠券编号
	 */
	private String couponCode;
	/**
	 * 实际支付金额
	 */
	private BigDecimal realPayAmount;
	/**
	 * 支付完成时间
	 */
	private Date payFinishTime;
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
	 * 设置：订单状态
	 */
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	/**
	 * 获取：订单状态
	 */
	public String getOrderStatus() {
		return orderStatus;
	}
	/**
	 * 设置：支付状态  1：未支付 2：已支付 3：支付超时 4：用户取消 5：订单异常
	 */
	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}
	/**
	 * 获取：支付状态  1：未支付 2：已支付 3：支付超时 4：用户取消 5：订单异常
	 */
	public String getPayStatus() {
		return payStatus;
	}
	/**
	 * 设置：订单金额
	 */
	public void setOrderAmount(BigDecimal orderAmount) {
		this.orderAmount = orderAmount;
	}
	/**
	 * 获取：订单金额
	 */
	public BigDecimal getOrderAmount() {
		return orderAmount;
	}
	/**
	 * 设置：优惠券编号
	 */
	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}
	/**
	 * 获取：优惠券编号
	 */
	public String getCouponCode() {
		return couponCode;
	}
	/**
	 * 设置：实际支付金额
	 */
	public void setRealPayAmount(BigDecimal realPayAmount) {
		this.realPayAmount = realPayAmount;
	}
	/**
	 * 获取：实际支付金额
	 */
	public BigDecimal getRealPayAmount() {
		return realPayAmount;
	}
	/**
	 * 设置：支付完成时间
	 */
	public void setPayFinishTime(Date payFinishTime) {
		this.payFinishTime = payFinishTime;
	}
	/**
	 * 获取：支付完成时间
	 */
	public Date getPayFinishTime() {
		return payFinishTime;
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
