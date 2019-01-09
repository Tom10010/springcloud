package com.zht.swagger.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Map;

/**
 * 请求返回结果
 * @author CalvinDai
 *
 * 2017年9月29日
 */
@ApiModel("响应结果")
public class Response {
    /**
     * 消息
     */
    @ApiModelProperty(value="返回消息")
    private String message;
    /**
     * 响应码
     */
    @ApiModelProperty(value="响应码")
    private int code;
    
    /**
     * 返回数据
     */
    @ApiModelProperty(value="返回数据")
    private Map<String,Object> data;
    
    /**
     * 添加返回信息
     * @param key
     * @param data
     */
    public void putData(String key ,Object data){
        this.data.put(key, data);
    }
    /**
     * 成功
     */
    public static  Response  success(String successMessage){
        Response response = new Response();
        response.setCode(100);
        response.setMessage(successMessage);
        return response;
    }
    /**
     * 失败
     * @param errorMessage
     * @return
     */
    public static Response fail(String errorMessage){
        Response response = new Response();
        response.setCode(400);
        response.setMessage(errorMessage);
        return response;
    }
    
    
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public Map<String, Object> getData() {
        return data;
    }
    public void setData(Map<String, Object> data) {
        this.data = data;
    }
}
