package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.base.PageQueryBean;
import com.base.ResponseResult;
import com.domain.dto.MemberDto;
import com.service.MemberService;


/**
 * 
 *
 * @author
 * @version 1.0
 * @date 2019-11-06 15:34:31
 */
@RestController
@RequestMapping("/api/member/member")
public class MemberController {

    @Autowired
    private MemberService memberService;




    /**
     * 查询对象
     *
     * @param member
     * @return
     */
    @RequestMapping(value = "find",method = RequestMethod.POST)
    public ResponseResult<MemberDto> find(@RequestBody MemberDto member){

        MemberDto result = memberService.find(member);

        return new ResponseResult<MemberDto>(result);
    }

    /**
	 * 保存对象
	 *
	 * @param member
	 */
    @RequestMapping(value = "save", method = RequestMethod.POST)
    public ResponseResult<MemberDto> save(@RequestBody MemberDto member) {

        memberService.save(member);

        return new ResponseResult<MemberDto>(member);
    }

    /**
     * 根据主键删除对象
     *
     * @param member
     */
    @RequestMapping(value = "delete", method = RequestMethod.POST)
    public ResponseResult<MemberDto> delete(@RequestBody MemberDto member) {

        memberService.delete(member);

        return new ResponseResult<MemberDto>();
    }


    /**
     * 根据主键修改
     *
     * @param member
     * @return
     */
    @RequestMapping(value = "update",method = RequestMethod.POST)
    public ResponseResult<MemberDto> pageQuery(@RequestBody MemberDto member){

            memberService.update(member);

        return new ResponseResult<MemberDto>();
    }

    /**
     * 查询列表
     *
     * @param member
     * @return
     */
    @RequestMapping(value = "list",method = RequestMethod.POST)
    public ResponseResult<List<MemberDto>> list(@RequestBody MemberDto member){

        List<MemberDto> result = memberService.list(member);

        return new ResponseResult<List<MemberDto>>(result);
    }

    /**
     * 分页查询
     *
     * @param memberPage
     * @return
    */
    @RequestMapping(value = "showPageQuery",method = RequestMethod.POST)
    public ResponseResult<PageQueryBean<MemberDto>> showPageQuery(@RequestBody PageQueryBean<MemberDto> memberPage){

        PageQueryBean<MemberDto> result = memberService.showPageQuery(memberPage);

        return new ResponseResult<PageQueryBean<MemberDto>>(result);
    }

}
