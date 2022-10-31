package com.example.demo.service;

import com.example.demo.pojo.Usertest;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wanlu
 * @since 2022-09-21
 */
public interface IUsertestService extends IService<Usertest> {
    //查询用户名和密码是否存在
    boolean checkUsertest(String username,String password);
    //查询用户名是否存在
    boolean checkUsername(String username);
}
