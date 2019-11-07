package com.service.impl;

import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.base.PageQueryBean;
import com.common.CommonEnum;
import com.dao.BannerDao;
import com.domain.dto.BannerDto;
import com.google.common.collect.Lists;
import com.service.BannerService;
import com.util.RandomUtil;
import com.util.StringUtils;

/**
 *
 * 表服务实现
 *
 * @author
 * @version 1.0
 * @date 2019-11-06 15:34:31
 */
@Service
@Transactional
public class BannerServiceImpl implements BannerService {

	@Autowired
	private BannerDao bannerDao;

	/**
	 * 根据主键查询表信息
	 *
	 * @param banner
	 * @return
	 */
	@Override
	public BannerDto findById(BannerDto banner) {
		return bannerDao.findById(banner);
	}

	/**
	 * 根据对象查询表信息
	 *
	 * @param banner
	 * @return
	 */
	@Override
	public BannerDto find(BannerDto banner) {
		return bannerDao.find(banner);
	}

	/**
	 * 保存表信息
	 *
	 * @param banner
	 * @return
	 */
	@Override
	public void save(BannerDto banner) {

		List<BannerDto> list = Lists.newArrayList();
		List<Integer> weightLists = Lists.newArrayList();
		list = list(new BannerDto());

		if (StringUtils.isEmptyObject(list)) {
			return;
		}

		for (BannerDto bannerDto : list) {
			weightLists.add(bannerDto.getWeight());
		}

		banner.setWeight(1);
		Collections.sort(weightLists);
		Integer bigWeightNow = weightLists.get(weightLists.size() - 1);
		Integer nextWeight = bigWeightNow + 1;

		banner.setBannerCode(RandomUtil.random(16));
		banner.setWeight(nextWeight);
		banner.setCreatTime(new Date());
		banner.setLastUpdate(new Date());

		bannerDao.save(banner);

	}

	/**
	 * 根据主键删除表信息
	 *
	 * @param banner
	 */
	@Override
	public void delete(BannerDto banner) {
		bannerDao.deleteById(banner);
	}

	/**
	 * 根据主键修改表信息
	 *
	 * @param banner
	 */
	@Override
	public void update(BannerDto banner) {
		bannerDao.editById(banner);
	}

	/**
	 * 查询所有表列表
	 *
	 * @param banner
	 * @return
	 */
	@Override
	public List<BannerDto> list(BannerDto banner) {

		banner.setIsMainPic(CommonEnum.DEFAULT_NO.getCode());

		return bannerDao.list(banner);
	}

	/**
	 * 分页查询表信息
	 *
	 * @param banner
	 */
	@Override
	public PageQueryBean<BannerDto> showPageQuery(PageQueryBean<BannerDto> page) {
		return bannerDao.page(page);
	}

	/**
	 * 查询轮播图列表
	 */
	@Override
	public List<BannerDto> queryBannerList(BannerDto banner) {
		banner.setIsMainPic(CommonEnum.DEFAULT_NO.getCode());
		List<BannerDto> list = Lists.newArrayList();
		list = list(banner);

		if (StringUtils.isEmptyObject(list)) {
			return null;
		}
		// 根据权重从小到大排序
		Collections.sort(list, new Comparator<BannerDto>() {
			@Override
			public int compare(BannerDto p1, BannerDto p2) {
				return p1.getWeight() == p2.getWeight() ? 0 : (p1.getWeight() < p2.getWeight() ? 1 : -1);
			}

		});
		return list;
	}

	/**
	 * 查询首页小程序介绍图片
	 */
	@Override
	public BannerDto queryMainImage(BannerDto banner) {

		banner.setIsMainPic(CommonEnum.DEFAULT_YES.getCode());

		return find(banner);
	}
}
