package com.example.demo.controller;


import com.example.demo.service.IUsertestService;
import com.example.demo.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wanlu
 * @since 2022-09-21
 */
@RestController
@RequestMapping("/usertest")
public class UsertestController {
    @Autowired
    private IUsertestService usertestSer;

    @GetMapping("checkUser/{uname}/{password}")
    public Result checkUsertest(@PathVariable("uname") String username, @PathVariable("password")String password){
        if(usertestSer.checkUsertest(username,password)){
            return Result.success();
        }else{
            return Result.fail();
        }
    }

    @PostMapping("postCheckUser")
    public String checkUsertest2(String username, String password){
        if(usertestSer.checkUsertest(username,password)){
            return "success";
        }else{
            return "error";
        }
    }

    @GetMapping("checkUser/{uname}")
    public Result checkUsername(@PathVariable("uname") String username){
        if(usertestSer.checkUsername(username)){
            return Result.success();
        }else {
            return Result.fail();
        }
    }


}

