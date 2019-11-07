package com.domain.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author NIck
 * @date 2019-11-06 15:34:31
 */
public class TransactionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID
	 */
	private Integer id;
	/**
	 * 交易编号
	 */
	private String transactionNO;
	/**
	 * 订单编号
	 */
	private String ordersNO;
	/**
	 * 支付类型 
	 */
	private String payType;
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
	 * 设置：交易编号
	 */
	public void setTransactionNO(String transactionNO) {
		this.transactionNO = transactionNO;
	}
	/**
	 * 获取：交易编号
	 */
	public String getTransactionNO() {
		return transactionNO;
	}
	/**
	 * 设置：订单编号
	 */
	public void setOrdersNO(String ordersNO) {
		this.ordersNO = ordersNO;
	}
	/**
	 * 获取：订单编号
	 */
	public String getOrdersNO() {
		return ordersNO;
	}
	/**
	 * 设置：支付类型 
	 */
	public void setPayType(String payType) {
		this.payType = payType;
	}
	/**
	 * 获取：支付类型 
	 */
	public String getPayType() {
		return payType;
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
