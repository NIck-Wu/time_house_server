package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.base.PageQueryBean;
import com.dao.MemberDao;
import com.domain.dto.MemberDto;
import com.service.MemberService;


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
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberDao memberDao;

    /**
     * 根据主键查询表信息
     *
     * @param member
     * @return
     */
    @Override
    public MemberDto findById(MemberDto member){
        return memberDao.findById(member);
    }

    /**
     * 根据对象查询表信息
     *
     * @param member
     * @return
     */
    @Override
    public MemberDto find(MemberDto member){
        return memberDao.find(member);
    }

    /**
     * 保存表信息
     *
     * @param member
     * @return
     */
    @Override
    public void save(MemberDto member){
        memberDao.save(member);
    }

    /**
     * 根据主键删除表信息
     *
     * @param member
     */
    @Override
    public void delete(MemberDto member){
        memberDao.deleteById(member);
    }

    /**
     * 根据主键修改表信息
     *
     * @param member
     */
    @Override
    public void update(MemberDto member){
        memberDao.editById(member);
    }

    /**
     * 查询所有表列表
     *
     * @param member
     * @return
     */
    @Override
    public List<MemberDto> list(MemberDto member){
        return memberDao.list(member);
    }

    /**
     * 分页查询表信息
     *
     * @param member
     */
    @Override
    public PageQueryBean<MemberDto> showPageQuery(PageQueryBean<MemberDto> page){
        return memberDao.page(page);
    }

}
