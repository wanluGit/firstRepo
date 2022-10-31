package com.example.demo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.demo.pojo.Member;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.pojo.MemberQuery;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wanlu
 * @since 2022-09-22
 */
public interface IMemberService extends IService<Member> {

    IPage<Member> getPageSer(MemberQuery query, int page, int size);


}
