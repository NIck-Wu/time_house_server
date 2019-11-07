package com.domain.dto;

import java.io.Serializable;
import java.util.List;

import com.domain.entity.CapsulesEntity;

/**
 * 数据传输对象
 *
 * @author
 * @version 1.0
 * @date 2019-11-06 15:34:31
 */
public class CapsulesDto extends CapsulesEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	/** 胶囊参与用户列表 */
	private List<MemberDto> memberLists;

	public List<MemberDto> getMemberLists() {
		return memberLists;
	}

	public void setMemberLists(List<MemberDto> memberLists) {
		this.memberLists = memberLists;
	}

}
