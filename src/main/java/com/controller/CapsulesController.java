package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.base.PageQueryBean;
import com.base.ResponseResult;
import com.domain.dto.CapsulesDto;
import com.helper.ValidateHelper;
import com.service.CapsulesService;

/**
 * 
 *
 * @author
 * @version 1.0
 * @date 2019-11-06 15:34:31
 */
@RestController
@RequestMapping("/api/capsules/capsules")
public class CapsulesController {

	@Autowired
	private CapsulesService capsulesService;

	/**
	 * 查询对象
	 *
	 * @param capsules
	 * @return
	 */
	@RequestMapping(value = "find", method = RequestMethod.POST)
	public ResponseResult<CapsulesDto> find(@RequestBody CapsulesDto capsules) {

		ValidateHelper.validateNull(capsules, new String[] { "id", "userID", "capsuleCode" });

		CapsulesDto result = capsulesService.find(capsules);

		return new ResponseResult<CapsulesDto>(result);
	}

	/**
	 * 保存对象
	 *
	 * @param capsules
	 */
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public ResponseResult<CapsulesDto> save(@RequestBody CapsulesDto capsules) {

		ValidateHelper.validateNull(capsules, new String[] { "userID", "capsuleTitle", "expireTime", "notes", "videoUrl" });

		capsulesService.save(capsules);

		return new ResponseResult<CapsulesDto>(capsules);
	}

	/**
	 * 根据主键删除对象
	 *
	 * @param capsules
	 */
	@RequestMapping(value = "delete", method = RequestMethod.POST)
	public ResponseResult<CapsulesDto> delete(@RequestBody CapsulesDto capsules) {

		capsulesService.delete(capsules);

		return new ResponseResult<CapsulesDto>();
	}

	/**
	 * 根据主键修改
	 *
	 * @param capsules
	 * @return
	 */
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public ResponseResult<CapsulesDto> pageQuery(@RequestBody CapsulesDto capsules) {

		capsulesService.update(capsules);

		return new ResponseResult<CapsulesDto>();
	}

	/**
	 * 查询列表
	 *
	 * @param capsules
	 * @return
	 */
	@RequestMapping(value = "list", method = RequestMethod.POST)
	public ResponseResult<List<CapsulesDto>> list(@RequestBody CapsulesDto capsules) {

		List<CapsulesDto> result = capsulesService.list(capsules);

		return new ResponseResult<List<CapsulesDto>>(result);
	}

	/**
	 * 分页查询
	 *
	 * @param capsulesPage
	 * @return
	 */
	@RequestMapping(value = "showPageQuery", method = RequestMethod.POST)
	public ResponseResult<PageQueryBean<CapsulesDto>> showPageQuery(@RequestBody PageQueryBean<CapsulesDto> capsulesPage) {

		PageQueryBean<CapsulesDto> result = capsulesService.showPageQuery(capsulesPage);

		return new ResponseResult<PageQueryBean<CapsulesDto>>(result);
	}

	/**
	 * 根据用户选择过期时间确定价格
	 * 
	 * @param capsules
	 * @return
	 */
	@RequestMapping(value = "queryTips", method = RequestMethod.POST)
	public ResponseResult<String> queryTips(@RequestBody CapsulesDto capsules) {

		String result = capsulesService.queryTips(capsules);

		return new ResponseResult<String>(result);
	}

	/**
	 * 我的胶囊分页查询
	 * 
	 * @param capsules
	 * @return
	 */
	@RequestMapping(value = "pageQueryMyCapsules", method = RequestMethod.POST)
	public ResponseResult<PageQueryBean<CapsulesDto>> pageQueryMyCapsules(@RequestBody PageQueryBean<CapsulesDto> page) {

		ValidateHelper.validateNull(page.getParameter(), new String[] { "userID" });

		PageQueryBean<CapsulesDto> result = capsulesService.pageQueryMyCapsules(page);

		return new ResponseResult<PageQueryBean<CapsulesDto>>(result);
	}
}
