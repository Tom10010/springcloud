package com.zht.swagger.controller;

import com.zht.swagger.req.ListRoleReq;
import com.zht.swagger.response.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 角色
 * @author CalvinDai
 *
 * 2017年9月29日
 */
@Api(description="角色控制器")
@Controller("/role")
public class RoleController {

    /**
     * 查询角色
     */
    @ApiOperation(tags="获取所有角色信息",value="获取所有角色信息")
    @GetMapping("/listRole")
    @ResponseBody
    public Response listRole(){
        
        return Response.success("你好");
    }
}
