package com.jee4a.feign.api.service;

import org.springframework.cloud.openfeign.FeignClient;

import com.jee4a.feign.api.service.fallback.UserInfoServcieFallBack;
import com.jee4a.user.api.interfaces.UserApiServcie;

/**
 * <p></p> 
 * @author tpeng 2018年1月29日
 * @email 398222836@qq.com
 */
@FeignClient(value="USER-SERVICE",fallback=UserInfoServcieFallBack.class)
public interface UserInfoServcie extends UserApiServcie {

}
