package com.common;

/**
 * 公用错误代码枚举类
 * 
 * @date 2019年11月7日 下午2:57:06
 * @author NIck
 */
public enum ErrorCode {

	// 1001-1999 用户相关
	/** 获取用户信息失败 */
	SYS_USER_DATA_NOT_FOUND("th_system_1000", "获取用户信息失败 "),

	// 2000-2999 胶囊相关
	/** 获取胶囊信息失败 */
	SYS_CAPSULES_DATA_NOT_FOUND("th_system_2000", "获取胶囊信息失败 "),;

	private String code;

	private String desc;

	public String getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}

	private ErrorCode(String code, String desc) {
		this.code = code;
		this.desc = desc;
	}

}
