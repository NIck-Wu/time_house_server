package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.base.PageQueryBean;
import com.common.ErrorCode;
import com.dao.UserDao;
import com.domain.dto.UserDto;
import com.exception.BusinessException;
import com.service.UserService;
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
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	/**
	 * 根据主键查询表信息
	 *
	 * @param user
	 * @return
	 */
	@Override
	public UserDto findById(UserDto user) {
		return userDao.findById(user);
	}

	/**
	 * 根据对象查询表信息
	 *
	 * @param user
	 * @return
	 */
	@Override
	public UserDto find(UserDto user) {

		UserDto result = userDao.find(user);
		if (StringUtils.isEmptyObject(result)) {
			throw new BusinessException(ErrorCode.SYS_USER_DATA_NOT_FOUND.getCode(), ErrorCode.SYS_USER_DATA_NOT_FOUND.getDesc());
		}

		return transfrom(result);
	}

	/**
	 * 保存表信息
	 *
	 * @param user
	 * @return
	 */
	@Override
	public void save(UserDto user) {
		userDao.save(user);
	}

	/**
	 * 根据主键删除表信息
	 *
	 * @param user
	 */
	@Override
	public void delete(UserDto user) {
		userDao.deleteById(user);
	}

	/**
	 * 根据主键修改表信息
	 *
	 * @param user
	 */
	@Override
	public void update(UserDto user) {
		userDao.editById(user);
	}

	/**
	 * 查询所有表列表
	 *
	 * @param user
	 * @return
	 */
	@Override
	public List<UserDto> list(UserDto user) {
		return userDao.list(user);
	}

	/**
	 * 分页查询表信息
	 *
	 * @param user
	 */
	@Override
	public PageQueryBean<UserDto> showPageQuery(PageQueryBean<UserDto> page) {
		return userDao.page(page);
	}

	/**
	 * 数据组装
	 * 
	 * @param user
	 * @return
	 */
	private UserDto transfrom(UserDto user) {
		UserDto result = new UserDto();
		result.setHeadImgUrl(user.getHeadImgUrl());
		result.setId(user.getId());
		result.setNickName(user.getNickName());
		result.setPhoneNumber(user.getPhoneNumber());

		return result;

	}
}
