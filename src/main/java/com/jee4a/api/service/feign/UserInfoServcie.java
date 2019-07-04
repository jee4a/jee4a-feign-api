package com.jee4a.api.service.feign;

import org.springframework.cloud.openfeign.FeignClient;

import com.jee4a.api.service.feign.fallback.UserInfoServcieFallBack;
import com.jee4a.user.api.interfaces.UserApi;

/**
 * <p></p> 
 * @author tpeng 2018年1月29日
 * @email 398222836@qq.com
 */
@FeignClient(value="USER-SERVICE",fallback=UserInfoServcieFallBack.class)
public interface UserInfoServcie extends UserApi{

}
