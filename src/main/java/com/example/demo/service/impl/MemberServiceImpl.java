package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.pojo.Member;
import com.example.demo.mapper.MemberMapper;
import com.example.demo.pojo.MemberQuery;
import com.example.demo.service.IMemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wanlu
 * @since 2022-09-22
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements IMemberService {
    @Resource
    private MemberMapper memberMapper;

    public IPage<Member> getPageSer(MemberQuery query, int page, int size) {
        IPage<Member> ipage=new Page<Member>(page,size);
        ipage.setRecords(memberMapper.getPage(ipage,query));
        return ipage;
    }
}
