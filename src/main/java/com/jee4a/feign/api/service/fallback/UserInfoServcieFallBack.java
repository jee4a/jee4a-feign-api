package com.jee4a.feign.api.service.fallback;

import com.jee4a.feign.api.service.UserInfoServcie;
import com.jee4a.user.api.model.UserModel;

/**
 * @description 熔断返回
 * @author tpeng 2019年6月27日
 * @email 398222836@qq.com
 */
public class UserInfoServcieFallBack implements UserInfoServcie {

	@Override
	public String queryUserById(Integer id) {
		return "sorry : "+ id;
	}

	@Override
	public UserModel queryUserById1(Integer id) {
		return null ;
	}

}