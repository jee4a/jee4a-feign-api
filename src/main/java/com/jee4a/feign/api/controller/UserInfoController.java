package com.jee4a.feign.api.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jee4a.feign.api.service.UserInfoServcie;
import com.jee4a.user.api.model.UserModel;

/**
 * <p></p> 
 * @author tpeng 2018年1月26日
 * @email 398222836@qq.com
 */
@RestController
public class UserInfoController {
	 
	 
	@Resource
	private UserInfoServcie userInfoService ;
	
	/**
	 * 负载均衡示例
	 * 描述     : 
	 * @author tpeng 2018年1月29日
	 * @email 398222836@qq.com
	 */
	@RequestMapping(value="/userinfo/{userId}",method = RequestMethod.GET)
	public String userInfo(@PathVariable Integer userId) {
		return  userInfoService.queryUserById(userId) ;
	}
	
	
	/**
	 * 
	 * 描述     : 断熔器
	 * @author tpeng 2018年1月29日
	 * @email 398222836@qq.com
	 */
	@RequestMapping(value="/userinfo-1/{userId}",method = RequestMethod.GET)
	public UserModel userInfo1(@PathVariable Integer userId) {
		return userInfoService.queryUserById1(userId) ;
	} 
}
