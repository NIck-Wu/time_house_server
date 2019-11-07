package com.service;

import java.util.List;
import com.base.PageQueryBean;
import com.domain.dto.BannerDto;

/**
 * 
 *
 * @author
 * @version 1.0
 * @date 2019-11-06 15:34:31
 */
public interface BannerService {

	/**
	 * 根据主键查询表信息
	 *
	 * @param banner
	 * @return
	 */
	public BannerDto findById(BannerDto banner);

	/**
	 * 根据对象查询表信息
	 *
	 * @param banner
	 * @return
	 */
	public BannerDto find(BannerDto banner);

	/**
	 * 保存表信息
	 *
	 * @param banner
	 * @return
	 */
	public void save(BannerDto banner);

	/**
	 * 根据主键删除表信息
	 *
	 * @param banner
	 */
	public void delete(BannerDto banner);

	/**
	 * 根据主键修改表信息
	 *
	 * @param banner
	 */
	public void update(BannerDto banner);

	/**
	 * 查询所有表列表
	 *
	 * @param banner
	 * @return
	 */
	public List<BannerDto> list(BannerDto banner);

	/**
	 * 分页查询表信息
	 *
	 * @param banner
	 */
	public PageQueryBean<BannerDto> showPageQuery(PageQueryBean<BannerDto> page);

	/**
	 * 查询轮播图列表
	 *
	 * @param banner
	 */
	public List<BannerDto> queryBannerList(BannerDto banner);

	/**
	 * 查询首页小程序介绍图片
	 * 
	 * @param banner
	 * @return
	 */
	public BannerDto queryMainImage(BannerDto banner);
}
