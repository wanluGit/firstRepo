package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.pojo.Usertest;
import com.example.demo.mapper.UsertestMapper;
import com.example.demo.service.IUsertestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wanlu
 * @since 2022-09-21
 */
@Service
public class UsertestServiceImpl extends ServiceImpl<UsertestMapper, Usertest> implements IUsertestService {
    @Resource
    private UsertestMapper usertestMapper;

    @Override
    public boolean checkUsertest(String username, String password) {
        QueryWrapper<Usertest> queryWrapper=new QueryWrapper<Usertest>();
        queryWrapper.eq("username",username);
        queryWrapper.eq("password",password);
        if(usertestMapper.selectCount(queryWrapper)>0){
            return true;
        }else{
            return false;
        }

    }

    @Override
    public boolean checkUsername(String username) {
        QueryWrapper<Usertest> queryWrapper=new QueryWrapper<Usertest>();
        queryWrapper.eq("username",username);
        if(usertestMapper.selectCount(queryWrapper)>0){
            return true;
        }else{
            return false;
        }
    }


}
