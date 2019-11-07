package com.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.base.PageQueryBean;
import com.common.CommonEnum;
import com.common.ErrorCode;
import com.dao.CapsulesDao;
import com.dao.MemberDao;
import com.dao.UserDao;
import com.domain.dto.CapsulesDto;
import com.domain.dto.MemberDto;
import com.domain.dto.UserDto;
import com.exception.BusinessException;
import com.google.common.collect.Lists;
import com.service.CapsulesService;
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
public class CapsulesServiceImpl implements CapsulesService {

	@Autowired
	private CapsulesDao capsulesDao;
	@Autowired
	private UserDao userDao;
	@Autowired
	private MemberDao memberDao;

	/**
	 * 根据主键查询表信息
	 *
	 * @param capsules
	 * @return
	 */
	@Override
	public CapsulesDto findById(CapsulesDto capsules) {
		return capsulesDao.findById(capsules);
	}

	/**
	 * 根据对象查询表信息
	 *
	 * @param capsules
	 * @return
	 */
	@Override
	public CapsulesDto find(CapsulesDto capsules) {

		CapsulesDto result = capsulesDao.find(capsules);
		if (StringUtils.isEmptyObject(result)) {
			throw new BusinessException(ErrorCode.SYS_CAPSULES_DATA_NOT_FOUND.getCode(), ErrorCode.SYS_CAPSULES_DATA_NOT_FOUND.getDesc());
		}

		if (CommonEnum.DEFAULT_YES.getCode().equals(capsules.getIsShare())) {
			List<MemberDto> memberList = Lists.newArrayList();
			MemberDto memberDto = new MemberDto();
			memberDto.setCapsuleCode(capsules.getCapsuleCode());
			memberDto.setMemberStatus(CommonEnum.DEFAULT_YES.getCode());
			memberList = memberDao.list(memberDto);
			if (!StringUtils.isEmptyObject(memberList)) {
				result.setMemberLists(memberList);
			}
		}

		return result;
	}

	/**
	 * 保存表信息
	 *
	 * @param capsules
	 * @return
	 */
	@Override
	public void save(CapsulesDto capsules) {

		Integer userID = capsules.getUserID();
		UserDto userFind = userDao.findById(userID);
		if (StringUtils.isEmptyObject(userFind)) {
			throw new BusinessException(ErrorCode.SYS_USER_DATA_NOT_FOUND.getCode(), ErrorCode.SYS_USER_DATA_NOT_FOUND.getDesc());
		}

		// TODO
		capsules.setCapsuleCode(RandomUtil.random(20));// 之后用redis自增
		capsules.setCapsuleStatus(CommonEnum.CAPSULES_INEFFECTIVE.getCode());
		capsules.setIsShare(CommonEnum.DEFAULT_NO.getCode());
		capsules.setCreatTime(new Date());
		capsules.setLastUpdate(new Date());

		capsulesDao.save(capsules);
	}

	/**
	 * 根据主键删除表信息
	 *
	 * @param capsules
	 */
	@Override
	public void delete(CapsulesDto capsules) {
		capsulesDao.deleteById(capsules);
	}

	/**
	 * 根据主键修改表信息
	 *
	 * @param capsules
	 */
	@Override
	public void update(CapsulesDto capsules) {
		capsulesDao.editById(capsules);
	}

	/**
	 * 查询所有表列表
	 *
	 * @param capsules
	 * @return
	 */
	@Override
	public List<CapsulesDto> list(CapsulesDto capsules) {
		return capsulesDao.list(capsules);
	}

	/**
	 * 分页查询表信息
	 *
	 * @param capsules
	 */
	@Override
	public PageQueryBean<CapsulesDto> showPageQuery(PageQueryBean<CapsulesDto> page) {
		return capsulesDao.page(page);
	}

	/**
	 * 根据用户选择过期时间确定价格
	 */
	@Override
	public String queryTips(CapsulesDto capsules) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 分页查询我的胶囊列表
	 */
	@Override
	public PageQueryBean<CapsulesDto> pageQueryMyCapsules(PageQueryBean<CapsulesDto> page) {

		return capsulesDao.page("pageQueryMyCapsules", page, CapsulesDto.class);
	}

}
