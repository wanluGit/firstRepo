package com.example.demo.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.demo.pojo.Member;
import com.example.demo.pojo.MemberQuery;
import com.example.demo.service.IMemberService;
import com.example.demo.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wanlu
 * @since 2022-09-22
 */
@RestController
@RequestMapping("/member")
public class MemberController {
    @Autowired
    private IMemberService memberSer;

    //添加员工
    //请求路径：http://localhost:8085/hello/member/addMember?id=80&name=张80&sex=男&age=24&salary=4000&department=生产部
    @PostMapping("/addMember")
    public Result addMember(Member member){
        if(memberSer.save(member)){
            return Result.success();
        }else{
            return Result.fail();
        }
    }

    //删除员工
    //http://localhost:8085/hello/member/80
    @DeleteMapping("/{id}")
    public Result delMember(@PathVariable("id")int id){
        if(memberSer.removeById(id)){
            return Result.success();
        }else{
            return Result.fail();
        }
    }

    //修改员工
    //请求路径：http://localhost:8085/hello/member/updateMember?id=80&name=张80&sex=男&age=24&salary=4000&department=生产部
    @PutMapping("/updateMember")
    public Result updateMember(Member member){
        if(memberSer.updateById(member)){
            return Result.success();
        }else{
            return Result.fail();
        }
    }

    //查询员工，根据员工卡号返回单个员工数据,没有数据时返回null
    //请求路径：http://localhost:8085/hello/member/getMember/2
    @GetMapping("/getMember/{id}")
    public Result getMember(@PathVariable("id") int id){
        Member member=memberSer.getById(id);
        if(member!=null){
            return Result.success(member);
        }else{
            return Result.fail();
        }
    }

    //查询分页
    //请求路径：http://localhost:8085/hello/member/getPage?sex=男&page=3&size=3
    @GetMapping("/getPage")
    public Result getPage(MemberQuery query,int page,int size){
        IPage<Member> ipage=memberSer.getPageSer(query,page,size);
        if(ipage!=null){
            return Result.success(ipage);
        }else{
            return Result.fail();
        }
    }




}

