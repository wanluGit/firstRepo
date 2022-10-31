package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.demo.pojo.Member;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.pojo.MemberQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wanlu
 * @since 2022-09-22
 */
public interface MemberMapper extends BaseMapper<Member> {

    //根据查询条件，返回分页对象
    List<Member> getPage(IPage<Member> page, @Param("query")MemberQuery query);

}
