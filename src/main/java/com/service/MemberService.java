package com.service;

import java.util.List;
import com.base.PageQueryBean;
import com.domain.dto.MemberDto;

/**
 * 
 *
 * @author
 * @version 1.0
 * @date 2019-11-06 15:34:31
 */
public interface MemberService {


    /**
	 * 根据主键查询表信息
	 *
	 * @param member
	 * @return
	 */
    public MemberDto findById(MemberDto member);

    /**
	 * 根据对象查询表信息
	 *
	 * @param member
	 * @return
	 */
    public MemberDto find(MemberDto member);

    /**
	 * 保存表信息
	 *
	 * @param member
	 * @return
	 */
    public void save(MemberDto member);

    /**
	 * 根据主键删除表信息
	 *
	 * @param member
	 */
    public void delete(MemberDto member);

    /**
	 * 根据主键修改表信息
	 *
	 * @param member
	 */
    public void update(MemberDto member);

    /**
	 * 查询所有表列表
	 *
	 * @param member
	 * @return
	 */
    public List<MemberDto> list(MemberDto member);

    /**
     * 分页查询表信息
     *
     * @param member
     */
    public PageQueryBean<MemberDto> showPageQuery(PageQueryBean<MemberDto> page);
}

