package com.common;

/**
 * 公共枚举
 * 
 * @date 2019年06月17日 下午2:57:06
 * @author NIck
 */
public enum CommonEnum {

	/** 否 默认值 */
	DEFAULT_NO("1", "否"),
	/** 是 默认值 */
	DEFAULT_YES("2", "是"),

	// 胶囊状态
	/** 未生效 */
	CAPSULES_INEFFECTIVE("1", "未生效"),
	/** 进行中 */
	CAPSULES_ING("2", "进行中"),
	/** 已过期 */
	CAPSULES_END("2", "已过期"),;

	private String code;

	private String desc;

	public String getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}

	private CommonEnum(String code, String desc) {
		this.code = code;
		this.desc = desc;
	}

}
