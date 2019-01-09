package com.zht.swagger.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("获取角色信息请求参数")
public class ListRoleReq {
    /**
     * 签名
     */
    @ApiModelProperty(value="签名",required=true)
    private String signatures;
    /**
     * 系统
     */
    @ApiModelProperty(value="系统名",required=true)
    private String system;
    /**
     * 用户ID
     */
    @ApiModelProperty(value="用户Id",required=true)
    private String userId;

    public String getSignatures() {
        return signatures;
    }
    public void setSignatures(String signatures) {
        this.signatures = signatures;
    }
    public String getSystem() {
        return system;
    }
    public void setSystem(String system) {
        this.system = system;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    
}
