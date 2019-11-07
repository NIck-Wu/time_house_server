package com.service;

import java.util.List;
import com.base.PageQueryBean;
import com.domain.dto.CapsulesDto;

/**
 * 
 *
 * @author
 * @version 1.0
 * @date 2019-11-06 15:34:31
 */
public interface CapsulesService {

	/**
	 * 根据主键查询表信息
	 *
	 * @param capsules
	 * @return
	 */
	public CapsulesDto findById(CapsulesDto capsules);

	/**
	 * 根据对象查询表信息
	 *
	 * @param capsules
	 * @return
	 */
	public CapsulesDto find(CapsulesDto capsules);

	/**
	 * 保存表信息
	 *
	 * @param capsules
	 * @return
	 */
	public void save(CapsulesDto capsules);

	/**
	 * 根据主键删除表信息
	 *
	 * @param capsules
	 */
	public void delete(CapsulesDto capsules);

	/**
	 * 根据主键修改表信息
	 *
	 * @param capsules
	 */
	public void update(CapsulesDto capsules);

	/**
	 * 查询所有表列表
	 *
	 * @param capsules
	 * @return
	 */
	public List<CapsulesDto> list(CapsulesDto capsules);

	/**
	 * 分页查询表信息
	 *
	 * @param capsules
	 */
	public PageQueryBean<CapsulesDto> showPageQuery(PageQueryBean<CapsulesDto> page);

	/**
	 * 根据用户选择过期时间确定价格
	 * 
	 * @param capsules
	 * @return
	 */
	public String queryTips(CapsulesDto capsules);

	/**
	 * 分页查询我的胶囊列表
	 * 
	 * @param page
	 * @return
	 */
	public PageQueryBean<CapsulesDto> pageQueryMyCapsules(PageQueryBean<CapsulesDto> page);
}
