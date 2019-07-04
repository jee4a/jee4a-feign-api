package com.jee4a.api.service.feign.fallback;

import com.jee4a.user.api.interfaces.UserApi;
import com.jee4a.user.api.model.UserModel;

/**
 * @description 熔断返回
 * @author tpeng 2019年6月27日
 * @email 398222836@qq.com
 */
public class UserInfoServcieFallBack implements UserApi {

	@Override
	public String queryUserById(Integer id) {
		return "sorry : "+ id;
	}

	@Override
	public UserModel queryUserById1(Integer id) {
		return null ;
	}

}
